package com.exceptions;

import java.util.Arrays;

public class ReferenceVsValueTypes {
    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // here 2 references pointing to the same array location in memory. as new is not used create new object and it is modifiable also does not copied object.

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+ Arrays.toString(anotherArray));

        anotherArray[0]=1;
        modifyArray(myIntArray);
        System.out.println("After Change in anotherArray,  myIntArray = "+Arrays.toString(myIntArray));
        System.out.println("After Change in anotherArray,  anotherArray = "+Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) { // here we are passing array using  actual reference . so we are not passing copy of array
        array[1] = 2;
    }
}

/*
In Java, understanding how reference types and value types are passed to methods is crucial for avoiding common pitfalls and writing efficient, bug-free code. Here's a detailed explanation:

### Passing Value Types
In Java, value types are the primitive data types (`int`, `float`, `boolean`, etc.). When you pass a primitive data type to a method, Java passes it by value, meaning that a copy of the variable is passed. Any changes made to the parameter inside the method do not affect the original variable.

**Example:**
```java
public class Example {
    public static void main(String[] args) {
        int x = 5;
        modifyValue(x);
        System.out.println("After modifyValue: " + x); // Output: 5
    }

    public static void modifyValue(int number) {
        number = 10;
    }
}
```
In this example, the original value of `x` remains unchanged after calling `modifyValue`, because `number` is a copy of `x`.

### Passing Reference Types
Reference types in Java include objects and arrays. When you pass an object or an array to a method, Java passes the reference to that object or array, not the actual object or array itself. This means that the method receives a copy of the reference (a pointer) to the original object. Any changes made to the object through this reference will affect the original object.

**Example:**
```java
public class Example {
    public static void main(String[] args) {
        Person person = new Person("John");
        modifyReference(person);
        System.out.println("After modifyReference: " + person.name); // Output: Doe
    }

    public static void modifyReference(Person person) {
        person.name = "Doe"; // This changes the original object's name
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
```
In this example, the `person` object's `name` attribute is modified within the `modifyReference` method. Because `person` is a reference type, the change is reflected in the original `person` object.

### Key Differences
- **Value Types (Primitives)**:
  - Passed by value: The method gets a copy of the variable.
  - Changes to the parameter do not affect the original variable.
- **Reference Types (Objects/Arrays)**:
  - Passed by reference (reference to the object): The method gets a copy of the reference to the object.
  - Changes to the object's attributes via the reference affect the original object.
  - Reassigning the reference itself within the method does not change the original reference.

**Example showing reassignment:**
```java
public class Example {
    public static void main(String[] args) {
        Person person = new Person("John");
        reassignReference(person);
        System.out.println("After reassignReference: " + person.name); // Output: John
    }

    public static void reassignReference(Person person) {
        person = new Person("Doe"); // This does not change the original reference
    }
}
```
In this example, reassigning `person` to a new `Person` object inside the `reassignReference` method does not affect the original `person` reference in the `main` method.

### Summary
- **Value types** are passed by value, meaning the method operates on a copy of the original variable.
- **Reference types** are passed by reference, meaning the method operates on the same object (or array) as the original variable, allowing changes to the object's attributes to persist outside the method. However, reassigning the reference within the method does not affect the original reference.
 */