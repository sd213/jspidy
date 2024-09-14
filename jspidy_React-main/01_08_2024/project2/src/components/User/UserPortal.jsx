import React from "react";
import { useEffect } from "react";
import { Route, Routes, useLocation } from "react-router-dom";
import Home from "../Common/Home";
import UserDetails from "../Common/UserDetails";
import About from "../User/About";
// import Nav from "../User/Nav";
import UserNav from "./UserNav";
function UserPortal({ logged,userRole }) {
  useEffect(() => {
    
    if(userRole==='user'){
      import("./User.css");
    }
  }, [userRole]);
  const location = useLocation();
  // const { random } = location.state || {};
  return (
    <div>
      {logged ? (
        <>
          <UserNav />
          <Routes>
            <Route element={<Home />} path="/" />
            <Route element={<Home />} path="/Home" />
            <Route element={<About />} path="/About" />
            
            {/* <Route element={<UserLogin />} path="userLogin/:id" />  */}
            <Route element={<UserDetails />} path="userdetails/:id" />
          </Routes>
        </>
      ) : (
        <h1>404 not found error</h1>
      )}
    </div>
  );
}

export default UserPortal;
