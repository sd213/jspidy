import React from 'react'
import {Route,Routes} from 'react-router-dom'
// import Data from '../Data'
import Home from "./Home";
import About from "./About";
import Contact from "./Contact";
import Products from '../Products';
import Cart from '../Cart';
import "./Admin.css";
// import Image
import Nav from './Nav'
import Product from '../Product';
function AdminPortal() {
  return (
    <div className='admin'>
      <Nav />
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path='/products' element={<Products/>} />
        <Route exact path="/about" element={<About />} />
        <Route exact path="/contact" element={<Contact />} />
        <Route exact path="/cart" element={<Cart />} />
        <Route exact path="/product/:id" element={<Product />} />
      </Routes>

      {/* <Data/> */}
    </div>
  );
}

export default AdminPortal