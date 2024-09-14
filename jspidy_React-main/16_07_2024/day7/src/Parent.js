import data from "./Data";
import Child from "./Child";
const Parent = () => {
  return (
    <div className="parent">
      <Child title={data[0].title} image={data[0].image} info={data[0].info} />
      <Child title={data[1].title} image={data[1].image} info={data[1].info} />
    </div>
  );
};
export default Parent;
