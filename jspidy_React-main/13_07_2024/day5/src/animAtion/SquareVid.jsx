import i3 from "./i3.mp4";
const SquareVid = () => {
  return (
    <div className="wholeContainer">
      <div className="showcase">
        <video src={i3} autoPlay loop muted className="vid"></video>
        <h1 className="title">Beyond</h1>
      </div>
      <h3>BYe Bye</h3>
    </div>
  );
};
export default SquareVid;
