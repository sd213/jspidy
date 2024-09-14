const css = {
  color: "red",
  fontSize: "10px",
  backgroundColor: "green",
};
const name = "Sd";
const place = "Bhubaneswar";
const num = 20;
// export default name;
const image =
  "https://cdn.pixabay.com/photo/2024/02/16/20/28/lighthouse-8578318_1280.jpg";

const Greet = () => {
  return (
    <>
      <b
        style={{
          color: "red",
          fontSize: "10px",
          backgroundColor: "darkblue",
        }}
      >
        Welcoming Brave and bold
      </b>
      <h1 style={css}>Welcome from greet</h1>
      <p>Lorem ipsum dolor, sit amet consectetur </p>
      <h2>
        My name is {name} from {place}
      </h2>
      <img src={image} alt="" height={100} width={200} srcset="" />
      <h2>{num + num}</h2>
    </>
  );
};
export default Greet;
