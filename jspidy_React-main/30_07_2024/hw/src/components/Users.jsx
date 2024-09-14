import React, { useEffect, useState } from 'react'
import "./users.css";
function Users({authenticate}) {
    const [Data,setData]=useState([]);
    const api = "https://api.github.com/users";
    
    useEffect(()=>{
        const fetchData = async () => {
        // try {
        const response = await fetch(api);
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        const data = await response.json();
        console.log(data);
        setData(data);
      // } catch (error) {
        // setError(error);
      // } finally {
        // setLoading(false);
        }
        // let fetchapi = fetch(api);
        // console.log(fetchapi);
        // let first = fetchapi.then((res) => {
        //   return res.json();
        // });
        // console.log(first);
        // let second = first.then((sec) => {
        //   return sec;
        // });
        // console.log(second);
        // let third = first.then((thir) => {
        //   console.log(thir);
        //   setData(thir);
        // //   return thir;
        // });
        // console.log(third);
         fetchData();
    },[])
    return (
      <div>
        Users
        <div className="boxContainer">
          {Data.map((dt) => {
            return (
              <>
                <div className="box">
                  <div className="header">{dt.login}</div>
                  <div className="image">
                    <img src={dt.avatar_url} alt="" />
                  </div>
                </div>
              </>
            );
          })}
          {/* 
        {authenticate && Data.map((dt)=>{
            return <h1>{dt.login}</h1>
        }) } */}
        </div>
      </div>
    );
}

export default Users