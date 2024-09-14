import React from 'react'
import { Route,Routes } from 'react-router-dom'
import Home from '../Home'
import About from '../About'
import Books from '../Books'
import Navbar from '../Navbar'
import Footer from "../Footer";
import ReadBook from '../ReadBook'
import Cart from '../Cart'
import "../../style/CommonPortal.css";
import "./User.css";
function UserPortal() {
  return (
    // <div>UserPortal</div>
    <>
      <Navbar />
      <Routes>
        <Route element={<Home />} path="/"></Route>
        <Route element={<About />} path="/about"></Route>
        <Route element={<Books />} path="/books"></Route>
        <Route element={<Cart />} path="/cart"></Route>
        <Route element={<ReadBook />} path="/readbook/:id"></Route>
      </Routes>
      <Footer />
    </>
  );
}

export default UserPortal