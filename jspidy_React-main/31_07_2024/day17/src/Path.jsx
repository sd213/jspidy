import {BrowserRouter,Route,Routes} from "react-router-dom";
import Login from "./Login";
import Products from "./Products";
import Details from "./Details";
function Path(){
    return(
        <>
            <BrowserRouter>
                <Routes>
                    <Route element={<Login/>} path="/"></Route>
                    <Route element={<Products/>} path="/Products"></Route>
                    <Route element={<Details/>} path="/details/:id"></Route>
                </Routes>
            </BrowserRouter>
        </>
    )
}
export default Path;