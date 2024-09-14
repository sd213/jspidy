import { data } from "./Data";
import "./Cssgallery.css";
let ImageGallery = () => {
  return (
    <div className="rt">
      <nav>
        <h1>ସନାତନ ଦେବତା ଏବଂ ଦେବୀ</h1>
      </nav>
      <main>
        <div className="container">
          {data.map((elem) => {
            return (
              <div className="cards" key={elem.id}>
                <img src={elem.image} alt="" />
                <div className="details">
                  <p>Name :- {elem.name}</p>
                  <p>Age :- {elem.age}</p>
                  <p className="alias">Alias :- {elem.alias}</p>
                </div>
              </div>
            );
          })}
        </div>
      </main>
    </div>
  );
};
export default ImageGallery;
