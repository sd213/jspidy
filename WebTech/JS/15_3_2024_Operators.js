//operator

//ARITHEMATIC 

let a =10
let b =20
let c='10'

console.log(typeof a);//number
console.log(typeof b);//number
console.log(typeof c);//string
let sum = a+b
console.log(sum);//30
console.log(typeof sum);//number

let x = a+c
console.log(x);//1010
console.log(typeof x);//string

let x1=a+b+c
console.log(x1);//3010

console.log(10+20+'10');//3010
console.log(10+'10'+20);//101020
console.log('20'+10+20);//201020*//


console.log(10*'10');//20
console.log(10+'10');//1010
console.log(10*10);//100
console.log(10*'10')//100






//interview question
let n='3'+'3'-'3'
console.log(n);//30
console.log(typeof n);//number


let n1='3'-'3'+'3'
console.log(n1);//03
console.log(typeof n1);//string

console.log(true+1);//2
console.log(true+true);//2
console.log(true+'1');//true1
console.log('true'+1);//true1
console.log(true-1);//0
console.log(true-'1');//0
console.log('true'-1);//NaN
console.log('abc'-1);//NaN
console.log(true-'false');//NaN

console.log(undefined+undefined);//NaN
console.log(NaN+NaN);//NaN
console.log(Number(undefined));//NaN

console.log(Number(null));//0

console.log(1+null);//1
console.log(1+undefined);//Nan
console.log(1+NaN);//NaN
console.log(1+'undefined');//1undefined
console.log(null+undefined+NaN);//NaN
console.log(null+undefined+true+'NaN');//NaNNaN
console.log(undefined+'Nan'+true+null);//undefinedNaNtruenull
console.log(undefined+'NaN'+true-null);//NaN