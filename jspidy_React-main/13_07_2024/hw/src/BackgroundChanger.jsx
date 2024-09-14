import "./common.css";
import OTPGenerator from "./OTPGenerator";
const BackgroundChanger = () => {
  return (
    <div>
      <nav className="bgprotector">
        <h1> Background Change</h1>
        <button className="btn1" onClick={bgChange}>
          Change Back
        </button>
        <p id="display"></p>
      </nav>
      <main>
        <OTPGenerator />
      </main>
    </div>
  );
};
function generatorrandom() {
  return Math.trunc(Math.random() * 256);
}
function generatorAlpharandom() {
  const a = Math.random() * 1;
  console.log(a);
  return a;
}
const bgChange = () => {
  document.querySelector(
    "body"
  ).style.backgroundColor = `rgba(${generatorrandom()},${generatorrandom()},${generatorrandom()},${generatorAlpharandom()})`;
  document.querySelector("#display").innerText =
    document.querySelector("body").style.backgroundColor;
};
export default BackgroundChanger;
