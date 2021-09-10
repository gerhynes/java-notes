# Java Notes

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
