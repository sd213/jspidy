import React from 'react'
import { Route,Routes } from 'react-router-dom';
import Home from '../Home';
import About from '../About';
import Books from '../Books';
import AddBooks from './AddBooks';
import Users from './Users';
import AddUser from './AddUser';
import Update from './Update';
import ReadBook from '../ReadBook';
import Cart from '../Cart';
import Navbar from '../Navbar';
import Footer from '../Footer';

import "../../style/CommonPortal.css";
import "./Admin.css";


function AdminPortal() {
  return (
    // <div>AdminPortal</div>
    <>
      <Navbar/>
      <Routes>
        <Route element={<Home/>} path='/'></Route>
        <Route element={<About/>} path='/about'></Route>
        <Route element={<Books/>} path='/books'></Route>
        <Route element={<AddBooks/>} path='/addbooks'></Route>
        <Route element={<Users/>} path='/users'></Route>
        <Route element={<AddUser/>} path='/adduser'></Route>
        <Route element={<Update/>} path='/update/:id'></Route>
        <Route element={<ReadBook/>} path='/readbook/:id'></Route>
        <Route element={<Cart/>} path='/cart'></Route>
      </Routes>
      <Footer/>
    </>
  )
}

export default AdminPortal