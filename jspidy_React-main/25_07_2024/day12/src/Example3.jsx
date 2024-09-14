import { useState } from "react"
function Example3(){
    let [data,setData] = useState(true)
    let changeGender = () =>{
        setData(!data)
    }
    // let changePicture = () = {
    //     setPicture(!picture);
    // }
    return (
        <div>
            <h1>{data? "GIRL 👧": "BOY 👦"}</h1>
            <button onClick ={changeGender}>{data?"Female":"Male"}</button>
        </div>
    )
}
export default Example3;