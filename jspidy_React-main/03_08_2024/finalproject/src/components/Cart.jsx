import React, { useEffect, useState } from "react";
import { useLocation } from "react-router-dom";

const Cart = () => {
  let [itemcart, setItemcart] = useState([]);
  let loc = useLocation();
  let path = loc.pathname.startsWith("/adminportal");
  let cart = path ? "admincart" : "usercart";
   
  useEffect(() => {

     let api = fetch(`http://localhost:4000/${cart}`);
    let fullapi = api.then((first) => {
      return first.json();
    });
    fullapi.then((sec) => {
      setItemcart(sec);
      
    });
  }, [itemcart,cart]);
  console.log(cart);

  //deleting a book  from the cart
  function f1(id, title) {
    let x = window.confirm(`do you want to to delete ${title}`);
    if (x) {
      fetch(`http://localhost:4000/${cart}/${id}`, { method: "DELETE" });
      alert("book deleted ");
    } else {
      alert("not deleted");
    }
  }

  let empty = Boolean(itemcart.length);
  return (
    <div className="cart">
      <h1>Books Cart</h1>
      <div className="tablecontainer">
        <table cellPadding={"20px"} cellSpacing={"20px"}>
          <tr>
            <td>id</td>
            <td>title</td>
            <td>authors</td>
            <td>image</td>
            <td>Description</td>
            <td>isbn</td>
            <td>pages</td>
            <td>Quantity</td>
            <td>Operations</td>
          </tr>
          {itemcart.map((a) => {
            return (
              <>
                <tr>
                  <td>{a.id}</td>
                  <td>{a.carttitle}</td>
                  <td>{a.cartauthors}</td>
                  <td>
                    <img src={a.cartimage} alt="" />
                  </td>
                  <td>
                    <p
                      style={{
                        height:"200px",
                        width: "200px",
                        whiteSpace: "no-wrap",
                        overflowY: "scroll",
                        textAlign:"start",
                        textOverflow: "ellipsis",
                        
                      }}
                    >{a.longDescription}</p>
                  </td>
                  <td>{a.isbn}</td>
                  <td>{a.pageCount}</td>
                  <td>{a.qty}</td>

                  <td>
                    <button
                      onClick={() => {
                        f1(a.id, a.carttitle);
                      }}
                    >
                      remove{" "}
                    </button>
                  </td>
                </tr>
              </>
            );
          })}
          {empty ? (
            ""
          ) : (
            <tr>
              <td colSpan={6}>no books in the cart</td>
            </tr>
          )}
        </table>
      </div>
    </div>
  );
};

export default Cart;
