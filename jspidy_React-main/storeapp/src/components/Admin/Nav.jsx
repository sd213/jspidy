import React from 'react'
import {NavLink } from 'react-router-dom'


function Nav() {
  return (
    <div className="nav">
      <ul>
        <li>
            <NavLink to={"/adminPortal/"}>Home</NavLink>
        </li>
        <li>
            <NavLink to={"/adminPortal/about"}>About</NavLink>
        </li>
        <li>
            <NavLink to={"/adminPortal/products"}>products</NavLink>
        </li>
        <li>
            <NavLink to={"/adminPortal/contact"}>Contact</NavLink>
        </li>
        <li>
            <NavLink to={"/adminPortal/cart"}>🛒</NavLink>
        </li>
      </ul>
    </div>
  );
}

export default Nav 