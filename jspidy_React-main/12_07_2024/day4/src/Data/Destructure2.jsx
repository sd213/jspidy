import { data } from "./deArrayObjdata";
import "./ArrObjStyle.css";
const Destructure2 = () => {
  return (
    <>
      <h1 className="greet">Nav Bar</h1>

      <div className="parent">
        {data.map((a) => {
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
export default Destructure2;
