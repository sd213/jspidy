import "./ArrObjStyle.css";

const Destructure = () => {
  const darrobj = [
    {
      id: 1,
      name: "SD",
    },
    {
      id: 2,
      name: "javascript",
    },
    {
      id: 3,
      name: "java",
    },
    {
      id: 4,
      name: "c++",
    },
  ];
  return (
    <>
      <h1 className="greet">Nav Bar</h1>

      <div className="parent">
        {darrobj.map((a) => {
          let { id, name } = a;
          return (
            <div className="child">
              <p> id : {id}</p>
              <p> name: {name}</p>
            </div>
          );
        })}
      </div>
    </>
  );
};
export default Destructure;
