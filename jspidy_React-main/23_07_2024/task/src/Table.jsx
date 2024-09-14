import { useState } from "react";
import Data from "./Data";

const Table = () =>{
    const [Data1,setData1]= useState(Data);
    let id = 0;
    console.log(Data1);
    const adduser = () =>{
       
        console.log(id);
        const rollno = Number(prompt("Enter rollno ",2));
        const name = prompt("Enter Branch Name:- ")
        const place = prompt("please Enter Your Place ","hennur");
        const students = Number(prompt(" Enter Students :- ",100));
        const details =prompt("Enter Details : ");
        Data1.push({rollno,name,place,students,details});
        setData1([...Data1])
    }
    const deluser = (dt)=>{
        alert("Deleting data");
        
        const index = Data1.indexOf(dt);
        // firstway using splice using index
        if (index > -1) { // only splice array when item is found
        Data1.splice(index, 1); // 2nd parameter means remove one item only
}
         setData1([...Data1]);

        // second way using filtering
        // let removedRes = Data1.filter((obj)=>{
        //     return obj != dt;
        // })
        // setData1(removedRes);
        
        console.log(Data1);
    }
    
    const duplicateuser= (rollno,name,place,students,details) =>{
        Data1.push({rollno,name,place,students,details});
        setData1([...Data1]);
    }
    return(
        <div>
            <h1 style={{textAlign:"center"}}>table test</h1>
            <table border={2} cellPadding={20} rules="all">
                <tr>
                    <th>ID</th>
                    <th>ROLLNO</th>
                    <th>NAME</th>
                    <th>PLACE</th>
                    <th>STUDENTS</th>
                    <th>Details</th>
                    <th>Delete</th>
                    <th>Duplicate</th>
                </tr>
                {Data1.map((dt)=>{
                    return(
                        <tr>
                            <th> {id=id+1}</th>
                            <th>{dt.rollno}</th>
                            <th>{dt.name}</th>
                            <th>{dt.place}</th>
                            <th>{dt.students}</th>
                            <th>
                                <button onClick={()=>{alert(dt.details)}}>view</button>
                            </th>
                            <th>
                                <button onClick={()=>{
                                   deluser(dt);
                                }}>
                                    delete
                                </button>
                            </th>
                            <th>
                                <button onClick={()=>{duplicateuser(dt.rollno,dt.name,dt.place,dt.students,`Welcome to ${dt.place} ${dt.students}`)}}>duplicate</button>
                            </th>
                        </tr>
                    )
                })}
                <tr style={{textAlign:"center"}}>
                    <td colSpan={8}><button onClick={()=>{adduser()}}> ADD USER</button></td>
                   
                    
                </tr>
            </table>
        </div>
    )
}
export default Table;