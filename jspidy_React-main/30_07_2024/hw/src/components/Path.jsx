import {BrowserRouter,Route,Routes} from "react-router-dom";

import Login from "./Login";
import Users from "./Users";
import Box from "./Box";
function Path({authenticate,onLoggedin}){
    return (
      <>
        <BrowserRouter>
            {/* <Nav/> */}
            <Routes>
                <Route element={<Login onLoggedin={onLoggedin}/>} path="/"></Route>
                <Route element={<Users/>}  path="/users" authenticate={authenticate} ></Route>
                <Route element={<Box/>} path="/Review"></Route>
            </Routes>
        </BrowserRouter>
      </>
    );
}
export default Path;