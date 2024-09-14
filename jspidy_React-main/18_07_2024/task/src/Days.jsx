const day = [
  "Monday",
  "Tuesday",
  "WednesDay",
  "Thursday",
  "Friday",
  "Saturday",
  "Sunday",
];

const Days = () => {
  return (
    <>
      <p className="changeDay"></p>
      <button
        onClick={() => {
          let randomNUm = Math.trunc(Math.random() * 7);
          console.log(randomNUm);
          document.querySelector(".changeDay").textContent = day[randomNUm];
        }}
      >
        Click Here
      </button>
    </>
  );
};
export default Days;
