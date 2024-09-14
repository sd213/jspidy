package com.exceptions;

import java.util.Arrays;

/*
In Java, `[]` and `...` are both used to represent arrays, but they have different purposes and use cases.

### `[]` (Array)
- **Purpose**: Declares an array.
- **Usage**: Used when defining a fixed-size array of a specific type.
- **Example**:
  ```java
  // Declare an array of integers
  int[] numbers = new int[5];

  // Initialize an array with values
  int[] numbers = {1, 2, 3, 4, 5};

  // Accessing elements
  System.out.println(numbers[0]); // Output: 1
  ```

### `...` (Varargs)
- **Purpose**: Declares a variable-length argument list in a method parameter.
- **Usage**: Used when you want a method to accept zero or more arguments of a specified type.
- **Example**:
  ```java
  // Method with varargs
  public static void printNumbers(int... numbers) {
      for (int number : numbers) {
          System.out.println(number);
      }
  }

  // Call the method with different numbers of arguments
  printNumbers(1);          // Output: 1
  printNumbers(1, 2, 3);    // Output: 1 2 3
  printNumbers();           // Output: (nothing)
  ```

### Key Differences
- **Declaration**:
  - `[]` is used to declare an array variable.
  - `...` is used to define a method parameter that accepts a variable number of arguments.

- **Instantiation**:
  - `[]` requires the array to be instantiated with a fixed size.
  - `...` does not require instantiation; the method can be called with any number of arguments.

- **Usage Context**:
  - `[]` is used for any array handling in Java.
  - `...` is specifically used in method signatures to allow for a flexible number of parameters.

### Example Combining Both
Here's an example where a method that uses `...` internally deals with an array:

```java
public class Example {

    // Method with varargs
    public static void printSum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        // Using varargs
        printSum(1, 2, 3, 4, 5); // Output: Sum: 15

        // Using array
        int[] nums = {6, 7, 8};
        printSum(nums); // Output: Sum: 21
    }
}
```

In this example, `printSum` can be called with individual integers or an array of integers. The varargs parameter `int... numbers` is treated as an array within the method.
 */
public class VarArgs {
//    public static void main(String[] args) {
    public static void main(String... args) {
        System.out.println("Hello Again");
//        String[] splitStrings = "Hello World Again.".split("\\.");
        String[] splitStrings = "Hello World Again".split(" ");
        System.out.println(Arrays.toString(splitStrings));
        System.out.println("\nUsing [] ");
        System.out.println("_".repeat(20));
        printText1(splitStrings);
        System.out.println("\nUsing ...");
        System.out.println("_".repeat(20));
        printText2(splitStrings);

        System.out.println("\n\n\n");
        String[] sArray = {"first","second","third","fourth","sd","das"};
        System.out.println(String.join(", ",sArray));
        // here internally in String class join method '...' is used as  "public static String join(CharSequence delimiter, CharSequence... elements) " of String Class
    }
    private static void printText1(String[]textList){
        for(String t:textList){
            System.out.println(t);
        }
    }
    private static void printText2(String...textList){
        for(String t:textList){
            System.out.println(t);
        }
    }

}
//split method on String, split into pieces, and the method returns an array of the parts, an array of String.
//join method on String, which concatenated multiple Strings together, into one String.
/*
In Java, both `main(String[] args)` and `main(String... args)` can be used to define the main method, but they have different implications for how the method can be called and how it handles the input.

### `main(String[] args)`
- **Standard Method Signature**: This is the traditional and most commonly used signature for the `main` method in Java.
- **Purpose**: It indicates that the method accepts an array of `String` objects.
- **Usage**: When the Java Virtual Machine (JVM) starts, it calls the `main` method with the command-line arguments as an array of `String`.

**Example**:
```java
public class Example {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
```

### `main(String... args)`
- **Varargs Method Signature**: This is an alternative way to define the `main` method using variable arguments (varargs).
- **Purpose**: It indicates that the method can accept zero or more `String` arguments.
- **Usage**: The varargs syntax allows the method to be called with any number of `String` arguments. Internally, the varargs are handled as an array of `String`.

**Example**:
```java
public class Example {
    public static void main(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
```

### Key Differences
1. **Method Signature**:
   - `main(String[] args)`: Uses a fixed array of `String` objects.
   - `main(String... args)`: Uses varargs, which allows for a flexible number of `String` arguments but is treated as an array internally.

2. **Calling Method**:
   - `main(String[] args)`: Called with an array of `String` objects.
   - `main(String... args)`: Can be called with an array of `String` objects or a list of `String` arguments.

### JVM Behavior
- The JVM treats both `main(String[] args)` and `main(String... args)` similarly. When you run a Java application, the JVM passes the command-line arguments as an array of `String` objects. Whether the method signature is `main(String[] args)` or `main(String... args)`, the JVM converts the command-line arguments into a `String[]` and calls the method.

### Best Practice
- **Standard Usage**: It is generally recommended to use `main(String[] args)` because it is the conventional way to define the `main` method and is easily recognizable by developers.
- **Flexibility**: If you prefer the flexibility of varargs for some reason, `main(String... args)` can be used, but this is less common.

### Conclusion
While both signatures are valid and functionally equivalent in terms of how the JVM handles command-line arguments, `main(String[] args)` is the standard and more widely recognized signature for the `main` method in Java applications.
 */
