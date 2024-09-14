// spread & 
//Spread Operator
let x = [10,20,30];
let y = [25,35,45];

let arr = [x,y];
console.log(arr);

//ex: 1 spreading the value from the array
// ex: separating the values from the array
let arr1 = [...x,y];
console.log(arr);


let arr2 =[x,...y]
console.log(arr2);

let arr3 = [...x,...y]
console.log(arr3);

console.log(...arr3);

//Rest operator.
function num(...a){
    console.log(a);
}
num(100,200,300,400,500);
function num(...arr){
    console.log(arr);
    console.log(...arr); // spread
    //map method 
    let sqrt = arr.map(elem => elem * elem )
    console.log(sqrt);

    //sort method
    let ascending = sqrt.sort((a,b)=>a-b);
    console.log(ascending);

    //filter method
    let even = ascending.filter(elem => elem%2 == 0)
    console.log(even);
    
    // reduce
    let add = even.reduce((preval,curval)=>preval+curval);
    console.log(add);
}
num(8,6,7,5,4,1,2,3,9);