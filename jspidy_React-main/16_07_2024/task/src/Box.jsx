import "./box.css";
const Box = () => {
  return (
    <div className="container">
      <div className="box">
        <h1>WebTech</h1>
        <img
          src="https://akm-img-a-in.tosshub.com/businesstoday/images/story/202207/web_3-sixteen_nine.png?size=948:533"
          alt=""
        />
        <p>
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Eum, labore
          pariatur ducimus amet tempore laudantium temporibus veritatis aperiam
        </p>
      </div>
      <div className="box">
        <h1>Database</h1>
        <img
          src="https://akm-img-a-in.tosshub.com/businesstoday/images/story/202207/web_3-sixteen_nine.png?size=948:533"
          alt=""
        />
        <p>
          Fully managed, cost-effective relational database service for
          PostGresql, mysql and sql server . Try Enterprise Plus edition for a
          99.99%availability SLA
        </p>
      </div>
    </div>
  );
};
export default Box;
