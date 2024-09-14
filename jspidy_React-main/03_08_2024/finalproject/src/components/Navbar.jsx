import React from 'react'
import { NavLink, useLocation } from 'react-router-dom'
import "../style/Navbar.css";
function Navbar() {
  let loc = useLocation();
  console.log(loc); //{pathname:"/presentpath"}
  let path = loc.pathname.startsWith("/adminportal");//true false
  console.log(path)
  return (
    // <div>Navbar</div>
    <div className="Navigation">
      {path ? (
        <>
          <ul>
            <li>
              <NavLink to={"/adminportal/"}>Home</NavLink>
            </li>
            <li>
              <NavLink to={"/adminportal/about"}>About</NavLink>
            </li>
            <li>
              <NavLink to={"/adminportal/books"}>Books</NavLink>
            </li>
            <li>
              <NavLink to={"/adminportal/addbooks"}>Add Books</NavLink>
            </li>
            <li>
              <NavLink to={"/adminportal/users"}>Users</NavLink>
            </li>
            <li>
              <NavLink to={"/adminportal/adduser"}> ADD USER</NavLink>
            </li>
            <li>
              <NavLink to={"/adminportal/cart"}>🛒</NavLink>
            </li>
            <li>
              <NavLink to={"/"}>Log Out</NavLink>
            </li>
            {/* <li>
              <NavLink to={"/adminportal/addusers"}>Add Users</NavLink>
            </li> */}
          </ul>
        </>
      ) : (
        <>
          <ul>
            <li>
              <NavLink to={"/userportal/"}>Home</NavLink>
            </li>
            <li>
              <NavLink to={"/userportal/about"}>About</NavLink>
            </li>
            <li>
              <NavLink to={"/userportal/books"}>Books</NavLink>
            </li>
            <li>
              <NavLink to={"/userportal/cart"}>🛒</NavLink>
            </li>
            <li>
              <NavLink to={"/"}>Log Out</NavLink>
            </li>
          </ul>
        </>
      )}
    </div>
  );
}

export default Navbar