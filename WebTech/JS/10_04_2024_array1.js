//Array Methods

let arr = [10,20,30,40,50];
console.log(arr);

//!Push() - It is used to add the array element to array list.
arr.push('added',true);
console.log(arr);

//Pop() - It is used to remove / delete array elements from the array list

let x = arr.pop();
let y = arr.pop();
console.log(arr);

console.log("Removed Elements : ",x,y);

//Unshift  ////Inserts new elements at the start of an array, and returns the new length of the array.
// 
let newarray_Size = arr.unshift(5); 
console.log(arr);
console.log("New Array Size :",arr);

// Shift  //Removes the first element from an array and returns it. If the array is empty, undefined is returned and the array is not modified.
let firstELem = arr.shift(); 
console.log(arr);
console.log("First Popped Elem :",firstELem);
let arr2 = new Array();
console.log("first poped element of Newly Created array with 0 elements :" , arr2.shift());


let arr3 = [10,20,30,40,50];
//!splice() // It is used to add/remove the array elements from the array list.

//deleting array Element
arr3.splice();
console.log(arr3);
// arr3.splice(1,2);
let removedElem = arr3.splice(1,2);
console.log("Deleted Array Elements :" + removedElem);
console.log(arr3);

//Adding array ELement
arr3.splice(1,0,"new1",true,"new2");
console.log(arr3);

//deleting & adding the array element.
let x1 = arr3.splice(3,1, false ,'sdfsd');
console.log("Removed Element x1 : "+x1);
console.log(arr3);
let x2 = arr3.splice(3,1, false ,'sdfssd',arr3);
console.log("Removed Element x2 : "+x2);
console.log(arr3);

/*

    push():- It is used to add the element at the last (It will return the new array length)
    ex:-

    pop():- It is used to remove/delete the element from the last in array list , it will change array length.

    unshift():- It is used to add the element at the first & it will return the array length.

    shift():- It used to remove/delete the element from the first in array list & ( it will change array length ).

    splice():- It is used to add & delete the array elements from the array list.

*/


let arr23 = [10,20,30,40,50];
let arr24 = [10,20,30,40,50];

//loop Method
console.log(arr23);
for(let i = 0; i < arr23.length ; i++){
    arr23[i] +=5;
    // console.log(i); //index position
    //arr[i]+5; // Common Operation
}
console.log(arr23);

// Map Method  :- It is used to do common operation for the array elements.
console.log("Using Map method");
arr24.map((elem,index,arr24)=>{
    console.log(elem+5);
})
console.log(' ');
arr24.map((elem,index)=>{
    console.log(elem+5);
})


// 7 * 1 = 7
// 7 * 2 = 14
var a = Number(prompt("Enter a Number", 2));  
console.log(a);
console.log(typeof a);
for(let i = 1 ; i <= 10 ; i++){
	console.log(`${a} * ${i} = ${a*i}`);
}	