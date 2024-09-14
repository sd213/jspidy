firstDiv = document.getElementsByTagName('div')[0];
console.log('Before',firstDiv.classList);
firstDiv.classList.add('box');
console.log('After',firstDiv.classList);

let onOff = () =>{
    let btn = document.getElementsByTagName('button');

    //console.log(btn[0].classList);
    // btn[0].classList.add('abc');
    //console.log(btn[0].classList);
    console.log('Before ',btn[0].classList);
    btn[0].classList.remove('on');
    console.log('After ', btn[0].classList);
}
let div = document.getElementsByTagName('div');
let redColor = () => {
    div[1].classList.add('red')
    div[1].classList.remove('yellow');
    div[1].classList.remove('green');
    console.log(div[1].classList);
}
let yellowColor = () =>{
    div[1].classList.add('yellow');
    div[1].classList.remove('red');
    div[1].classList.remove('green');
    console.log(div[1].classList);
}
let greenColor = () =>{
    div[1].classList.add('green');
    div[1].classList.remove('yellow');
    div[1].classList.remove('red');

}
let onOffBtn = () =>{
    let btn = document.getElementById('btn1');
    let b1 = btn.classList.toggle('On');
    let b2 = btn.classList.toggle('Off');

    // if(b1){
    //     btn.innerText = 'On';
    // }
    // else{
    //     btn.innerText = 'Off';
    // }
    // // if(b2){
    // //     btn.innerText = 'Off';
    // // }
    // let text = btn.innerText;
    // btn.innerText = (text === 'On')? 'Off':'On'; 
    btn.innerText = (b2)? 'Off':'On'; 
    console.log(b1,b2);

} 