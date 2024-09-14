import React, { useRef } from 'react'
import { useNavigate } from "react-router-dom";
function UserLogin() {
  let email = useRef();
  let pass = useRef();
  let nav = useNavigate();
  let login = (e) => {
    e.preventDefault();
    if (
      email.current.value === "user@gmail.com" &&
      pass.current.value === "098"
    ) {
      nav("/userportal");
    } else {
      alert("Entered Incorrect Credentials");
    }
  };
  return (
    // <div>UserLogin</div>
    <div>
      <form action="" onSubmit={login}>
        <div className="fieldtext">
          <label htmlFor="">Email : </label>
          <input type="text" placeholder="Enter Email" ref={email} />
        </div>
        {/* <br/><br/> */}
        <div className="fieldtext">
          <label>Password : </label>
          <input type="text" placeholder="Enter Password" ref={pass} />
        </div>
        <button>login</button>
      </form>
    </div>
  );
}

export default UserLogin