import React, { useRef } from "react";
import { useNavigate } from "react-router-dom";

const AddUser = () => {
  let first = useRef();
  let last = useRef();
  // let age = useRef();
  // let 
  let mail = useRef();
  let confirmpass = useRef();
  let pass = useRef();

  let nav = useNavigate();
  function f1(e) {
    e.preventDefault();
     if (
       first.current.value != null ||
       last.current.value != null ||
       mail.current.value != null ||
       pass.current.value != null
     ) {
          if(pass.current.value === confirmpass.current.value){
            let newUser = {
              firstName: first.current.value,
              lastName: last.current.value,
              email: mail.current.value,
              pass: pass.current.value
            };
            fetch("http://localhost:4000/users", {
              method: "POST",
              body: JSON.stringify(newUser),
            });
            alert("user added ");

            nav("/adminportal/users");
         }
         else{
            alert("passwords are not matching");
         }
         
     }
     else{
      alert("form is incomplete");
     }
  }

  return (
    <div className="addusers">
      <h1>add Users Here </h1>
      <form action="" onSubmit={f1}>
        <div className="inputfield">
          <label htmlFor="">Enter First Name : </label>
          <input type="text" placeholder="entre first name" ref={first} />
        </div>
        <div className="inputfield">
          <label htmlFor="">Enter Last Name : </label>
          <input type="text" placeholder="enter last name" ref={last} />
        </div>
        <div className="inputfield">
          <label htmlFor="">Enter Email : </label>
          <input type="text" placeholder="enter email" ref={mail} />
        </div>
        <div className="inputfield">
          <label htmlFor="">Enter Password : </label>
          <input
            type="password"
            placeholder="enter password"
            ref={confirmpass}
          />
        </div>
        <div className="inputfield">
          <label htmlFor="">Confirm Password : </label>
          <input type="text" placeholder="enter password" ref={pass} />
        </div>

        <button>click here to add a user</button>
      </form>
    </div>
  );
};

export default AddUser;
