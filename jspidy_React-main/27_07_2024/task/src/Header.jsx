const img = {
    imgaddress:"https://static.wixstatic.com/media/00375d_bfaa4a0dffec4f7a9a55c600a304145c~mv2.png/v1/crop/x_0,y_104,w_444,h_492/fill/w_90,h_101,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/MIXMI-LOGO-Healthy%20gut_%20Happy%20you_.png"
}
function Header (){
    return(
        <div className="nav">
            <div className="logo">
                <img src={img.imgaddress} alt=""></img>
            </div>
            <div className="navdetails">
                <div className="navtitle">
                    healthy gut. healthy you
                </div>
                <div className="navlinks">
                    <a href="">home</a>
                    <a href="">products</a>
                    <a href="">find us</a>
                    <a href="">gut health</a>
                    <a href="">our story</a>
                    <a href="">press</a>
                </div>
            </div>
        </div>
    )
}
export default Header;