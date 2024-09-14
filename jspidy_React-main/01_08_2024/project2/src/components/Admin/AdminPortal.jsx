import React from 'react'
import { useEffect } from 'react'
import { Route,Routes,useLocation } from 'react-router-dom'
import Home from '../Common/Home'
import UserDetails from './UserDetails'
import Users from './Users'
import About from './About'
import AdminNav from './AdminNav'
import hString from './HomeData'
import Footer from '../Common/Footer'

function AdminPortal({logged,userRole}) {
  useEffect(() => {
    if (userRole === "admin") {
      import("./Admin.css");
    } 
    // else {
    //   import("./user.css");
    // }
  }, [userRole]);
  const location = useLocation();
  const{data} = location.state||[];
  return (
    <>
      {logged ? (
        <>
          <AdminNav />
          <Routes>
            
            <Route element={<Home thing={hString.start} />} path="/" />
            <Route element={<Home thing={hString.start} />} path="/Home" />
            {/* <Route element={<OmdbMovie />} path="/omdbmovie" /> */}
            <Route element={<About />} path="/About" />
            <Route element={<Users thing={data}/>} path="/Users" />
            {/* <Route element={<UserLogin />} path="userLogin/:id" /> */}
            <Route element={<UserDetails />} path="userdetails/:id" />
          </Routes>
          <Footer />
        </>
      ) : (
        <h1>404 not found error</h1>
      )}
    </>
  );
}

export default AdminPortal