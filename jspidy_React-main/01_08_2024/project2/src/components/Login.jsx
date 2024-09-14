import { useState,useRef, useEffect } from "react";
import { Routes,Route, useNavigate } from "react-router-dom";
import "./login.css";
import data2 from "../Data";
// import { }
// import Home from "./Home";
import AdminPortal from "./Admin/AdminPortal";
import UserPortal from "./User/UserPortal";
export default function Login({ logged, onLogin, setUserRole }) {
  const [uname, setUname] = useState("");
  const [pass, setPass] = useState("");
  // const [data,setData] = useState([]);

  const nav = useNavigate();
  useEffect(() => {
    // let d= fetch("https://jsonplaceholder.typicode.com/users")
    //   .then((response) => response.json())
    //   .then((json) => json);
    //   setData(d);
    //   console.log(data)
    // async function fetching(){
    //   let a = await fetch("https://jsonplaceholder.typicode.com/users");
    //   let d = await a.json();
    //   return d;
    // }
    // let dt = await fetching();
    // console.log(dt);
    // setData(dt);
    // console.log(data);
    // async function ApiFetching() {
    //   const response = await fetch("https://jsonplaceholder.typicode.com/users"
    //   );
    //   const dt = await response.json();
    //   console.log(dt);
    //   setData(dt);
    // }
    // ApiFetching();
  }, []);
  function SubmitTing(e) {
    e.preventDefault();

    if (uname === "som" && pass === "123") {
      setUname(() => "");
      setPass(() => "");
      onLogin(true);
      console.log("redirecting to Adminportal");
      setUserRole("admin");
      nav(`/AdminPortal`, { state: { data: data2 } });
      return;
    } else {
      const userData = data2.filter((user) => user.username === uname);
      console.log(userData[0]);
      if (pass === userData[0].password) {
        console.log("redirecting to userportal");
        setUserRole("user")
        nav(`/UserPortal`,{ state: { data: userData } });
      }
      return;
    }
  }

  return (
    <div className="formContainer">
      <form onSubmit={SubmitTing} method="post">
        <div className="fieldset">
          <label htmlFor="">User Name : </label>
          <input
            type="text"
            name="user"
            value={uname}
            placeholder="Enter Username"
            onChange={(e) => setUname(e.target.value)}
          />
          <label htmlFor="">Password : </label>
          <input
            type="password"
            name="passw"
            value={pass}
            placeholder="Enter Password"
            onChange={(e) => setPass(e.target.value)}
          />
          {/* </div> */}
          <input type="submit" value="submit" />
          {/* </div> */}
        </div>
      </form>
    </div>
  );
}