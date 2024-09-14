import React, { useEffect, useRef, useState } from "react";
import { useNavigate,useParams } from "react-router-dom";

function Update(){
    const para = useParams();
    // let [data,setData] = useState({});
    // let first = useRef();
    let [first,setFirst] = useState(null);
    // let last = useRef();
    let [last,setLast] = useState(null);
//   let age = useRef();
//   let mail = useRef();
    let[mail,setMail] = useState(null);

  let confirmpass = useRef();
    // let[]
//   let pass = useRef();
    let [pass,setPass] = useState("");
  let nav = useNavigate();

  useEffect(()=>{
      fetching();
      async function fetching() {
        let dt = await fetch(`http://localhost:4000/users/${para.id}`);

        let dt2 = await dt.json();
        // setData(() => dt2);
        setFirst(()=>dt2.firstName);
        setLast(()=>dt2.lastName);
        setMail(()=>dt2.email);
        
      }
    //   const fetchBooks = () => {
    //     fetch(`http://localhost:4000/${users}/`)
    //       .then((response) => response.json())
    //       .then((data) => setCart(data))
    //       .catch((error) => console.error("Error fetching book:", error));
    //   };
    //   fetchBooks();
  },[para.id])

  function f1(e) {
    e.preventDefault();
     if (
       first != null ||
       last  != null ||
       mail != null ||
       pass != null
     ) {
        console.log(confirmpass.current.value);
        console.log(pass);
          if(pass === confirmpass.current.value){
            let updateUser = {
              firstName: first,
              lastName: last,
              email: mail,
              pass: pass
            };
            fetch("http://localhost:4000/users/"+para.id, {
              method: "PUT",
              body: JSON.stringify(updateUser),
            });
            alert("user updated");

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
      <h1>Update User Here </h1>
      <form action="" onSubmit={f1}>
        <div className="inputfield">
          <label htmlFor="">Enter First Name : </label>
          <input type="text" placeholder="enter first name" value={first} onChange={(e)=>setFirst(e.target.value)}/>
        </div>
        <div className="inputfield">
          <label htmlFor="">Enter Last Name : </label>
          <input type="text" placeholder="enter last name" value={last} onChange={(e)=>setLast(e.target.value)} />
        </div>
        <div className="inputfield">
          <label htmlFor="">Enter Email : </label>
          <input type="text" placeholder="enter email" value={mail} onChange={(e)=>setMail(e.target.value)}/>
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
          <input type="text" placeholder="enter password" value={pass} onChange={(e)=>setPass(e.target.value)}/>
        </div>

        <button>click here to Update user</button>
      </form>
    </div>
  );
    // return<></>   
}
export default Update;