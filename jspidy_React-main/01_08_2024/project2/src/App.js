import './App.css';
import {BrowserRouter,Route,Routes} from "react-router-dom";
import Login from './components/Login';
import AdminPortal from './components/Admin/AdminPortal';
import UserPortal from './components/User/UserPortal';
// import Home from './components/Home';
// import Users from './components/Users';

import { useState } from 'react';
function App() {
  // let random = Math.trunc(Math.random()*24506);
  const [logged,setLogged] = useState(false);
  const [userRole, setUserRole] = useState("");
  function loggedin(variable){
    setLogged(variable)
  }
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route
            element={
              <Login
                logged={logged}
                onLogin={loggedin}
                setUserRole={setUserRole}
              />
            }
            path="/"
          ></Route>

          <Route
            element={<AdminPortal logged={logged} userRole={userRole}  />}
            path={`/AdminPortal/*`}
          ></Route>

          <Route
            element={<UserPortal logged={logged} userRole={userRole}/>}
            path={`/UserPortal/*`}
          ></Route>
         
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
