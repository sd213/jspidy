import data from "./data.jsx";
import "./redalert.css";
export const Details = () => {
  return (
    <>
      <nav className="header">
        <h1 className="detailhdr">Details</h1>
      </nav>
      <main>
        {data.map((elem) => {
          const name = elem.name;
          const place = elem.place;
          return (
            <div>
              <p className="para">
                my name is {name} and from {place}
              </p>
              <button
                onClick={() => {
                  alert(`my name is ${name} and from ${place}`);
                }}
              >
                click here
              </button>
            </div>
          );
        })}
      </main>
    </>
  );
};
