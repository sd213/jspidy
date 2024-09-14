import { useEffect,useState } from "react";

const Time3 =() =>{
    let [time,setTime]=useState({})
    useEffect(()=>{
        setInterval(()=>{
            let data = new Date();
            let valu = {
                x: data.toLocaleDateString(),
                y: data.toLocaleTimeString()
            }
            //console.log(data.toLocalDateString());
            //console.log(data.toLocaleTimeString());
            setTime(valu);
        },1000)
        console.log(time);
    },[time])
    return(
        <>
            <p>{time.x} {time.y}</p>
        </>
    )
}
export default Time3;