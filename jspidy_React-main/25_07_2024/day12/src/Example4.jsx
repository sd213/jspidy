import { useState,useRef } from "react"
// import Example3 from "./Example3"


function Example4(){
    let[data,setData] =useState(true)
    let gen = useRef();

    let changeGender = () =>{
        setData(!data)
        let z = gen.current;
        z.innerHTML = (z.innerHTML === "GIRL 👧")?"BOY 👦":"GIRL 👧";

    }
    return (
        <div>
            <h1 ref={gen}>GIRL 👧</h1>
            <button onClick={changeGender}>{data?"Female":"Male"}</button>
        </div>
    )
}
export default Example4;