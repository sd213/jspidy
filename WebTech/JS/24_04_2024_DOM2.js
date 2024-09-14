let dayNight = () =>{
    let btnName = document.getElementById('btn');
    let text = btnName.innerText;

    if(text === 'Day'){
        btnName.innerText = 'Night';
        document.body.style.cssText = `background:black;color:white`;
    }
    else{
        btnName.innerText = 'Day';
        document.body.style.cssText = `background:white;color:black;`
    }
}

let i = 1
let arr=[1,2,3,4,5,6,7,8,9,10];
var elem = document.getElementsByTagName('img');
console.log(elem[0]);
console.log(elem[0].src);
// console.log(elem[0].innerText);
console.log(arr.length);
function changeMe(){
    var newImage = document.createElement('img');

    // if(i<arr.length){
    //     i++;
    //     newImage.src=`../JAVASCRIPT/Images/${i}.jpg`;
    //     elem[0].parentNode.replaceChild(newImage,elem[0]);
    // }
    // else if(i==arr.length){
    //     i = 1;
    //     newImage.src=`../JAVASCRIPT/Images/${i}.jpg`;
    //     elem[0].parentNode.replaceChild(newImage,elem[0]);
    // }
    if(i<arr.length){
        i++;
        console.log(i);
        elem[0].src=`../JAVASCRIPT/Images/${i}.jpg`;

    }
    else if ( i == arr.length){
        i=1;
        console.log(i);
        elem[0].src=`../JAVASCRIPT/Images/${i}.jpg`;
    }
}
let changeImage = () =>{
    //let image = document.getElementsByTagName('img');
    //console.log(image[0]);

    let image = document.querySelectorAll('img');
    //console.log(image.src);
    image[1].src = `../JAVASCRIPT/Images/2.jpg`;
}
let onBulb = () =>{
    let image = document.querySelectorAll('img');
    // console.log(image[2].src);
    image[2].src = `../JAVASCRIPT/Images/ONbulb.jpg`
}

let offBulb = () =>{
    let image = document.querySelectorAll('img');
    image[2].src = `../JAVASCRIPT/Images/OFFbulb.jpg`
}

let displayColor = () =>{
    let color = prompt('Enter Color');
    document.body.style.background = color;
}

/*
    getElementById()
        - This method is used to select HTML elements based on the ID name.
        - ID name has to be passed as argument for this method .
        - This method will return an element with whatever ID name we have been passed.
        - This method will return one element since ID's are unique.
        - Ex:-
            document.getElementByid('header');

    getElementsByTagName()
        -  This method is used to select HTML elements based on this Tag Name.
        - To select the elements using Tag name pass "tagName" as an argument to this method as form of string.

        - This method will return arrayed tag.

        - Ex:-  
                let atag = document.getElementsByTagName('a');
                atag[0];

    getElementsByName()
        -   This method returns a live nodeList of elements with the given name attribute. The name attribute is used on specific types of elements such as <input>, <form>, <iframe>,<img>, <object>, <textarea>, and <select>. 
        example:
            let elements = document.getElementsByName('myElementName');
    
    getElementsByClassName()
        -   This method returns a live nodeList of elements with the given class name. Elements can have multiple classes, and a class can be shared by multiple elements. 
        
        example:
            let elements = document.getElementsByClassName('myClassName');
    
    
    querySelector()
        -   This method helps to select HTML elements based on Css selector.
        
        -   We can pass class Selector (.classname),id Selector (#idname),Element Selector(Tagname) etc.

        -   This method return only first Match

        -   Ex:-
                document.querySelectorAll(`.container`);
        
    Change the content:-
        SelectedElement.innerText
        SelectedElement.innerHtML

    To Change the Image:-
        SelectedElement.attributeName = "NewValue";

    To Change the Style:-
        SelectedElement.style.cssText = `css Code`;
        SelectedElement.style.cssPropertyName = `value`;
        SelectedElement.style = `css Code`;

    To add & remove the element:-
        document.createElement()
        SelectedElement.appendChild()
        SelectedElement.remove()
        
*/