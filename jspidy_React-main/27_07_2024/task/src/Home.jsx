import "./home.css"
import Data from "./Data";
export const Home = ()=>{
    return (
        <div className="home">
            <div className="section">
                <img src={Data.section_img} alt="" width={"100%"} />
            </div>
            <div className="section2">
                <div className="container">
                <div className="findus  sectionbox">
                    <p>find our froyo!</p>
                    <button>
                        <a href="">find us</a>
                    </button>
                    <p>If mixmi is not found in your store, please recommend it to the manager!</p>
                </div>
                <div className="flavors sectionbox">
                    <p>find our froyo!</p>
                    <button>
                        <a href="">flavors</a>
                    </button>
                    <p>
                        Taste for yourself how smooth and creamy mixmi is. Supporting gut health has never been so easy!
                    </p>
                </div>


                </div>
                <div className="details">
                        <h2>Enriched!</h2>
                        <p>Our premium frozen yogurt is enriched to contain a good source of prebiotic fiber and billions of the finest live and active probiotics to aid digestion and support gut health.</p>

                        <p>And the best part is it <a href="hello">tastes like ice cream!</a></p>

                    </div>
                    <img src={Data.content_img} alt="" />
            </div>
        </div>
    )
}