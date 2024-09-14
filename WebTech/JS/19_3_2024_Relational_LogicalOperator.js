 console.log("Relational Operator");
let a = 10
let b = '10'

console.log( a == b); //true
console.log( a=== b); //false

console.log(`100==100   : `,100==100); //true
console.log(`100===100  :`,100===100); // true

console.log(`100=="100"   : `,100=="100")// true
console.log(`100==="100"  :`,100==="100")// false

console.log(`100 != 100   : `,100 != 100); //false
console.log(`100 !== 100  :`,100 !== 100); //false

console.log(`100 !== "100"  :`,100 !== "100");//true
console.log(`100 != "100"  :`,100 != "100"); //false

//Logical Operator
let exp1= (10 === 10) && (10 === '10')
console.log(exp1);

console.log((a==b) && (a===b)); //false
console.log(true && false); //false

console.log((a==b)||(a==b)); //true
console.log(true || false); //true

//BITWise Operator
console.log( 5 & 1); //1
console.log(5 | 1); //5