import { useEffect, useState } from "react";

function Time2(){
    // let dt1 = new Date();
    const [time,setTime] = useState("");
    const [date,setDate] = useState("");
    // let dt1;
    useEffect(()=>{
        // setInterval(()=>{
        let dt1 = new Date();
        let tme = dt1.toLocaleTimeString();
        let dte = dt1.toLocaleDateString();
        setTime(tme);
        setDate(dte);
        console.log("hello"+time);
    // },100)
    })
    return(
        <div>
            <h1>USing Use effect()</h1>
            <p>Current time : {time} </p>
            <p>Current Date : {date} </p>
        </div>
    )
}
export default Time2;