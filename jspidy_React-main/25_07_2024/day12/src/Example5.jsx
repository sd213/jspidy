import {useState } from "react";
function Example5(){
    let [data,setData ] = useState(0)
    return(
       <div style={{display:"flex", width:'100%', justifyContent:"center",marginTop:100,alignItems:"center",gap:10}}>
            <button onClick={()=>data>=0?setData(data+1):""}> + </button>
            <p>{data}</p>
            <button onClick={()=>data>=1?setData(data-1):""}> - </button>
       </div> 
    )
}

export default Example5;