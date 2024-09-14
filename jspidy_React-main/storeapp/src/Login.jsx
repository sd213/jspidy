import React, { useState,useRef } from 'react'
import {  useNavigate } from "react-router-dom";

function Login() {
    let nm = useRef();
    let ps = useRef()
     const [uname, setUname] = useState("");
     const [pass, setPass] = useState("");
     // const [data,setData] = useState([]);

     const nav = useNavigate();
     function SubmitTing(e) {
       e.preventDefault();

       if (uname === "som" && pass === "123") {
         setUname(() => "");
         setPass(() => "");
         //   onLogin(true);
         console.log("redirecting to Adminportal");
         //   setUserRole("admin");
         nav(`/adminPortal`);
         return;
       } else if (uname === "user" && pass === "12") {
         console.log("redirecting to userportal");
         nav(`/userPortal`);

         return;
       } else {
        //  console.log(nm);
        //  console.log(ps);
        //  console.log(nm.current.value);
        //  console.log(ps.current.value);
       }
     }
  return (
    <div className="formContainer">
      <form onSubmit={SubmitTing} method="post">
        <div className="fieldset">
          <label htmlFor="">User Name : </label>
          <input
            // ref={nm}
            type="text"
            name="user"
            // value={uname}
            placeholder="Enter Username"
            onChange={(e) => setUname(e.target.value)}
          />
        </div>
        <div className="fieldset">
          <label htmlFor="">Password : </label>
          <input
            // ref={ps}
            type="password"
            name="passw"
            // value={pass}
            placeholder="Enter Password"
            
            onChange={(e) => setPass(e.target.value)}
          />

        </div>
          <input type="submit" value="submit" />
      </form>
    </div>
  );
}

export default Login