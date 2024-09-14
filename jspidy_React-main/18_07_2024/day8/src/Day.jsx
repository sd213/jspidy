import { useState } from "react";

const Day = () => {
  let [greet, setGreet] = useState(true);
  console.log(greet);
  let handleGreet = () => {
    setGreet(!greet);
  };
  return (
    <div>
      <p>toggle example</p>
      <h4>{greet ? "good morning" : "good night"}</h4>
      <button onClick={handleGreet}>click me</button>
    </div>
  );
};

export default Day;
