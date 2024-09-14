import {useRef} from "react"
const ExampleRef = () =>{
    let fname = useRef();
    //console.log(fname); //object
    console.log(fname.current);// <input type="text" placeholder="first name" ref={fname}/>

    let lname = useRef();
    //console.log(lname); //object

    console.log(lname.current); //<input type="text" placeholder="sec name" ref={lname} />

    let ans = useRef();
    console.log(ans.current); //<h1 ref = {ans}></h1>
    
    let print = () =>{
        let x = fname.current.value
        let y = lname.current.value
        ans.current.innerHTML = ` my full name is ${x} ${y}`
    }
    return (
        <>
            <input type="text" placeholder="first name" ref={fname} />
            <br/>
            <br/>
            <input type="text" placeholder="sec name" ref={lname}/>
            <br/>
            <br/>
            <button onClick={print}>print</button>
            <h1 ref={ans}> </h1>

        </>
    )
}
export default ExampleRef;