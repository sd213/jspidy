let arr = [10,20,30,40,50]
console.log(arr);

console.log("For - in loop  for Array");
for( let key in arr){
    console.log(key);
}
console.log("For - of Loop for Array");
for(let key of arr){
    console.log(key);
}

let obj = {
    fnm: "Dinga",
    lnm: "Raja",
    age: 50
}
console.log(obj);

console.log("For -in loop  for Object");
for( let key in obj){
    console.log(obj[key]);
}
console.log("For -in loop  for Object");
for( let key in obj){
    console.log(`${key} = ${obj[key]}`);
}

/*
console.log("For -of loop ");
for( let key of obj){
    console.log(obj[key]);
 }  // object not iterable

 */
/*

for-in & for-of 
===============
    for-in loop
    -------------

        for(let variableName in arr/obj){

        }

    for of loop
    -------------
        for(let variableName of arr/obj){

        }

*/
