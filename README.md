# Java Notes

Java notes from:

- Matt Speake, Java Beginner Course, [freeCodeCamp](https://www.youtube.com/watch?v=7WiJGTPuVeU)
- Angie Jones, Java Programming, [Test Automation University](https://testautomationu.applitools.com/java-programming-course/chapter1.html)

## Overview of Java

Java is a high-level, class-based, object-oriented programmign language.

According to the TIOBE index it is currently (2021) the most used programming platform in the world.

It's widely used in enterprise, including by Google, Amazon, Netflix, Airbnb, Spotify and Instagram.

The Android SDK uses Java as the basis for Android app development.

Java is very scaleable and can serve millions of clients at the same time. It powers approximately 3 billion devices worldwide.

Java is popular because of:

- platform independence - can be run on Windows, Mac and Linux
- 1000s of libraries - a large ecosystem of components are available
- versatility - applications can run from mobile devices to cloud services
- large market share and active community
- developer ecosystem - well-developed tools and technologies to support you

## The Java Language

Java has a smoother learning curve than more low-level languages.

It's object oriented and versatile.

It's fully rounded, with built-in APIs covering uses from networking to desktop applications.

## Java Platform Components

Java is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.

The Java Virtual Machine (JVM) lets you run Java applications on different operating systems.

The Java Runtime Environment (JRE) is essentially the package that contains the JVE.

The JVM runs byte code, the language that the Java programme is turned into so that the JVM can understand it.

The bytecode is created by a compiler (JAVAC) which takes your source code and coverts it into byte code (from `.java` files to `.class` files).

A hello world programme in Java looks like this:

```java
// App.java
public class App {
  public static void main(String[] args) {
    System.out.println("Hello world");
  }
}
```

## The Java Development Kit

The Java Development Kit (JDK) is a collection of programming tools to allow you to develop, debug and monitor Java applications on a particular operating system.

## IDEs

Integrated Development Environments (IDEs) are applications with comprehensive tools for software development, usually including a code editor, build automation tools and a debugger.

Eclipse and IntelliJ are two of the most common IDEs used for Java development, with Eclipse easier for beginners and IntelliJ more powerful for more advanced users.

## Java Syntax

In a Java application you can expect to find:

### Class definitions

Class definitions are the main unit of code you create.

```java
public class MyApp {
  // other code
}
```

Classes can be assembled into objects. These objects have methods on them that can be invoked to trigger specific actions.

Classes are capitalized and defined with the `class` keyword.

Classes hold methods, which will tell objects what to do, and data, which will tell objects what information to hold.

Most things you declare in Java have a visibility modifier. The `public` keyword means that everything inside the scope of the program will be able to see the class.

### Method declarations

A method contains code that you want to have happen.

```java
public void greet() {
  // other code
}
```

Methods are named with a lowercase name and parentheses, which contain the input parameters. If there are parameters, their type must be specified.

```java
public void greet(String name) {
  // other code
}
```

The `public` keyword means that a method can be seen by other classes in the program.

The `void` keyword indicates that a method does not return anything. If a method returns a value, that value's type must be specified.

```java
public String greet() {
  // other code
}
```

### Variable declarations

A variable is a place inside the program for storing a value. Variables are named with camelCase.

The type of a variable must be specified.

A class that is defined elsewhere in the program can be assigned to a variable.

```java
String recipientName = "John Green";

int numItems;

Address shippingAddress;
```

Classes can contain variables that are other classes.

```java
public class Address {
  private String addressLine1;
  private String addressLine2;
  private ZipCode zipCode;
  // more code
}
```

You can define variables inside a method or a class.

The `private` keyword means that only the thing that holds a variable can see that variable.

You can encapsulate data inside an object so it cannot be accidentally affected by other parts of the program.

There are two items to objects:

- data members, which hold the state of a given object
- methods, which can carry out actions

Public methods can be made available to other classes.

```java
public class Order {
  private String recipientName;
  private int numItems;
  private Address shippingAddress;

  public Long dispatch() {
    // code to send order
  }
}

public class OrderService {
  public void placeOrder(Order o, Customer c) {
    if (c.hasPaid()) {
      o.dispatch();
      // more code
    }
  }
}
```

The `main` method works like other methods.

`main` takes an array or strings. The strings can be accessed inside `main` using the `args` array.

`main` is marked with `void` because it doesn't return anything.

`main` is `static` because it can be invoked or run but doesn't have to be invoked against an object.

```java
public static void main(String[] args) {
  String parameter1 = args[0];
  // more code
}
```

## Writing a Java program

You need to set up a project to contain your code.

Your code goes in the `src` folder.

A package is a folder where you can group different source files to keep things organized.

In general, packages follow a reverse domain convention, for example `com.javaeasily.PACKAGE_NAME`.

Any classes in the `java.lang` package get imported automatically.

### Debugging

You can set breakpoints which will cause the program to stop running at a particular point.

You can step into a method and see the variables currently available to it.

You can alternatively step over a method and go to the next line.

You can also view the call stack of which methods were called in which order.

## Misc

The first line of your file will be the package declaration.

A statement is one instruction and ends with a semicolon.

To auto-import a class, use ctrl + space and choose it from the dropdown.

You can have different versions of methods to accept or return different types of values, for example one for strings and another for ints.

Please use descriptive variable names. Variable names cannot start with a number.

You can accept input from the user using the `Scanner` class.

You can write multi-line comments with `/* */`.

Try to avoid magic numbers. Instead assign numbers to a descriptive variable.

## Decision Structures

### If Statements

If statements work as quick detours from the main flow of execution.

They test a condition and execute code depending on whether that condition evaluates to true or false.

```java
if(sales > quota) {
  salary = salary + bonus;
}
```

### If Else Statements

```java
if(sales >= quota){
    System.out.println("Congratulations, you've met your quota.");
} else {
    int salesShort = quota - sales;
    System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
}
```

### Nested If Statements

You can nest if statements for paths inside paths.

```java
if (salary >= requiredSalary){
  if (years >= requiredYearsEmployed) {
      System.out.println("Congratulations, you qualify for the loan.");
}
```

### If Else If Statements

You can use if-else-if statements where there are multiple possile paths.

```java
if(score < 60) {
    grade = 'F';
} else if (score < 70) {
    grade = 'D';
} else if (score < 80) {
    grade = 'C';
} else if (score < 90) {
    grade = 'B';
} else {
    grade = 'A';
}
```

The `char` data type holds one character. `char` uses single quotes, while a string uses double quotes.

### Switch Statements

Switch statements also let you solve problems with multiple possible paths. While if-else-if statements check if a statement is true, a switch statement checks for equality between two values.

You need to specify a `break` if you want to prevent later statements from being run.

```java
switch(grade){
    case "A":
        message = "Excellent job!";
        break;
    case "B":
        message = "Great job!";
        break;
    case "C":
        message = "Good job!";
        break;
    case "D":
        message = "You need to work a bit harder.";
        break;
    case "F":
        message = "We need to talk.";
        break;
    default:
        message = "Error, invalid grade.";
        break;
}
```

## Relational and Logical Operators

| Operator | Meaning                  |
| -------- | ------------------------ |
| >        | greater than             |
| <        | less than                |
| >=       | greater than or equal to |
| <=       | less than or equal to    |
| ==       | equal to                 |
| !=       | not equal to             |

`==` and `!=` will compare the memory location of strings, not the values assigned to them.

If you want to compare the value of two strings, you need to use the `equals()` method: `if(string1.equals(string2))`.

To check if two string values are not equal, add the `!` operator at the beginning of the condition: `if(!string1.equals(string2))`.

If you don't care about the case of the strings, use the `equalsIgnoreCase` method.

Logical operators are used to combine two separate conditions to get one resulting Boolean value. they can eliminate the need for nested if statements in some cases.

| Operator | Meaning                             |
| -------- | ----------------------------------- |
| &&       | both conditions must be true        |
| \|\|     | at least one condition must be true |
| !        | the condition must be false         |
