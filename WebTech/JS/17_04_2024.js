function num(...arr){
    // console.log(arr);
             

    //sort method
    let ascending = arr.sort((a,b)=>a-b);
    console.log(ascending);
    console.log(ascending[0]);
    console.log(ascending[ascending.length-1]);

    //mATH
    console.log("Max: "+ Math.min(arr));
    console.log("Max: "+ Math.max(arr));
    console.log("Max: "+ Math.min(...arr));
    console.log("Max: "+ Math.max(...arr));
}
num(8,6,7,5,4,1,2,3,9);
console.log(Math.PI);
console.log(Math.sqrt(8));
console.log(Math.pow(2,4));
console.log(Math.pow(20,3));
console.log(Math.round(251.854));
console.log(Math.floor(251.854));
console.log(Math.ceil(251.854));

let randomNum = Math.random()*1000;
console.log(Math.floor(randomNum));

let power = (a,b)=>{
    console.log(Math.pow(a,b));
    console.log(Math.trunc(Math.random()*Math.pow(a,b) + 1));
}
power(5,2);

let generateOtp = ()=>{
    let randomNumber = Math.random()*1000;
    let otp = Math.floor(randomNumber);
    if(otp>999 && otp <10000){
        console.log(otp);
    }
    else{
        generateOtp()
    }
}
generateOtp();
let generateOtp2 = () =>{
    let otp = Math.floor(Math.random()*10000);
    (otp>=1000 && otp <= 9999) ? console.log(ran):generateOtp2();
    
}
generateOtp2();
let generateOtp3 = () => {
    let reandomNumber = Math.random()* (9999-1000) + 1000;
}