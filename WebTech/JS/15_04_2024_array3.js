// index of , lastIndexof
let arr = ['goa','ladakh','manali','madarpalli','ooty','Bangalore'];
console.log(arr);
let i1 = arr.indexOf('OOty');
console.log(i1);
let i2 = arr.indexOf('ooty');
console.log(i2);

let Students = ['shiba','ram','darshan','jagagnnath','dinga','ram','ram','dingi'];
console.log(Students);
let s1 = Students.indexOf('ram');
console.log(s1);

let s2 = Students.lastIndexOf('ram');
console.log(s2);

// Includes
let s3 = Students.includes('dingi');
console.log(s3);

let s4 = Students.includes('dengu');
console.log(s4);

// Slice

let arr1 = [23,65,44,33,81,20,77,57,55,80];
console.log(arr1);

let s5 = arr1.slice(0,4);
console.log(s5);

console.log(arr1.slice(4,8));
console.log(arr1.slice(2,-2));
console.log(arr1.slice(-2,2));

// join
let arr2 =  ['Dinga','with','Dingi'];
console.log(arr2);
console.log(typeof arr2);

let ji = arr2.join(' ');
console.log(ji);
console.log(typeof ji);

// reverse
let arr3 = arr2.reverse();
console.log(arr3);
console.log(arr3.join(''))
console.log(arr3.join(' '))
console.log(arr3.join('-'))
console.log(arr3.join('💕'))
console.log(arr3.join( ))
let ji2 = arr3.join();
console.log(ji2);

//flat()
let arr4 = [10,20,30,[1,2,3,4,5],25,35,[7,8,9]];
console.log(arr4);

let f1 = arr4.flat();
console.log(f1);

let c1 = f1.concat(100,34,'Hai');
console.log(c1);

let  arr5= ['sfdf','sfdsd']
let c2 = f1.concat(arr5);
console.log(c2);

/*
    Index of() method
        -   It is used to check index position of the array element.
        -   IF it is having some array elements in array list it will take 1st occurrence of index position.
        ex:-

    LastIndexOF()method:-
        -   It is used to check last index position of the array element.
        -   if it is having same array elements in array list it will take last occurance of the index position.
        -
    Includes Method ()

    Reverse Method():-
        - It is used to reverse the array elements .

    flat Method():-
        -   It is used to convert multiple nested array to single array.

    concat Method():-
        -   It is used to concat/adding  the  extra  elements to array/String.
*/

