let fun = () =>{
    let tagName = document.createElement('h1');
    tagName.innerText = 'Welcome';
    document.body.appendChild(tagName);
}

let fun2 = (e) =>{
    e.preventDefault();
    let data = e.target[0].value
    let tagName = document.createElement('h2');
    tagName.innerText = data
    document.body.appendChild(tagName);
}