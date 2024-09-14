import  {BrowserRouter,Route,Routes} from 'react-router-dom';
import './App.css';
import LandingPage from './components/LandingPage';
import AdminPortal from './components/Admin/AdminPortal';
import UserPortal from './components/User/UserPortal';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route element={<LandingPage/>} path='/'></Route>
          <Route element={<AdminPortal/>} path='/adminportal/*'></Route>
          <Route element={<UserPortal/>} path='/userportal/*'></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
