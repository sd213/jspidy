import "./Gal.css";
import im1 from "./bear.png";
import im2 from "./bridge.png";
import im3 from "./canal.png";
import im4 from "./choco.png";
import im5 from "./cat.png";
import im6 from "./chrys.png";
const Gal = () => {
  return (
    <div className="rt">
      <nav>
        <h1>Image Gallery</h1>
      </nav>
      <main>
        <div className="img">
          <img src={im1} alt="" />
        </div>
        <div className="img">
          <img src={im2} alt="" />
        </div>
        <div className="img">
          <img src={im3} alt="" />
        </div>
        <div className="img">
          <img src={im4} alt="" />
        </div>
        <div className="img">
          <img src={im5} alt="" />
        </div>
        <div className="img">
          <img src={im6} alt="" />
        </div>
      </main>
    </div>
  );
};
export default Gal;
