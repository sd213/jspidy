let exp = 10+20/5*4;
console.log(exp);

// let exp = 
console.log(10+true*2*(true+true)*10/2-13);
console.log((true*3)+15+'03'+20+'2'+(true * 4));

let a = 10
let b = 20
let c = 30

console.log(c);
console.log(a+b);
console.log(a,b);
console.log(a,b,a+b);
console.log(10,25+20+'Helloo');
console.log(10,25+20,"Hello0");
console.log(10+25+20,"Hello0");

let fname = "Dinga"
let lname = "Raja"
let age = 25;

console.log('My name is : ',fname,lname,'\n','My Age is ',age);
console.log('My name is : '+fname+' '+lname+'\n'+'My Age is '+age);


let p1 = 'My name is : '+fname+' '+lname+'\n'+'My Age is '+age;
console.log(p1);

// let p2 = 'My name is : ',fname,lname,'My Age is ',age;
// console.log(p2); //error.

// Interpolation
let p3 = `My name is : ',${fname},${lname},'My Age is ',${age}`;
console.log(p3);

console.log(`My name is : ${fname} ${lname} , My Age is ${age}`);

let fname2 = "Dingi";
let lname2 = "Rani";
let place2 = "Goa";
let deg2 = 'BE';
let stream2 = 'CS';
let yop2 = '2023';
let dob2 = 2000;
let age2 = 2024-dob2+1;
console.log(`Age is ${age2}`);

console.log(`Hello I am ${fname2} ${lname2} , Was Born on ${dob2} from ${place2} and current age is ${age2} and completed ${deg2} in ${stream2} in year ${yop2}`     );
