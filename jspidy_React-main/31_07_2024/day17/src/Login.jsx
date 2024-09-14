import {useRef } from "react";
import "./login.css"
import { useNavigate } from "react-router-dom";
function Login(){
  const email = useRef();
  const pass = useRef();
  const nav = useNavigate();
//   const handleChange = (e) => {
//     const { name, value } = e.target;
//     setFormData({ ...formData, [name]: value });
//   };

  const subMit = (e) => {
    e.preventDefault();
    if(email.current.value === "som@gmail" && pass.current.value ==='123'){
        nav("/Products")
    }
  };

  return (
    <div class="login-container">
        <h2>Login</h2>
        <form onSubmit={subMit} method="post">
            <div className="input-group">
                <label for="usermail">Email</label>
                <input type="email" id="usermail" name="usermail" ref={email}  required/>
            </div>
            <div class="input-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" ref={pass} required/>
            </div>
            <button type="submit">Login</button>
        </form>
    </div>
  )
}

export default Login;
    // <div className="form-container">
    //   <h1>Contact Us</h1>
    //   <form onSubmit={handleSubmit}>
    //     <div className="form-group">
    //       <label htmlFor="name">Name:</label>
    //       <input
    //         type="text"
    //         id="name"
    //         name="name"
    //         value={formData.name}
    //         onChange={handleChange}
    //       />
    //     </div>
    //     <div className="form-group">
    //       <label htmlFor="email">Email:</label>
    //       <input
    //         type="email"
    //         id="email"
    //         name="email"
    //         value={formData.email}
    //         onChange={handleChange}
    //       />
    //     </div>
    //     <div className="form-group">
    //       <label htmlFor="message">Message:</label>
    //       <textarea
    //         id="message"
    //         name="message"
    //         value={formData.message}
    //         onChange={handleChange}
    //       ></textarea>
    //     </div>
    //     <button type="submit" className="submit-button">Submit</button>
    //   </form>
    // </div>