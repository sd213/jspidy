import { useState } from "react"

function Forms(){
    const [fname,setFname] = useState(""); 
    const [lname,setLname] = useState("");
    const [data,setData] = useState(""); 
    function changeData1(event){
        let x = event.target.value;
        console.log(x);
        setFname(x);
        
    }
    function changeData2(event){
        let x = event.target.value;
        console.log(x);
        setLname(x);
    }
    function captureData(event){
        event.preventDefault();
        setData(fname+" "+lname);
        setFname("");
        setLname("");
    }
    return(
        <div>
            <form action="" onSubmit={captureData}>
                <div className="container">
                    <input type="text" placeholder="Fname" 
                        onInput={changeData1} value={fname}
                    // onChange={changeData1} value={fname}

                    />
                    <input type="text" placeholder="lname" 
                    onInput={changeData2} value={lname}
                    // onChange={changeData2} value={lname}
                    />
                </div>
                <button>Print</button>
                <p>Full Name is : {data} </p>
            </form>
        </div>
    )


}
export default Forms