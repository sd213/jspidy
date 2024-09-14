import { useEffect, useState } from "react";
import "./products.css";
import { useLocation, useNavigate } from "react-router-dom";
function Products(){
    const [data,setData]=useState([]);
    let nav = useNavigate();
    let loc = useLocation();
    console.log(loc);
   
    useEffect(()=>{
         async function ApiFetching() {
           const response = await fetch("https://fakestoreapi.com/products");
           const data = await response.json();
           console.log(data);
           setData(data);
         }
         ApiFetching();
    },[])
    let fullData=(id)=>{
        nav(`/details/${id}`);
    }
    return(
        <>
            <h1>Products</h1> 
            <div className="container">
                {console.log(data)}
            {Array.isArray(data)&& data.map((dt)=>{
                    return (
                      <div key={dt.id}>
                        <div className="box">
                          <div className="image">
                            <img src={dt.image} alt="" />
                          </div>

                          <div className="details">
                            <p className="title">{dt.title}</p>
                            {/* <p>{dt.description}</p> */}
                            <p className="catagory">{dt.category}</p>
                            <div className="priceRating">
                              <p className="price">Price : ₹{dt.price}</p>
                              <p className="rating">
                                <span>Rating : {dt.rating.rate}</span>
                                <span>({dt.rating.count})</span>
                              </p>
                            </div>
                            <button onClick={() => fullData(dt.id)}>
                              view Here
                            </button>
                          </div>
                        </div>
                      </div>
                    );
                })}
            </div>
        </>
    )
}


export default Products;