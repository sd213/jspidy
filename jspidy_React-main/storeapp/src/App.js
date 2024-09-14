import './App.css';
import Login from './Login';
import { BrowserRouter,Route,Routes } from 'react-router-dom';
import AdminPortal from './components/Admin/AdminPortal';
import UserPortal from './components/User/UserPortal';
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route element={<Login/>} path='/'></Route>
          <Route element={<AdminPortal/>} path='/AdminPortal/*'></Route>
          <Route element={<UserPortal/>} path='/UserPortal/*'></Route>
        </Routes>
          {/* <Route element={<Login/>} path='/'></Route> */}
      </BrowserRouter>
      
    </div>
  );
}

export default App;
