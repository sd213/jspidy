import React, { useEffect, useState } from 'react'


function ApIFetch() {
    const [data,setData] = useState([]);
    useEffect(() => {
      async function name(){
        let fet = await fetch("https://fakestoreapi.com/products");
        let dat = await fet.json();
        console.log(dat);
        setData(dat);
        
      }
      name();
      
    }, []);
  return (
    // <div>Data</div>
    <div>
      {data.map((dt)=>{
        return(
          <div className="box" key={dt.id}>
              <div className="image">
                <img src={dt.image} alt="" />
              </div>
              <div className="title">
                <p>{dt.title}</p>
                <p>{dt.description}</p>
                <p>{dt.category}</p>
                <p></p>
              </div>
          </div>
        )
      })}
    </div>
  )
}

export default Data