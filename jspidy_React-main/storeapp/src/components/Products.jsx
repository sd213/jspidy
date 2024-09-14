import React from 'react'
import data from './Data'
import './Products.css'
import { useNavigate } from 'react-router-dom'
function Products() {
    let nav = useNavigate();

  return (
    <>
        <h1 style={{textAlign:'center'}}>Products</h1>
        <div className="prodcts">
            {data.map((dt)=>{
                return <div className='container'>
                    <img src={dt.images[0]} alt="" />
                    <p>{dt.title}</p>
                    <button onClick={()=>nav(`/adminportal/product/${dt.id}`)}> view </button>
                </div>
            })}
        </div>

    </>
  )
}

export default Products