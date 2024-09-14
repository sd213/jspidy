//wap to find second largest element in array.
// 20,55,45,24,12,69,83,96,95,57,68
let arr1 = [20,55,45,24,12,69,83,96,95,57,68];
let arr2 = arr1.sort((a,b)=> {return b-a;});
console.log(arr2[2]);

//using rest operator.

let small = Math.min(20,55,45,24,12,69,83,96,95,57,68);
console.log(small);