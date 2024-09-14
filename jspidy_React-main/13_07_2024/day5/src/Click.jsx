import DayNight from "./dayNight/DayNight";
import SquareVid from "./animAtion/SquareVid";
const Click = () => {
  function f1() {
    alert("Hello Welcome");
  }
  const f2 = () => {
    alert("Good morning");
  };
  const para = (name) => {
    console.log(`hello dear ${name}`);
  };
  //   let button = document.querySelector(".sd");
  //     button.addEventListener("click", f1);
  return (
    <div>
      <h1 style={{ textAlign: "center" }}>Event Handler</h1>
      <button onClick={f1}>Click Here for Greetings</button>
      <button onClick={f2}>Click again</button>
      <button
        onClick={() => {
          alert("Good Morning again");
        }}
      >
        third time
      </button>
      <button
        onClick={() => {
          para("rama");
        }}
      >
        with para
      </button>
      <h2 style={{ textAlign: "center" }}>Day and Night</h2>
      <DayNight />
      <SquareVid />
    </div>
  );
};
export default Click;
