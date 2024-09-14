let loginPage=(e) => {
    e.preventDefault();
    let userName = e.target[0].value;
    let passWord = e.target[1].value;
    console.log(userName,passWord);

    if(userName === 'Somit Das' && passWord === 'pa$$Word'){
        window.location = 'C:/Users/somit/Desktop/QsPiders/WebTech/JAVASCRIPT/20_04_2024_Events.html';
    }
    else{
        document.querySelector('h5').textContent = 'Invalid Content';
        document.querySelector('h5').style.color = 'red';
        document.querySelector('h5').style.textAlign = 'center';
        // alert("Credentials are not Matching");
        let err_Style = `border: solid 2px red`;
        e.target[0].style.cssText = err_Style;
        e.target[1].style.cssText = err_Style;
    }
}

let validation = (e) => {
    e.preventDefault();

    let user = e.target[0];
    let pass = e.target[1];

    let err = `border:solid 2px red`;
    if(user.value === "" || user.value === null){
        user.style.cssText = err;
    }
    else if(pass.value === "" || pass.value === null){
        pass.style.cssText = err;
    }
}
let validation2 = (e) => {
    e.preventDefault();

    let user = e.target[0];
    let pass = e.target[1];

    let err = `border:solid 2px red`;
    if(user.value === "" || user.value === null){
        user.style.cssText = err;
        return 0;
    }
    else if(pass.value === "" || pass.value === null){
        pass.style.cssText = err;
        return 0;
    }
    else{
        return 1;
    }
}
let loginPage2=(e) => {
    e.preventDefault();
    let userName = e.target[0].value;
    let passWord = e.target[1].value;
    console.log(userName,passWord);

    if(userName === 'Somit Das' && passWord === 'pa$$Word' && validation2(e)){
        window.location = 'C:/Users/somit/Desktop/QsPiders/WebTech/JAVASCRIPT/20_04_2024_Events.html';
    }
    else{
        document.querySelector('h5').textContent = 'Invalid Content';
        document.querySelector('h5').style.color = 'red';
        document.querySelector('h5').style.textAlign = 'center';
        // alert("Credentials are not Matching");
        let err_Style = `border: solid 2px red`;
        e.target[0].style.cssText = err_Style;
        e.target[1].style.cssText = err_Style;
    }
}