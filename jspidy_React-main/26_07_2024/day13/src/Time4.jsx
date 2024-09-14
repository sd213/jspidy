import { useEffect,useState } from "react";

const Time4 =() =>{
    let [time,setTime]=useState({})
    useEffect(()=>{
       
            let data = new Date();
            let valu = {
                x: data.toLocaleDateString(),
                y: data.toLocaleTimeString()
            }
            //console.log(data.toLocalDateString());
            //console.log(data.toLocaleTimeString());
            setTime(valu);
        
        console.log(time);
    },[time])
    return(
        <>
            <p>{time.x} {time.y}</p>
        </>
    )
}
export default Time4;