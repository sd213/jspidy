import "./dark.css";
// const day = 1;
const dN = () => {
  document.querySelector("body").classList.toggle("dkbody");
  document.querySelector("h1").classList.toggle("headings");
  document.querySelector("h2").classList.toggle("headings");
  const btns = document.querySelectorAll("button");
  console.log(btns);
  for (let i = 0; i < 5; i++) {
    btns[i].classList.toggle("buttons");
  }
};
const DayNight = () => {
  return (
    <>
      <button onClick={dN}>DayNight</button>
    </>
  );
};
export default DayNight;
