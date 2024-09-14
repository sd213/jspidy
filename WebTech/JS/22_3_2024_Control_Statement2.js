let num = 10;
if(num > 0){
    document.writeln(`${num} is +ve number`);
    if(num % 2 == 0){
        document.writeln(`${num} is even number `);
    }
    else{
        document.writeln(`${num} is odd number`);
    }
}
else if(num < 0){
    document.writeln(`${num} is -ve number`);
    if(num % 2 == 0){
        document.writeln(`${num} is even number `);
    }
    else{
        document.writeln(`${num} is odd number`);
    }
}
else{
    document.writeln(`${num} is neither +ve nor -ve number`);
}

let num2 = 'sdkf';
if(typeof(num2)==='number'){
    if(num2 > 0){
        document.writeln(`${num2} is +ve number`);
        if(num2 % 2 == 0){
            document.writeln(`${num2} is even number `);
        }
        else{
            document.writeln(`${num2} is odd number`);
        }
    }
    else if(num2 < 0){
        document.writeln(`${num2} is -ve number`);
        if(num2 % 2 == 0){
            document.writeln(`${num2} is even number `);
        }
        else{
            document.writeln(`${num2} is odd number`);
        }
    }
    else{
        document.writeln(`${num2} is neither +ve nor -ve number`);
    }
}
else{
    document.writeln(`Not a Number`);
}

let signal1 = 'red';
switch(signal1){
    case 'red' : console.error('stop 🛑');
    break;

    case 'yellow': console.warn('be ready 🟡');
    break;

    case 'green': console.warn('let\'s Goooooo 🚄....');
    break;

    default: console.log('RIP ☠')
}