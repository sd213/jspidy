import "./childStyle.css";
const Child = (prop) => {
  return (
    <>
      <div className="main">
        <div className="title">
          <h1>{prop.title}</h1>
        </div>
        <div className="img">
          <img src={prop.image} alt="" />
        </div>
        <div className="info">
          <p>{prop.info}</p>
        </div>
      </div>
    </>
  );
};
export default Child;
