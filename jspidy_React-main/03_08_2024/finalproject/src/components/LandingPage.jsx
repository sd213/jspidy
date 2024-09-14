import React, { useState } from 'react'
import AdminLogin from './AdminLogin'
import UserLogin from './UserLogin'
import "./Login.css"
function LandingPage() {
    let [login,setLogin] = useState(true);
    let log = ()=>{
        setLogin(!login)
    }
  return (
    // <div>LandingPage</div>
    <div className="login">
      <h1>{login ? "📖 Welcome to ADMIN LOGIN 📕" : "📙 Welcome to USER LOGIN📖"}</h1>
      <div className="container1">
      <div className="container">
        <button onClick={log}>{login ? "Admin Login" : "User Login"}</button>
      
        {login ? <AdminLogin /> : <UserLogin />}
      </div>
      </div>
    </div>
  );
}

export default LandingPage