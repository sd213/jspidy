import React from 'react'
import {NavLink} from 'react-router-dom'

// import "./UserNav.css"
function UserNav() {
  return (
    <div className="header">
      
        <ul>
          <li>
            <NavLink to={`/UserPortal/Home`}>Home</NavLink>
          </li>
          <li>
            <NavLink to={`/UserPortal/Users`}>Users</NavLink>
          </li>
          <li>
            <NavLink to={`/UserPortal/About`}>About</NavLink>
          </li>
          <li>
            <NavLink to={`/UserPortal/UsersDetails`}>UsersDetails</NavLink>
          </li>
        </ul>
      </div>
    // </div>
  );
}

export default UserNav