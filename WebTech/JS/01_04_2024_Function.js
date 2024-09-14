// !Function
//!Call Back Function

let num = function(){
    return 100;
}

let sum = function(a,b){
    let add = a + b;
    console.log(add);
}
sum(num(),200);
sum(num,200);

let sum1 = function(a,b){
    let add = a()+b;
    console.log(add);
}

sum(function(){
    return 100;
},200)
// here sum() is highorder function.
// here ' funtion(){ return 100;} ' is callback function.

function sum2(a,b){
    let add = a()+b;
    console.log(add);
}
sum(function(){
    return 100;
},200);

// 
let surname = function(){
    let k = 'kanth;'
    return k;
}
function fullName(fnm,lnm){
    console.log(`my name is ${fnm}${lnm}`);
}
fullName('Rajni',surname());
fullName('somit',surname());

//
let fullName2 = (fnm,lnm) =>(`My name is ${fnm} ${lnm}`);

console.log(fullName2('jason',surname()));

/*
    A function which is passed as the arguement of another function is called as callback function.
    ex:-
        function num(){
            return a;
        }
        function sum(x,y){
            return x+y;
        }
        let res = sum(10 , num());

        console.log(res);
            Here in the Ex,
                -> num() is a callback function because as a argument we are passing the function.
                -> sum() is a higher order function (HOF)
                NOTE:- 
                    Hof is a function which is accepting the another / callback function as a parameter.
*/




