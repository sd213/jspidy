import './App.css';
import {useRef} from "react";
function App() {
  let colorElement = useRef();
  // console.log(colorElement);
  // let value = useRef();
  let ans = useRef();

  function change(){
        document.body.style.backgroundColor =  colorElement.current.value; 
      
        ans.current.innerText =  colorElement.current.value;
     }
  return (
    <div className="App">
      <input type='color' ref={colorElement} onChange={change}></input>
      <p ref={ans}></p>
    </div>
  );
}

export default App;
