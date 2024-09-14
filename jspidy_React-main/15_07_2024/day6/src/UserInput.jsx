import "./UserInput.css";
let name, age;
export const UserInput = () => {
  return (
    <div>
      <div className="container1">
        <label htmlFor="">Enter Name</label>
        <input type="text" required className="tex"></input>
        <button onClick={takename}>Enter</button>
      </div>
      <div className="container2 hide">
        <label htmlFor="">Enter Age</label>
        <input type="text" required className="ag"></input>
        <button onClick={takeAge}>Enter</button>
      </div>
      <p className="display"></p>
    </div>
  );
};
function takename() {
  document.querySelector(".container1").classList.toggle("hide");
  document.querySelector(".container2").classList.toggle("hide");
  name = document.querySelector(".tex").value;
  console.log(name);
}
function takeAge() {
  document.querySelector(".container2").classList.toggle("hide");
  age = Number(document.querySelector(".ag").value);
  console.log(age);
  document.querySelector(
    ".display"
  ).innerText = `Your Name is ${name} and Your Age is ${age} `;
}
