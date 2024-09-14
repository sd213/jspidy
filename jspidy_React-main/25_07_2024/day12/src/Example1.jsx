import { useRef } from "react";
const Example1 = () =>{
    let data = useRef();
    let res = useRef();

    console.log(data.current);

    let print = (e) =>
    {
        e.preventDefault();
        let f = data.current[0].value;
        let s = data.current[1].value;
        console.log(data.current[0])
        console.log(data.current[1])

        res.current.innerHTML = `${f} ${s}`;
    }
    return (
        <div>
            <form ref={data}>
                <input type="text" placeholder=" Enter Fname "/>
                <br></br>
                <input type="text" placeholder=" Enter Lname" />
                <br></br>
                <button onClick={print}>submit</button> 
            </form>
            <h1 ref={res}>{}</h1>
        </div>
    )
}
export default Example1;