import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
  // import { useLocation, useNavigate } from "react-router-dom";

const Users = () => {
  let [users, setUsers] = useState([]);
  let nav = useNavigate();
  useEffect(() => {
    let api = fetch("http://localhost:4000/users");
    let fullapi = api.then((first) => {
      return first.json();
    });
    fullapi.then((sec) => {
      setUsers(sec);
      // console.log(users);
    });
  }, [users]);
  function gotoUpdate(id){
      nav(`/adminportal/update/${id}`);
  }
  function deletingUser(id,firstName,lastName){
    let x = window.confirm(`do you want to to delete ${firstName} ${lastName}`);
    if (x) {
      fetch(`http://localhost:4000/users/${id}`, { method: "DELETE" });
      alert("User deleted ");
    } else {
      alert("not deleted");
    }
    console.log("Deleting User by "+id);
  }
  return (
    <div className="users">
      <h1>all users are here</h1>
      {/* <div className="par"> */}
        <table cellPadding={"20px"} cellSpacing={"20px"}>
          <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Password</th>
            <th colSpan={2}>Operations</th>
          </tr>
          {users.map((a) => {
            return (
              <tr key={a.id}>
                {/* <div className="ch"> */}
                  <td>{a.firstName}</td>
                  <td>{a.lastName}</td>
                  <td>{a.email}</td>
                  <td>{a.pass}</td>
                  <td><button className="upd" onClick={()=>gotoUpdate(a.id)}>Update</button></td>
                  <td><button className="del" onClick={()=>deletingUser(a.id,a.firstName, a.lastName)}>Delete</button></td>
                {/* </div> */}
              </tr>
            );
          })}
        </table>
      {/* </div> */}
    </div>
  );
};

export default Users;
