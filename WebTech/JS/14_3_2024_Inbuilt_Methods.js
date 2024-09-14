// Inbuilt methods 
//Number()
let num = Number();
console.log(num);//0
console.log(typeof num); //number

let num1 = Number(100);
console.log(num1);//100
console.log(typeof num1);//number

let num2 = Number(true);
console.log(num2);//1
console.log(typeof num2);//number

let num3 = Number('Hi');
console.log(num3);      //NaN
console.log(typeof num3); // number

let num31 = Number('100');
console.log(num31);         //100
console.log(typeof num31);  //number

let num32 = 200;
console.log(num32);     //200
console.log(typeof num32);//number

console.log(NaN);
console.log(typeof NaN);

//String()
let str = 'welcome';
console.log(str);
console.log(typeof str);//string

console.warn("String Inbuilt Method");    
let str1 = String('Hello');
console.log(str1);//Hello
console.log(typeof str1); //string

let str2 = String(120);
console.log(str2);//120
console.log(typeof str2); //string

let str3=String(true);
console.log(str3);//true
console.log(typeof str3);//string

// let str4=String(abc);
// console.log(str4); // error: abc is not defined.

let str5 = String();
console.log(str5); // empty space
console.log(typeof str5);

//boolean
console.warn("Boolean inbuilt Mehod");

let b = Boolean(true);
console.log(b);
console.log(typeof b);

let bool = true;
let  b1 = Boolean(!bool);
console.log(b1);
console.log(typeof b1);

let b2= Boolean("Hi");
console.log(b2);
console.log(typeof b2);

let b3= Boolean(!"Bye");
console.log(b3);
console.log(typeof b3);

let b4= Boolean(100+50);
console.log(b4);

let b5= Boolean(100+50 == 50+100);
console.log(b5);

let b6=Boolean(!150);
console.log(b6);

let b7 = Boolean();
console.log(b7);

// Undefined keyword
let x;
console.log(x);
console.log(typeof x); //undefined type


let x1 = undefined;
console.log(x1);
console.log(typeof x1); //undefined type