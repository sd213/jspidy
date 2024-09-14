let arr19 = [10,'hai',true, undefined , null,100,'Bye',false];
let arr20 = arr19.filter((elem)=>{
    return typeof(elem) === 'string';
})
console.log(arr20);
// debugger;
let arr21 = [2,3,4,7,3,6]
arr21.reduce((preVal,curVal)=>{
    let res = preVal + curVal;
    console.log(` Previous Value = ${preVal} , Current Value = ${curVal}`);
    // return preVal+curVal;
})
arr21.reduce((preVal,curVal)=>{
    let res = preVal + curVal;
    console.log(` Previous Value = ${preVal} , Current Value = ${curVal}`);
    return preVal+curVal;
})
arr19.reduce((preVal,curVal)=>{
    let res = preVal + curVal;
    console.log(` Previous Value = ${preVal} , Current Value = ${curVal}`);
})

let arr22 = [8,6,5,7,4,1,2,8,3,9,12];
console.log(arr22);

let s1 = arr22.sort()
console.log(s1);

let arrStr23 = ['grapes','apple','orange','banana','kiwi','jackfruit','mango'];
console.log(arrStr23);

let s2 = arrStr23.sort();
console.log(s2);

let arrStr24 = [63,64,68,82,49,45,78,93,92,37];
console.log(arrStr24);

let s3 = arrStr24.sort();
console.log(s3);

let arrSrt25 = [64,63,8,82,49,5,78,3,92,37];
console.log(arrSrt25);

let s4 = arrSrt25.sort();
console.log(s4);
console.log(arrSrt25);


let s5 = arrSrt25.sort((a,b)=>{
    return a-b;
})
console.log(s5);
console.log(arrSrt25);
let s6 = arrSrt25.sort((a,b)=>{
    return b-a;
})
console.log(s6);
console.log(arrSrt25);
// Wap to print second largestNumber by using arrowFunction;
let arrSrt26 = [63,364,8,482,682,270,420,50,750,350,42,275];
console.log(arrSrt26);
let seconLargetst = (arrSrt26)=>{
    let leng = arrSrt26.sort((a,b)=>{
        return b-a;
    })
    return leng[1];
}
console.log(seconLargetst(arrSrt26));

//sirmethod
let arrSrt27 = [63,364,8,482,682,270,420,50,750,350,42,275];
let s7 = arrSrt27.sort((a,b)=>{
    return b-a;
})
console.log(s7);
console.log(s7[1]);


/*
// Map Method :-
    -> It is used to perform some common operation on each element of  an array.
    -> It return the new array of the modified elements & it is not affected  to original array.
    -> It accepts a function as a argument (call back function) that execute one time for each elements in an array.
    Syntax:-
            array.map((para1,para2,para3)=>{.....})
                para1 -> elements/value
                para2 -> index position
                para3 -> array on which we are performing.


// Filter Method:-
    -> It is used to filter the array elements based on the condition.
    -> it return a new array of filltered elements & it is not effected to the original array.
    -> It will accept a function as a argument (callback function) & it execute one time for each element in an array.
    Syntax:- array.filter((parm1,para2,para2)=>(.....))
        para1-> elements /value
        para2-> index position 
        para3-> array on which we are performing.
    
        Ex:-


//Reduce Method
    -> it is used to  reduce the whole array into a single value.
    -> it accepts a function as a argument( callback functions )
    -> it execute one time for each elements in array.
    Syntax:- array.reduce((previous value , currentvalue){

    });
    -> 

//Sort Method 
    -> It will sort the array in ascending order/descending order.
    -> It access a function as a argument( call back function ) that executes for all the element present in the array to compare.
    -> It will compare 2 elements from the array an each iteration and check the result is +ve/-ve , if result is +ve it will swap elements.
    -> Without any arguments , sort method will sort the array based on the ASCII value (ascending value).
    ->It will modify the orginal Array 
    syntax: array.sort((a,b)=>{
        return a-b / return b-a
    })
    Note: a-b : Ascending order
          b-a : Descending Order.
*/