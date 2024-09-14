import { useRef } from "react"


function Calculator(){
    let display = useRef();
    console.log(display);
    console.log(display.current);
    let handleClick=(e)=>{
        // console.log(e.target.innerHTML);
        // if(e.target.innerText === "AC"){
        //     display.current.value="";
        // }
        
        if(e.target.innerText === "AC"){
            display.current.value="";
        }else if(e.target.innerText === "CE"){
            let s = display.current.value;
            console.log(s);
            let v=s.slice(0,s.length-1);
            display.current.value = v;
        }
        else if(e.target.innerText === "="){
            console.log(display.current.value);
            display.current.value = eval(display.current.value);
        }else{
            console.log(e.target.innerHTML);
        display.current.value = display.current.value + e.target.innerText ;
        }

    }

    return (
        <div>
            <h1>Calculator</h1>
            <table border={2}>
                <tr>
                    <th colSpan={4}><input type="text" placeholder="0" ref={display}></input></th>
                </tr>
                <tr>
                    <td onClick={handleClick}>AC</td>
                    <td onClick={handleClick}>CE</td>
                    <td onClick={handleClick}>/</td>
                    <td onClick={handleClick}>%</td>
                </tr>
                <tr>
                    <td onClick={handleClick}>1</td>
                    <td onClick={handleClick}>2</td>
                    <td onClick={handleClick}>3</td>
                    <td onClick={handleClick}>+</td>
                </tr>
                <tr>
                    <td onClick={handleClick}>4</td>
                    <td onClick={handleClick}>5</td>
                    <td onClick={handleClick}>6</td>
                    <td onClick={handleClick}>-</td>
                </tr>
                <tr>
                    <td onClick={handleClick}>7</td>
                    <td onClick={handleClick}>8</td>
                    <td onClick={handleClick}>9</td>
                    <td onClick={handleClick}>*</td>
                </tr>
                <tr>
                    <td onClick={handleClick}>0</td>
                    <td onClick={handleClick}>00</td>
                    <td onClick={handleClick}>.</td>
                    <td onClick={handleClick}> = </td>
                </tr>
                
            </table>
        </div>
    )
}
export default Calculator