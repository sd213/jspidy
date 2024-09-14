import "./ArrObjStyle.css";
const ArrayObj = () => {
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
          return (
            <div className="child" key={a.id}>
              <p> id : {a.id}</p>
              <p> name: {a.name}</p>
            </div>
          );
        })}
      </div>
    </>
  );
};
export default ArrayObj;
