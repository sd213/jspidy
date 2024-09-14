import { useState } from "react";

const Bulb = () => {
  let [turn, setTurn] = useState("off");
  let [image, setImage] = useState("lightoff.png");

  // let name;
  const changeImg = () => {
    setTurn(turn === "off" ? "on" : "off");
    setImage(image === "lightoff.png" ? "lighton.png" : "lightoff.png");
  };
  return (
    <div>
      <img src={image} alt="" className="changeImg" width={200} />
      <p className="changeText">The Ball is {turn}</p>
      <button onClick={changeImg}>{turn}</button>
    </div>
  );
};
export default Bulb;
