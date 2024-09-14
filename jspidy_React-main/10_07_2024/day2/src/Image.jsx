const im =
  "https://upload.wikimedia.org/wikipedia/en/thumb/e/e0/J.A.R.V.I.S._%28MCU%29.png/330px-J.A.R.V.I.S._%28MCU%29.png";
const name = "Heart of Jarvis";
const css = {
  color: "red",
  fontSize: "10px",
  backgroundColor: "blue",
};

const Image = () => {
  return (
    <>
      <img src={im} alt="" />
      <figcaption>({name})</figcaption>
      <p style={css}>Any thing to do</p>
    </>
  );
};
export default Image;
