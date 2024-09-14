import React from 'react'
import {NavLink} from 'react-router-dom';
// import "./AdminNav.css"
function AdminNav({ }) {
  return (
    <div className="header">
      <ul>
        <li>
          <NavLink to={`/AdminPortal/Home`}>Home</NavLink>
        </li>
        <li>
          <NavLink to={`/AdminPortal/Articles`}>Articles</NavLink>
        </li>
        <li>
          <NavLink to={`/AdminPortal/Users`}>Users</NavLink>
        </li>
        <li>
          <NavLink to={`/AdminPortal/About`}>About</NavLink>
        </li>
        <li>
          <NavLink to={`/AdminPortal/UsersDetails`}>UsersDetails</NavLink>
        </li>
      </ul>
    </div>
    // </div>
  );
}

export default AdminNav;