import './App.css';

import {useRef} from "react";




function App() {

  let name = useRef();
  let ans = useRef();
  let cb = useRef();
  function coloringBack(e){
    // document.body.style.backgroundColor = e.target.value;
    document.body.style.backgroundColor = cb.current.value;
  }
  function change(){
    ans.current.innerText = name.current.value;
  }
  return (
    <div className="App">
        <input type='color' onChange={coloringBack} ref={cb}></input>
        <input type='range' min={0} max={100} ref={name} onChange={change}></input>
        <p ref={ans}>0</p>
    </div>
  );
}

export default App;
