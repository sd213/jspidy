const age = 90;
export default age;
const parentSurName = "SD";
// export default parentSurName;
const place = "Bhubaneswar";
// export default place;
export { parentSurName, place };
// export default parentSurName;
// export default place;
const greet = function () {
  console.log("Namaste");
};
const data = (name, place) => {
  console.log(`I am ${name} from ${place}`);
};

export { greet, data };
const address = "Bhubaneswar,Khordha,Odisha";
export { address };
