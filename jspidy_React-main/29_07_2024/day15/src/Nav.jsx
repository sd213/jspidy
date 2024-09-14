import { Link } from "react-router-dom"
export const Nav = () =>{
    return(
        <div style={{width:"100%",marginBottom: "auto"}}>
            <ul style={{display:"flex",gap:"60px",justifyContent:"center"}}>
                <li>
                    <Link to = {"/"}>Home</Link>
                </li>
                <li><Link to={"/Product"}>product</Link></li>
                <li>
                    <Link to={"/Review"}>review</Link>
                </li>
            </ul>
        </div>
    )
}