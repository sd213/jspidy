import React, { useState,useEffect } from 'react'
import { useLocation } from 'react-router-dom';
import { useNavigate, useParams } from 'react-router-dom'

function ReadBook() {
    const para = useParams();
    let nav=useNavigate(); //to go back to home
    let loc = useLocation(); // to know where we stand
    let path = loc.pathname.startsWith("/adminportal");
    let [readbook, setReadBook] = useState([]);
    const [cart, setCart] = useState(null);
    // const [bookbyid, setBookbyId] = useState(null);
    // const [index,set]
    let cartpath = path ? "admincart" : "usercart";

    

    // const fetchBookById = (bookId) => {
      //  fetch(`http://localhost:4000/${cartpath}/${bookId}`)
      //    .then((response) => response.json())
      //    .then((data) => setBookbyId(data))
      //    .catch((error) => console.error("Error fetching book:", error));

    //  };
    useEffect(()=>{
      fetching();
      async function fetching() {
        let dt = await fetch(`http://localhost:4000/books/${para.id}`);

        let dt2 = await dt.json();
        setReadBook(() => dt2);
      }
      const fetchBooks = () => {
        fetch(`http://localhost:4000/${cartpath}/`)
          .then((response) => response.json())
          .then((data) => setCart(data))
          .catch((error) => console.error("Error fetching book:", error));
      };
      fetchBooks();
    },[cartpath,para.id])
    // gotoback
    function gotobook(){
      
      if (path) {
        nav("/adminportal/books");
      } else {
        nav("/userportal/books");
      }
     
        console.log("going back");
    }
    // adding to cartpath
    async function addingtocart(id,thumbnailUrl,title,authors,longDescription,isbn, pageCount){
      
      // fetchBookById(id);
      const index =  cart.findIndex((book) => book.id === id);
      console.log(index);
      if (index!==-1) {

        fetch(`http://localhost:4000/${cartpath}/${id}`, {
          method: "PUT", // or 'PUT' for replacing the entire object
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify({...cart[index],qty:cart[index].qty+1}),
        })
          .then((response) => response.json())
          .then((updatedBook) => {
            // Update the state with the new book data
            setCart(
              cart.map((book) => (book.id === id ? updatedBook : book))
            );
          });



      //   const updatedBooks = cart.map(book =>
      // book.id === id ? { ...book, qty: qty+1 } : book );
      //     set
          // const { qty } = cart[index];
          // cart[index] = {...cart[index],qty:qty+1};
         
       } else {
         console.error("Book not found.");
         console.log(cart);
         let cartitem = {
           id: id,
           cartimage: thumbnailUrl,
           carttitle: title,
           cartauthors: authors,
           qty:1,
           longDescription:longDescription,
           isbn:isbn,
           pageCount:pageCount

         };
         fetch(`http://localhost:4000/${cartpath}`, {
           method: "POST",
           body: JSON.stringify(cartitem),
         });

         alert("book added ");
       }
      //  async function fetching() {
      //    let dt = await fetch(`http://localhost:4000/${cartpath}/${para.id}`);

      //    let dt2 = await dt.json();
         
      //  }

      
      // fetch(`http://localhost:4000/${cartpath}`, {
      //   method: "POST",
      //   body: JSON.stringify(cartitem),
      // });
      
      // alert("book added ");

      if (path) {
        nav(`/adminportal/cart`);
      } else {
        nav(`/userportal/cart`);
      }
    }
    
  return (
    <div className="readbook">
      <h1>{readbook.title}</h1>
      <br />
      <img src={readbook.thumbnailUrl} alt="" width={300} height={250} />
      <h4>
        <label>Author </label>: {readbook.authors}
      </h4>
      <details>
        <summary>click here for the more information</summary>
        <p>{readbook.longDescription}</p>
      </details>

      <div className="btns">
        <button
          onClick={() => {
            addingtocart(
              readbook.id,
              readbook.thumbnailUrl,
              readbook.title,
              readbook.authors,
              readbook.longDescription,
              readbook.isbn,
              readbook.pageCount

            );
          }}
        >
          ADD TO CART
        </button>

        <button onClick={gotobook}>go back to books</button>
      </div>
    </div>
  );
}

export default ReadBook













// commented out codee

//  if (books) {
//          setBook((prevBook) => ({
//            ...prevBook,
//            qty: prevBook.qty + 1,
//          }));

//          // Persist the updated quantity to the backend
//          fetch(`http://localhost:4000/${cartpath}/${book.id}`, {
//            method: "PUT",
//            headers: {
//              "Content-Type": "application/json",
//            },
//            body: JSON.stringify({ ...book, qty: book.qty + 1 }),
//          }).then((response) => {
//            if (!response.ok) {
//              console.error("Error updating book:", response.statusText);
//            }
//          });
//        }