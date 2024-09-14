import React, { useEffect, useState } from 'react'

import {useLocation, useNavigate} from 'react-router-dom'

function Books() {
  const [fetchedBks, setFetchedBks] = useState([]);
  // for location to know where we are in admin or in normal user directory
  let loc = useLocation();
  let path = loc.pathname.startsWith("/adminportal");
  useEffect(() => {
    async function fetching() {
      let dt = await fetch("http://localhost:4000/books");

      let dt2 = await dt.json();
      setFetchedBks(() => dt2);
    }
    fetching();
  }, [fetchedBks]);

  //Reading a book
  let nav = useNavigate();
  let readbook = (id) => {
    if (path) {
      nav(`/adminportal/readbook/${id}`);
    } else {
      nav(`/userportal/readbook/${id}`);
    }
  };

  //deleting a book
  function f1(id, title) {
    let x = window.confirm(`do you want to to delete ${title}`);
    if (x) {
      fetch(`http://localhost:4000/books/${id}`, { method: "DELETE" });
      alert("book deleted ");
    } else {
      alert("not deleted");
    }
  }
  return (
    <div className="books">
      <h1>Books List</h1>
      <div className="bookContainers">
        {fetchedBks.map((fb) => {
          <h1 style={{ textAlign: "center" }}>Books are here</h1>;
          return (
            <div className="box" key={fb.id}>
              <img src={fb.thumbnailUrl} alt="" />
              <p>{fb.title}</p>
              <p>book id : {fb.id}</p>
              <div className="btns">
                <button onClick={()=>readbook(fb.id)}>read book</button>
                {path?<button onClick={()=>f1(fb.id,fb.title)}>delete book</button>:""}
              </div>
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default Books