let url = fetch('https://api.github.com/users');


console.log(url); /*
Promise {<pending>} [[Prototype]] : Promise, 
[[PromiseState]] : "fulfilled" ,
[[PromiseResult]] : Response*/

let obj0 = url.then((resp)=>{
    return resp;
})

console.log(obj0);
// obj0.then((arr) => {
//   arr.map((elem) => {
//     console.log(elem.login);
//   });
// });


let obj1 = url.then((resp)=>{
    return resp.json()
})
console.log(obj1);

obj1.then((arr)=>{
    arr.map((elem)=>{
        console.log(elem.id,elem.avatar_url,elem.login);
        // console.log(elem.login);
        // console.log(elem.avatar_url);
        // console.log(elem.avatar_url);
    })
})
