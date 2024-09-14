import {useState } from "react"
// const data = ()=>[
//     {
//         gender:female,
//         type:girl,
//         emoji:'👧'
//     },
//     {
//         gender:male,
//         type:boy,
//         emoji:'👦'
//     }
// ]


const Example2=()=>{
    let [gender,setGender] = useState("male");
    let [emoji,setEmoji]= useState('👦');
    // let gender = useRef();
    // let type = useRef();
    function changeGender(){
        if(gender === "male"){
            setGender("female"); 
            setEmoji('👧')}
        else{ 
            setGender("male");
            setEmoji('👦');
        }
    }
    return(
        <div>
            <h1>{gender==="male"?"boy":"girl"} {emoji}</h1>
            <button onClick={changeGender}>{gender} {emoji}</button>
        </div>
    )
}
export default Example2;