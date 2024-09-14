import React, { useRef } from "react";
import { useNavigate } from "react-router-dom";

const AddBooks = () => {
  let title = useRef();
  let isbn = useRef();
  let pageCount = useRef();
  let url = useRef();
  let authors = useRef();
  let shortdesc = useRef();
  let longdesc = useRef();
  let status = useRef();
  

  let nav = useNavigate();
  function f1(e) {
    e.preventDefault();

    let newBook = {
      title: title.current.value,
      thumbnailUrl: url.current.value,
      authors: authors.current.value,
      shortDescription: shortdesc.current.value,
      longDescription: longdesc.current.value,
      status:status.current.value
    };
    fetch("http://localhost:4000/books", {
      method: "POST",
      body: JSON.stringify(newBook),
    });
    alert("book added ");

    nav("/adminportal/books");
  }

  return (
    <div className="addbooks">
      <h1>add books here</h1>

      <div className="formcontainer">
        <form action="" onSubmit={f1}>
          <div className="inputfield">
            <label htmlFor="">Book Name : </label>
            <input type="text" placeholder="Enter Book Name" ref={title} />
          </div>
          {/* <br />
          <br /> */}
          <div className="inputfield">
            <label htmlFor="">URL : </label>
            <input type="text" placeholder="Enter Book Url" ref={url} />
          </div>

          <div className="inputfield">
            <label htmlFor="">Authors : </label>
            <input type="text" placeholder="Enter Book Authors" ref={authors} />
          </div>

          <div className="inputfield">
            <label htmlFor="">Published : </label>
            <div>
              {" "}
              <label>True</label>
              <input
                type="radio"
                name="publish"
                value={true}
                ref={status}
              ></input>
              <label> false</label>
              <input
                type="radio"
                name="publish"
                value={false}
                ref={status}
              ></input>
            </div>
          </div>
          <div className="inputfield">
            <label htmlFor="">Short Description : </label>
            <input
              type="text"
              placeholder="Enter short Description"
              ref={shortdesc}
            />
          </div>
          <div className="inputfield">
            <label>Long Description : </label>
            <textarea placeholder="Enter long Description" ref={longdesc} />
          </div>

          <button>add a book</button>
        </form>
      </div>
    </div>
  );
};

export default AddBooks;
