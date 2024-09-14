import "./Greeting.css";
const listName = [
  "Shruti",
  "Sita",
  "Ram",
  "Smruti",
  "Parvati",
  "Shakti",
  "Shiva",
];
const PMap = () => {
  return (
    <div>
      {listName.map((a) => {
        return <p>Hello,Good Morning {a}</p>;
      })}
    </div>
  );
};
export default PMap;
