// Async & Await

let fun1 = () =>{
    return "Welcome";
};
let fun2 = () =>{
    return new Promise((res)=>{
        setTimeout(()=>{
            res("to")
        },2000)

    })
};
let fun3 = () =>{
    return "Mock";
};

let main = () =>{
    console.log(fun1());
    console.log(fun2());
    console.log(fun3());
};
main();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
let fun4 = () =>{
    return "Welcome";
};
let fun5 = () =>{
    return new Promise((res)=>{
        setTimeout(()=>{
            res("to")
        },2000)

    })
};
let fun6 = () =>{
    return "Mock";
};

let main2 = async() =>{
    console.log(fun4());
    console.log(await fun5());
    console.log(fun6());
};
main2();
