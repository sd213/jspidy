import {BrowserRouter} from "react-router-dom";
import { Route } from "react-router-dom";
import { Routes } from "react-router-dom";
import { Home} from "./Home";
import { Products } from "./Products";
import { Reviews } from "./Reviews";
import { Nav } from "./Nav";
function Path(){
    return(
        <>
            <BrowserRouter>
                <Nav/>
                <Routes>
                    <Route element={<Home/>} path="/"></Route>
                    <Route element={<Products/>} path="/Products"></Route>
                    <Route element={<Reviews/>} path="/Review"></Route>
                </Routes>
            </BrowserRouter>
        </>
    )
}
export default Path;