import { useState } from 'react';
import './App.css';
import Path from './components/Path';
function App() {
  const [authenticate,setAuthenticate] = useState(false);

  return (
    <div className="App">
      <Path authenticate={authenticate} onLoggedin={setAuthenticate}/>
    </div>
  );
}

export default App;
