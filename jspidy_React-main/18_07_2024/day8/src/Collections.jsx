import { useState } from "react";

const Collections = () => {
  let [value, setValue] = useState(0);

  const increment = () => {
    setValue(++value);
  };
  const decrement = () => {
    value === 0 ? alert("You can't decrement anymore") : setValue(--value);
  };
  const reset = () => {
    setValue(0);
  };
  return (
    <div>
      <p>{value}</p>
      <div className="buttons">
        <button onClick={increment}>increment</button>
        <button onClick={decrement}>decrement</button>
        <button onClick={reset}>reset</button>
      </div>
    </div>
  );
};
export default Collections;
