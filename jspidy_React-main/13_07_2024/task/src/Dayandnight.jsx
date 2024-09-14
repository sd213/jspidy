const Dayandnight = () => {
  let night = () => {
    document.querySelector("body").style.backgroundColor = "black";
    document.querySelector("label").style.color = "red";

    document.querySelector("h1").style.backgroundColor = "white";
  };
  let day = () => {
    document.querySelector("body").style.backgroundColor = "blue";
    document.querySelector("#a").style.color = "white";
  };
  return (
    <div>
      <h1 style={{ textAlign: "center" }}>Day and night theme</h1>
      <input type="radio" name="a" onClick={day} />{" "}
      <label htmlFor="">Day</label>
      <input type="radio" name="a" onClick={night} id="a" />{" "}
      <label htmlFor="">Night</label>
    </div>
  );
};
export default Dayandnight;
