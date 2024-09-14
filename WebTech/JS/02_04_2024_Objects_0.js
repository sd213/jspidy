//todo: using Direct Literals
let obj = {}

console.log(obj);
console.log(typeof obj);

let car = {
    carName: 'BMW',
    carColor: 'Black'
};
console.log(car);
console.log(typeof car);

// Access the property from the object
// todo : Using dot(.) Operator

let cn = car.carName;
console.log(`My Fav Car is ${cn}`);
console.log(car.carColor);

// todo : using subScript Operator([""])
console.log(car["carName"]);
let student = {
    age : 24,
    qualification: 'B.tech',
    steam: 'CSE',
    graduationYear:2024,
    skills:['linux','mechanics','Devops','Algorithm','Coding']
};
// Modification
    // todo : Update the Property value
    // Syntax : objectName.propertyName = newValue
    student.marks = '60%';
    console.log(student);
    // todo: Adding the Property to  the Object
    // Objectname.newPropertyName = newPropertyValue
    student.place = 'Goa';
    console.log(student);
    // todo: Delete the Property
    // delete (keyword)  objectName , propertyName
    delete student.age;
    delete student.marks;
    console.log(student);
/*
    Objects:
        -> Objects is a block of code we can create the property name & value pair.
        -> Here states represents the properties of objects and behaviour represents functionality / action of an object.
            Ex: 
                Car (States : name , color etc..)
                    (behaviour : start engine , apply break etc...)
        -> In object two properties we are separated with comma(,).
        -> In JS we can create the objects using following ways ?

            1.Direct Literals
            2.new keyword
            3.Constructor function.

        -> In objects the data will be stored in the form of properties ( name & value) pairs.

        1. Direct Literals: - 
            ->Using the curly braces we are creating the objects.
            ->Inside the  objects we can write the properties with name & value pair.
            ->Two properties are separated with comma(,)

            let/var/const variable_name = {
                            propertyName 1 : value 1;
                            propertyName 2 : value 2;
                            propertyName 3 : value 3;
                            ----;

                            propertyName n : value n;
            }
        Nodte: To access the data from the objects we use following 2 ways.
            1.Dot Operator(.)
            2.Subscript Operator([]);
        
        // Modification
        // todo : Update the Property value
        // Syntax : objectName.propertyName = newValue
                student.marks = '60%'
                console.log(student);
        // todo: Adding the Property to  the Object
        // Objectname.newPropertyName = newPropertyValue
                student.place = 'Goa'
                console.log(student);
        // todo: Delete the Property
                delete (keyword)  objectName.propertyName
                delete student.age
*/