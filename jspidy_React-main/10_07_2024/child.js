import age from "./parent.js";

console.log("Age :" + age);

import { parentSurName, place } from "./parent.js";
import { greet, data } from "./parent.js";
import { address } from "./parent.js";
// import place from "./parent.js";
console.log("My Family Sur Name :" + parentSurName);
console.log(place);
greet();
data("DS", "DS");
console.log("Address : " + address);
