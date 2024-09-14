// Keywords 
// var keyword 
console.warn('var keyword');


var a ; //declaration
a = 10; // Initialization
document.write(a);
document.writeln(a);
document.writeln(a);
console.log(a);

a = 'Hai'  // re-Initialization
document.writeln(a)
console.log(a);

var a; //re-declaration
a = true;
document.writeln(a)
console.log(a);


// let keyword
console.warn('Let Keyword');
let b ; //declaration
b = 20; //Initialization
document.writeln(b)
console.log(b);

b = 'BAI';// re-initialization
document.writeln(b);
console.log(b);

//let b ; // re-declaration not possible in let case.
b = false;
document.writeln(b);
console.log(b);

//const keyword
console.warn('Const Keyword');

//const c; // declaration and initialization not done in one line
//c =234;

const d1 = 43;

// d1=45;//Assignment to constant variable. , reassignatino not work with const
console.log(d1);

// const d1 = 90; //Uncaught SyntaxError: Identifier 'd1' has already been declared  , redeclaration not allowed 
console.log(d1);


// Data types

//number datatype
let num = 100
console.log(num); // 100
console.log(typeof(num)); //number

//String datatype
let str = 'Hai'
console.log(str); // Hai
console.log(typeof str);//string

//boolean datatype
let bool = true;
console.log(bool); //true
console.log(typeof bool); // boolean

//undefined
let x;  
console.log(x);//undefined
console.log(typeof x); //undefined
x=6;

// Null Datatype
let n = null;
console.log(n); // Null
console.log(typeof n);// object