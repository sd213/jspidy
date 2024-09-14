const ChildCourses = (prop) => {
  return (
    <>
      {/* {Data.map((e) => {
        return ( */}
      <div className="box">
        <img src={prop.image} alt="" />
        <div className="texts">
          <h2 className="h2title">{prop.title}</h2>
          <h6 className="h6details">{prop.instructor}</h6>
          <div className="innerDetails">
            <span>{prop.rating}</span>
            <span>({prop.students})</span>
          </div>
          <div className="money">
            <span>₹{prop.price}</span>
            <span>
              <strike>₹{prop.originalprice}</strike>
            </span>
          </div>
          <span>
            {prop.bestseller ? <p className="pbest">Bestseller</p> : <></>}
          </span>
        </div>
      </div>
    </>
  );
};
export default ChildCourses;
