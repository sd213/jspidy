import { useState } from "react";

const Name = () => {
  let [name, setName] = useState("Sita");
  console.log(name);

  let changeName = () => {
    setName("Ram");
    // setName(name === "Ram" ? "Sita" : "Ram");
  };
  return (
    <div>
      <h3>Hello {name}</h3>
      <button onClick={changeName}>click here</button>
    </div>
  );
};
export default Name;
