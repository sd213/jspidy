let root= document.querySelector('.root');
let url = fetch("https://api.github.com/users");

let obj = url.then((resp)=>{
    return resp.json();
})

obj.then((arr)=>{
    arr.map((elem)=>{
        // console.log(elem.login)
        let {avatar_url , login ,id} = elem; //Destructuring
        root.innerHTML +=`
            <div class=container>
                <div> <img src=${avatar_url}</div>
                <div class=text>${login}</div>
                <div class=text>${id}</div>
            </div>`
    })
})
// https://fakestoreapi.com/products