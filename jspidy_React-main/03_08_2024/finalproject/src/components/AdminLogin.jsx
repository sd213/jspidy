import React, { useRef } from 'react'
import {useNavigate} from "react-router-dom";

function AdminLogin() {
  let email = useRef();
  let pass = useRef();
  let nav = useNavigate();
  let login = (e)=>{
    e.preventDefault();
    if(email.current.value==="admin@gmail.com" && pass.current.value==="123"){
      nav("/adminportal")
    }else{
      alert("Entered Incorrect Credentials")
    }
  }
  return (
    // <div>AdminLogin</div>
    <div>
      <form onSubmit={login}>
        <div className="fieldtext">
          <label htmlFor="">Email : </label>
          <input type="text" placeholder="Enter Email" ref={email} />
        </div>
        {/* <br/><br/> */}
        <div className="fieldtext">
          <label>Password : </label>
          <input type="text" placeholder="Enter Password" ref={pass} />
        </div>
        {/* <br/><br/><br/> */}
        <button>login</button>
      </form>
    </div>
  );
}

export default AdminLogin