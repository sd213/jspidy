import "./Gal.css";
import im1 from "./bear.png";
import im2 from "./bridge.png";
import im3 from "./canal.png";
import im4 from "./choco.png";
import im5 from "./cat.png";
import im6 from "./chrys.png";
const img = [im1, im2, im3, im4, im5, im6];
const Datamap = () => {
  return (
    <div className="rt">
      <nav>
        <h1>Image Gallery</h1>
      </nav>
      <main>
        {img.map((elem) => {
          return (
            <div className="img">
              <img src={elem} alt="" />
            </div>
          );
        })}
      </main>
    </div>
  );
};

export default Datamap;
