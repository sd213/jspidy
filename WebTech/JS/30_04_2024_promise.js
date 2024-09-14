let p  = new Promise((res,rej)=>{
    if(true){
        res("Selected 0");
    }
    else{
        rej("Rejected 0");
    }
})
console.log(p);
p.then((data)=>{
    console.log(data);
})
p.catch((err)=>{
    console.log(err);
})


let p2  = new Promise((res,rej)=>{
    if(false){
        res("Selected 1");
    }
    else{
        rej("Rejected 1");
    }
})
console.log(p2);
p2.then((data)=>{
    console.log(data);
})
p2.catch((err)=>{
    console.log(err);
})

let p3  = new Promise((res,rej)=>{
    // if(true){
    //     res("Selected 3");
    // }
    // else{
    //     rej("Rejected 3");
    // }
})
console.log(p3);
p3.then((data)=>{
    console.log(data);
})
p3.catch((err)=>{
    console.log(err);
})