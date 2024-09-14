/*
    BOM
    ====
        1.screen
        2.location
        3.history
        4.document
        5.events
        6.popup's 
            prompt()
            alert()
            convirm()
        7.Timing Functions

*/
function fun(){
    alert("I'm giving alert me to u ...");
}
let fullName = () =>{
    let fnm = prompt("Enter First Name");

    alert(`Weclome , ${fnm}`);
}
let add = () =>{
    let num1 = prompt("Enter Num 1");
    let num2 = prompt("Enter Num 2");

    let concat = num1 + num2;
    alert(`concat : ${num1} + ${num2} = ${concat}`);
    let sum = Number(num1) + Number(num2);
    alert(`sum : ${num1} + ${num2} = ${sum}`);
}

let printDetails = () =>{
    let fname = prompt("Enter Name");
    if(fname === ''|| fname === null){
        let bool = confirm("do you want to exit. ? ");
        bool ? alert("Thank You. ! "):printDetails();
    }
    else{
        alert(`My name is ${fname}`);
    }
}

/*
    Popups
        1. alert()
            - It is used to display the alert message to the end user
            - In this we will get only one button i.e (ok button)
            - Ex:- alert('Alert Message');

        2. confirm()
            - It is used to take additional confirmation from user .
            - confirm method will return boolean value ( true / false).
            - if ok button is pressed , it will return true otherwise false.
            - Ex:- confirm("I am in Javascript Class");

        3. propmt()
            - It is used to take the input from the user .
            - It will return value entered in the input form of string if 'ok' is pressed else it will return null.
            - Ex:- prompt('Enter Name');
*/