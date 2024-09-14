//General / named function
//function without parameter & without return value
// function fun(){
//     console.log('i am fine');
// }
// fun()
// fun()

// function demo(){
//     console.error('invalid options');
// }
// demo()

// function wrn(){
//     console.warn('be careful');
// }
// wrn()

// alert('hi your loptop is gone')

//------------------*******--------------------//
//function with parameter & without return value
//example 1
// function num(x){
//     console.log(x);

// }
// num(100)

// function num1(msz){
//     console.log(msz);
// }
// num1(200)
// num1('hello')
// num1(true)
// num1()

//example 2
// write a program to add two numbers by using general function with parameter
// function fun(a,b){
//     let sum=a+b
//     console.log(`${a} + ${b} = ${sum}`);
// }
// fun(10,20)
// fun(20,80)

//example 3
// WAP to check even or odd number by using general function with parameter

// function check(a){
//     if (a%2==0){
//         console.log(`${a} is a even`);

//     }
//     else{
//         console.log(`${a} is a odd`)
//     }

// }
// check(21)
// check(59)

// function evenOdd(num){
//     (num%2 == 0) ? console.log(`${num} is even `) : console.log(`${num} is odd`);

// }
// evenOdd(20)
// evenOdd(25)

// evenOdd(prompt('enter number'))

// WAP to print even number from 25-50 by using general function with parameter
//example 3
// function even(a,b){
//     for(let i=a;i<=b;i++){
//         if(i%2 == 0)
//         console.log(i);
//     }

// }
// even(25,50)
// even(20,40)
// --------------------------***********--------------------------//

//example 4
// let fnm=prompt("enter first name")
// let lnm=prompt("enter last name")

// function fullname(fname,lname){
//     console.log(`my name is ${fname}${lname    }`);

// }
// fullname(fnm,lnm)

//how to changing default value of parameter

// function foo(msz=100){
//     console.log(msz)
// }
// foo()
// foo('hello')'
// -----------------------------//

// function fun(a,b,c=420){
//     b='pakka'
//     console.log(a,b,c);
// }
// fun('dinga')

//-------------------------//

// function fun1(){
//     let a=10
//     let b=20
//     let sum =a+b
//     return `${a} + ${b} = ${sum}`
//     // console.log(sum);
// }
// let x=fun1()
// console.log(x);
// ------------------------//

//Anonymous Function
//F WO P & W R V
// let x=function(){
//     console.log("hello");

// }
// x()

// F W P & WO R V
// console.warn('F W P & Wo R V')
// let fun=function(fnm,lnm){
//     console.log(`hello ${fnm} ${lnm}`)
// }
// fun('nanu','nenu')
// console.log(typeof fun);

// // F WO P & W R V
// console.warn('F WO P & W R V')
// let add=function(){
//     let a = 300
//     let b = 200
//     let sum=a+b
//     return `${a} + ${b} = ${sum}`
// }
// let res =add()
// console.log(res);
// console.log(typeof add);//function
// console.log(typeof res);//string

// //WAP to check even or odd number by using anoonymous function with parameter & with return value
// console.warn('F W P & W R V')

// let evenOdd=function(num){
//     return (num%2==0) ? `${num} is even` :  `${num} is odd`

// }
// let x =evenOdd(251)
// console.log(x);
// ---------------------------

//Arrow Function
// WO P & WO R V
// let fun=()=> {
//     console.log('hi i am in arrow function');
// }
// fun()
// // W P & Wo R V
// let fun1=(fnm,lnm)=>{
//     console.log (`hello ${fnm} ${lnm}`);

// }
// fun1('puni','m r ')
// //wo P & w R V
// let fun3=()=>{
//     let a =10
//     let b = 20
//     let sum=a+b
//     return `${a} + ${b} = ${sum} `

// }
// let res=fun3()
// console.log(res);
// //W P & W R V
// let fun4=(x)=>{
//     console.log('hello')
//     return x

// }
// let x=fun4(100)
// console.log(x);

//Special Behaviour of Arrow Function
// let arrow1 =_=>{
//     console.log('bye');
// }
// arrow1()

// let arrow =x=>{

//     console.log('Hai'+x);
// }
// arrow('Dinga')

let arrow = (a, b) => `${a} + ${b} =${a + b}`;
console.log(arrow(10, 20));
console.log(arrow(25, 50));

//self Invoking function
(function () {
  console.log("hello");
})();
(function () {
  console.log("bye");
})();
