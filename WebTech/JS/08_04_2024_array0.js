// let arr = [10,"hai",true,undefined,null,()=>{},{},[]];
// console.log(arr);
// console.log(typeof arr);
// console.log(arr[2]);
// console.log(arr.length);

// Modification of array
let arr1 = [10,20,30,40,50]
console.log(arr1);
console.log(typeof arr1);
console.log(arr1[2]);

// update of array elements
arr1[1]="hello";
console.log(arr1);

// Adding of an array 
arr1[6]=500;
console.log(arr1);

console.log(arr1[6]);
console.log(arr1[5]);

// delete of index 4 element
delete arr1[4];
console.log(arr1);

// W.A.P to display only the numbers in this array list by using general function 
function For1(arr){
    console.log('###########');
    for(let i = 0;i < arr.length;i++){
        console.log(arr[i]);
        
    }
    console.log('###########');
}
For1(arr1);

arr2 = ["hi",10,true,200,"bye",false];
For1(arr2);


function arrProgram1( ){
    console.log('###########');
    for(let i = 0;i < arr2.length;i++){
        // console.log(arr1[i]);
        if(typeof(arr2[i])==='number'){
            console.log(`${i} = ${arr2[i]}`);
        }
        
    }
    console.log('###########');
}
arrProgram1();
//W.A.P  to display only even numbers from this array list by using arrow function


let arr3=['Hi',10,15,true,20,25,30,55,210]
let arrowFunctionarr = (arr)=>{
  
        console.log('###########');
        for(let i = 0;i < arr.length;i++){
            if(typeof(arr[i])==='number' && arr[i]%2==0){
                console.log(`${i} = ${arr[i]}`);
            }
        }
        console.log('###########');
    
}
arrowFunctionarr(arr3);

/*
    Arrays:
        -> Javascript Array is used to store the multiple value in the single variable .

        -> Array can store the both homogenous and heterogenous values.

        -> Array will not have fixed length,generally they are are growing in nature.

        -> To Check the length of the array we are using the (arrayName.length)

        -> Datatype of Array is 'object'

        ->Ex:- let array = [10,'Hello',true,undefined,null,()=>{},{}]

        Indexing:-
            -> Javascript Array will be having index values to identify the elements of Array uniquely.

            -> Positive Indexing starts from '0' and ends at array of length - 1;
            negative indexing starts from '-1'and ends at the array of -length.

        Can We Modify the Original Array or not?
            -> Yes , we can modify the Javascript array because they are mutable in nature.

            -> We can modify like accessing,adding,deleting,updating the array etc..
            ex:-
                arr1[6]=500;
                console.log(arr1[6]);

    Array Methods:-
        1.push()-
        2.pop()-
        3.unshift()-
        4.shift()-
        5.splice()

        6.map()
        7.filter()
        8.reduce()
        9.sort()
    
        10.indexOf()
        11.lastIndexof()
        12.include();
        13.slice();
        14.flat()
        15.join()

        i.spread Operator
        ii.rest Operator
*/