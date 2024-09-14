import { useState } from "react"

const Forms = () =>{
    let [data1,setData1] = useState("sdmfdih")
    // let [data1,setData1] = useState("")
    let [data2,setData2] = useState("")
    let [value,setValue] = useState("")

    let handleData = (e) =>{
        let x = document.querySelector("input").value
        // let x = target.value
        setData1(x);
    }
    let handleData2 = (e) =>{
        // let x = document.querySelectorAll("input")[1].value
        let x = e.target.value
        setData2(x);
    }
     let changeValue = (e)=>{
        let x = e.target.value;
        setValue(data2);
        setData2("");
        
    }
    return(
        <>
            <h1>forms1</h1>
            {/* <input type="text" name="" placeholder=" Enter Name " onInput ={handleData} />  */}
            {/* here not value is mentioned so react don't control the value of current input element or set value to initial defined state */}
            <input type="text" name="" placeholder=" Enter Name " onInput ={handleData} value={data1}/>
            <p>my name is :{data1}</p>


            <h1>forms2</h1>
            <input type="text" name="" placeholder=" Enter Name " onInput ={handleData2} value={data2}/>
            <button onClick={changeValue}>Click here to print name</button>
            <p>my name is :{value}</p>



        </>
    )
}
export default Forms;