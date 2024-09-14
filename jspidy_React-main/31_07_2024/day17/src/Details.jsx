import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

function Details() {
  let [full, setFull] = useState([]);
  let para = useParams();
  useEffect(()=>{
    async function ApiFetching(){
        const response = await fetch(`https://fakestoreapi.com/products/${para.id}`);
        const data = await response.json();
        console.log(data);
        setFull(data);
    }
    ApiFetching()
  },[])
  return (
    <div>
        
        <h1>full details is here</h1>
        <div className="full">
            <img src={full.image} alt=""/>
            <h2>{full.description}</h2>
            <p>{full.title}</p>
        </div>

    </div>
  );
}
export default Details;