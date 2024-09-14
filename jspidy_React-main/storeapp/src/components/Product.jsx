import React, { useEffect, useState } from "react";
import { useLocation, useNavigate, useParams } from "react-router-dom";
import data from "./Data";
function Product() {
    let para = useParams();
    console.log(para.id);
    let nav = useNavigate();
    // let loc = useLocation();
    let [dt,setDt] = useState(data.filter((dat)=>dat.id==para.id));
    // let path = loc.pathname.startsWith("/adminportal");
    return (
      <div className="product">
        <div>
          <h1>
            {/* {console.log(dt)}  */}
            {dt[0].id}
          </h1>
          <div className="detailscontainer">
            <div className="image">
              <img src={dt[0].images} alt="" />
              <p>{dt[0].title}</p>
            </div>
            <div className="details">
              <div className="description">
                <p>{dt[0].description}</p>
                <p>{dt[0].price}</p>
              </div>
              <div className="buttons">
                <button>add to Cart</button>
                <button>Back</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
}

export default Product;
