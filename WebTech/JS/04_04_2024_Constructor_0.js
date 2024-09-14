// Object Creation by Using Constructor Method.

function p1(){
    console.log('##############P1 #######Execution');
    console.log("Hello");
}

p2 = function(){
    console.log('##############P2 #######Execution');
    console.log("World");
}

function p3(){
    console.log('##############P3 #######Execution');
    console.log('this:'+this);
    this.fm = 'old';
}

function p4(){
    console.log('##############P4 #######Execution');
    console.log('this:'+this);
    this.fnm = 'Dinga',
    this.lnm = 'Raja',
    this.gender = 'Male';
    this.age=23;
    this.address='At/po- Jajpur, Odisha';
    this.phno='359040990';
    this.marriage=false;
    this.course='B.Tech';
    this.stream='Computer Science And Engineering';
    this.institure='TITE';
    this.language='Odia';
    console.log('this:'+this);
}
console.log('\n\n\n\n');
let person1 = p1();
console.log(person1);
console.log(p1);
console.log(typeof person1);
console.log('\n');
let person2 = p2();
console.log(person2);
console.log(typeof person2);
console.log('\n');
let person3 = p3();
console.log(person3);
console.log(typeof person3);
console.log('\n');
let person4 = p4();
console.log(person4);
console.log(typeof person4);
console.log('\n');
let person5 = new p4();
console.log(person5);
console.log(typeof person5);
console.log('\n');

function p5(fname='abc',lname){
    this.fnm = fname;
    this.lnm = lname;
}
let person6 = new p5('Dinga','Raja');
console.log(typeof person6);
console.log(person6);

let person7 = new p5();
console.log(person7);

let n = Number(100);
console.log(n);
/*
    3. Constructor Function
        -> In Javascript normal js function can be used to create objects by using "this" keyword & "new" keyword.

        -> "this" keyword is used to refer the current Object.

        Note:-
            By using constructor function easily we can create the 'n' number of object.
*/