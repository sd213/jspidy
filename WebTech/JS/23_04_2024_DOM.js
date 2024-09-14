let changeContent = () =>{
    let selectedElem = document.getElementById('demo');
    selectedElem.innerText = 'Moye Moye';
    // selectedElem.style.backgroundColor = 'red';
    selectedElem.style.cssText = `color:red;
    background:yellow;
    font-size:54px;
    text-align:center;
    box-shadow:3px 3px 3px gray;
    text-shadow:1px 1px 1px gray;`
}

let example2 = () => {
    let tags = document.getElementsByClassName('text');
    //console.log(tags[1]);
    tags[1].style.cssText = 'color: orange ; background-color :gray;'
}

let example3 = () => {
    let boxes = document.getElementsByClassName('box');
    if(boxes[0].innerText==='Hello'){

        boxes[0].innerText = 'Bye';
        boxes[1].style.cssText = `color:blue;background-color:yellow`;
        boxes[2].style.borderRadius = '50%';
    }
    else{
        boxes[0].innerText = 'Hello';
        boxes[1].style.cssText = `color:black;background-color:red`;
        boxes[2].style.borderRadius = '0%';
    }

}
let onoff = () =>{
    let b = document.getElementById('btn');
    let text = b.innerText;
    //without toggle method  we are using this logic for OFF and ON vice versa.
    if(text === 'ON'){
        b.innerText = 'OFF'
        b.style.cssText = 'color:blue; background-color:white;padding:10px 20px;';
    }
    else{
        b.innerText = 'ON';
        b.style.cssText = 'color:red; background-color:yellow;padding:10px 20px;';
    }
}
/*
    Document Object Model
        -> Under the window object we have document object which helps to control HTML document.
        -> Under the document object according to HTML code a structure will be created which is called a DOM.
        -> Whenever HTML page loads DOM is created by Browser.
        -> In Dom html element will be treated as  javascript Object,
        Attributes of HTML elements will become properties of that Object.
            HTML: DOM tree
            HTML: DOM structure
        -> Dom is used for dynamically changing the HTML pages by doing some DOM manipulation.
        ex:-
                                        |--Meta
                            |-------head
                            |           |--title
                DOM---------HTML
                            |           |--heading
                            |-------body

    Dom Manipulation:-
        -> To make the page as dynamic we will change the DOM which is turn called as DOM manipulation.
        -> To do DOM manipulation following steps as to be used.
            -> Select the HTML element which has to be changed.
            -> To select the HTML element following methods will be used which are present in Document Object.
                - getElementById()
                - getElementByClassName()
                - getElementsByTagName()
                - getElementsbyName()
                - querySelector()
                - querySelectorAll()
            -> To do the changes.
                - Change the content
                - Change the CSS Style
                - Add & remove HTML elements.
                - Add & remove Class
                - Change the Attribute


*/