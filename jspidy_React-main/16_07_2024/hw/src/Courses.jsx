import Data from "./Data";
import ChildCourses from "./ChildCourses";
import "./CourseStructure.css";
const Courses = () => {
  return (
    <>
      <h1>Courses</h1>
      <div className="container">
        {/* <ChildCourses name={Data[0].name} image = {Data[0].image} title = {Data[0].title} instructor = {Data[0].instructor} rating = {Data[]} /> */}
        {Data.map((el) => {
          return (
            <>
              <ChildCourses
                name={el.name}
                image={el.image}
                title={el.title}
                instructor={el.instructor}
                rating={el.rating}
                bestseller={el.bestseller}
                price={el.price}
                originalprice={el.originalprice}
                students={el.students}
              />
            </>
          );
        })}
      </div>
    </>
  );
};
export default Courses;
