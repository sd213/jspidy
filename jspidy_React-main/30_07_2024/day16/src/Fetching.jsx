import { useEffect, useState } from "react";

function Fetching(){
    let[data,setData] = useState(null);
    useEffect(()=>{
        let fetchapi= fetch("https://jsonplaceholder.typicode.com/users");
        console.log(fetchapi);
        let first = fetchapi.then((res)=>{
            return res.json();
        })
        console.log(first);
        let second  = first.then((sec)=>{
            return sec;
        })
        console.log(second);
        let third  = first.then((thir)=>{
            console.log(thir);
            setData(thir);
            return thir;
        })
        console.log(third);
        
    },[])
     
    if (!data) {
        return <div>Loading...</div>;
    }
    function iterating(object){
        let obj = {}
        for (let key in object) {
            // <div>${key}: ${object[key]}</div>;
            obj.push({key:object[key]});
        }
        // return `[ ]`
        return obj
    }
    return(
        <div>
            {data.map((user, index) => (
                <div key={index}>
                    <h1>{user.name}</h1>
                    <p>Email: {user.email}</p>
                    <p>Username: {user.username}</p>
                    <p>Phone: {user.phone}</p>
                    <p>Website: {user.website}</p>
                    <div>
                        <strong>Address:</strong>
                        <p>{user.address.street}, {user.address.suite}, {user.address.city}, {user.address.zipcode}</p>
                    </div>
                    <div>
                        <strong>Company:</strong>
                        <p>{user.company.name}</p>
                        <p>{user.company.catchPhrase}</p>
                        <p>{user.company.bs}</p>
                    </div>
                    {/* {iterating(user)} */}
                </div>
            ))}
        </div>
    )
}
export default Fetching