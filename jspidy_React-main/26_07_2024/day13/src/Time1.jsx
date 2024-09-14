import { useState } from "react";

function Time1(){
    let dt = new Date();
    const [time,setTime] = useState(dt.toLocaleTimeString());
    const [date,setDate] = useState(dt.toLocaleDateString());
    setInterval(()=>{
        dt = new Date();
        setTime(()=> dt.toLocaleTimeString());
        setDate(()=> dt.toLocaleDateString());
    },100)
    return(
        <div>
            <p>Current time : {time} </p>
            <p>Current Date : {date} </p>
        </div>
    )
}
export default Time1;