let person = {
    firstName : "Dinga",
    lastName: "Raja",
    place: "Goa",
    dob: 1958,
    marriedStatus: true,
    fullName:function(){
        console.log(`My name is ${this.firstName} ${this.lastName}`);
    },
    calculateAge:function(){
        let age = 2024 - this.dob;
        console.log(`${this.firstName} age is ${age}`);
    }
}
console.log(person);
person.fullName();
person.calculateAge();

let cons = {
    lg:function(ms2){
       console.log(ms2);
    },
    wrn:function(wr){
        console.warn(wr);
    },
    err:function(er){
        console.error(er);
    }
}
console.log("Hello");
cons.lg("Hai");

console.warn('Warning');
cons.wrn("Warn");

console.error("Error");
cons.err("Danger")

// this keyword used to refer the current object.

// Object Creation by using new keyword

let o = new Object();
console.log(typeof o);

let car = new Object();
console.log(car);
console.log(typeof car);

car.carName = "Ferrari";
car.carColor = "Black";
console.log(car);
/*
    2.Using "new" keyword
        -> It is used to create the objects with the help of constructor methods (Inbuilt/Explicit) Methods.

        ex:-    let o = new Object()
                    Here Object() is inbuilt method or constructor method . We are converting from (Inbuilt Method/Constructor Method)  to the Object using "new" keyword.


*/