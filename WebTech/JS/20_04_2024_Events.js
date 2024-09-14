function fun(){
    console.log("My name is Dinga");
}
function singleClick(){
    console.log("Clicked Single time");
}
function doubleClick(){
    console.log("Clicked Double time");
}

function key1(){
    console.log("on key down");
}
function key2(){
    console.log("on key press");
}
function key3(){
    console.log("on key up");
}
function chilmood(){
    console.log("Chil Mood");
}

function handleSubmit1() {
    console.log("yours Data");
}

function handleSubmit2() {
    console.log(event);
    event.preventDefault();
    console.log("Father's Data");
}
let handleSubmit3 = (e) =>{
    console.log(e);
    e.preventDefault();
    console.log("Mother's Data");
}

let handleSubmit = (e) => {
    e.preventDefault();
    console.log(e);
    console.log(e.target);
    console.log(e.target[0]);
    console.log(e.target[0].value);

    let fnm = e.target[0].value;
    let lnm = e.target[1].value;

    console.log(`My  name  is ${fnm} ${lnm}`);
}
// Calculator app in javascript
let Calculation=(e) =>{
    e.preventDefault();
    let firstNum = Number(e.target[0].value);
    // console.log(typeof(firstNum));
    let operator = e.target[1].value;
    let secondNum = Number(e.target[2].value);
    switch (operator){
        case '+':
            console.log(`${firstNum} + ${secondNum} = ${firstNum + secondNum}`);
            break;
            case '-':
                console.log(`${firstNum} - ${secondNum} = ${firstNum - secondNum}`);
                break;
                case '*':
                    console.log(`${firstNum} * ${secondNum} = ${firstNum * secondNum}`);
                    break;
                    case '/':
            console.log(`${firstNum} / ${secondNum} = ${firstNum / secondNum}`);
            break;
        }
}
    
    /*
     What are Events
        Events are used to perform some action on the webpage single click, double click ,copy ,paste,keyboard,events,mouse events etc..
        Note:-- Events are use as a attribute in the element/tags.
     
    onkeydown:
        - The onkeydown event occurs when the user presses a key on the keyboard.
        - Counts every keypress
    onkeypress:
        - The onkeypress event occurs when the user presses a key on the keyboard.
        - ignores backspace.
    onkeyup:
        - The onkeyup event occurs when the user releases a key on the keyboard.


    
     */