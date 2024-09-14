import "./Demo.css";
import pit from "./pitbull.png";
import stp from "./StyleProperties.js";
const im =
  "https://cdn.pixabay.com/photo/2024/06/26/14/02/moon-8855057_960_720.jpg";
const Demo = () => {
  const inline = {
    color: "green",
    textAlign: "center",
  };
  return (
    <div>
      <p style={inline} className="Smith">
        Lorem ipsum dolor, sit amet consectetur adipisicing elit. Sequi numquam
        at exercitationem? Cum quam repellendus, corrupti voluptatum dolorum
        provident id consectetur quasi omnis, accusantium sunt asperiores
        necessitatibus molestias fugiat et.
      </p>
      <p style={stp}>
        Lorem ipsum dolor, sit amet consectetur adipisicing elit. Sequi numquam
        at exercitationem? Cum quam repellendus, corrupti voluptatum dolorum
        provident id consectetur quasi omnis, accusantium sunt asperiores
        necessitatibus molestias fugiat et.
      </p>
      <img src={im} alt="" height={200} width={200} />
      <img
        src={
          "https://cdn.pixabay.com/photo/2024/02/18/15/22/swan-8581483_640.jpg"
        }
        height={200}
        width={200}
        alt=""
      ></img>

      <img src={pit} alt="" height={200} width={200} />
    </div>
  );
};
export default Demo;
