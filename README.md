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

## Loops

Loops are structures that cause a block of code to repeat.

### While loops

A while loop is controlled by a condition and will run as long as that condition is true.

The condition is tested before the loop is entered.

While loops are useful when the loop may or may not need to be executed, based on the situation.

A sentinel is a variable that controls the flow of the loop.

```java
while (hoursWorked > maxHours || hoursWorked < 1) {
    System.out.println("Invalid entry. Your hours must be between 1 and 40. Please try again.");
    hoursWorked = scanner.nextDouble();
}
```

### Do while loops

A do while loop will run while the specified condition remains true.

The condition is tested after the loop, meaning the loop will run at least one time.

```java
boolean again;
do {
    System.out.println("We're going to add two numbers.");
    System.out.println("Enter the first number");
    double num1 = scanner.nextDouble();

    System.out.println("Enter the second number");
    double num2 = scanner.nextDouble();

    double sum = num1 + num2;

    System.out.println("The sum is " + sum);

    System.out.println("Would you like to start over? Enter: true/false");
    again = scanner.nextBoolean();
} while (again);
```

### For loops

A for loop is count controlled, not condition controlled.

The loop will run a specified number of times. The sentinel value is tested before entering the loop.

```java
for (int i = 0; i < quantity; i++){
    System.out.println("Enter the cost of an item:");
    double price = scanner.nextDouble();

    total = total + price;
}
```

You can escape from a loop using the `break` keyword.

## Methods

Methods are sub-tasks within a class, letting you break more complex tasks into smaller pieces.

```java
public static int calculateSum(int number1, int number2){
  int sum = number1 + number2;
  return sum;
}
```

The first line of a method is the header.

First, you can set the access modifier, which indicates who has access to use this method. `public` means any code from any class can use this method.

Next, you can set a non-access modifier.

Next, you need to specify a return type, the type of data returned by this method. If your method returns nothing, set this to `void`. A method can only return one value.

Next, every method is required to have a name. By convention, they should begin with a verb and describe the task: `calculateSum`. Methods that return a boolean data type start with a question: `isSumNegative`.

Next, parentheses contain all the parameters that will be supplied to the method if it's called.

The method's unique **signature** is the name of the method and its parameter list.

The method must include a return statement if it's retuning a value.

To use a particular method, you need to call it inside the `main` method.

## Variable scope

A variable is only available within the code block in which it was declared.

If a variable needs to be available to multiple methods, you can define it at the class level.

Variables defined within a method are local variables, those outside a method are global variables.

If a method returns a value, you can store it in a variable.

You can scope a variable to any block of code, for example an if statement.

## Classes and Objects

A class is a template or blueprint from which objects are created.

Objects are structures that contain data in the form of fields and methods.

Fields store values while methods perform actions.

The `this` keyword refers to the class in which it's used.

Getter and setter methods let you access or set a value on a class.

```java
public double getLength(){
    return length;
}

public void setLength(double length){
    this.length = length;
}
```

`this` lets you reach outside the scope of a method and access the scope of the class itself.

All objects in Java have a constructor. The default constructor must have the same name as the class. The default constructor is typically used to assign default values to the fields.

Constructors are used to initialize an object or set its state.

A class can have multiple constructors.

```java
public Rectangle() {
    length = 0;
    width = 0;
}

public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
    // or
    setLength(length);
    setWidth(width);
}
```

Classes should practice **encapsulation**. When you create a class that represents an object, its fields should be private (only available to the class). The class itself determines how the values are accessed and set.

Use the `public` access modifier to make getters and setters available to the rest of your application.

If anything is marked as `protected`, it means that other classes within the same package can access it.

### Instantiating Objects

Instantiating a class means using that class to create an object.

To create an instance of an object, use the `new` keyword followed by the class's constructor.

The type of constructor used is the one that matches the parameter list. You can use the default constructor or pass arguments to it.

```java
// Rectangle 1
Rectangle room1 = new Rectangle();
room1.setWidth(25);
room1.setLength(50);
double areaOfRoom1 = room1.calculateArea();

// Rectangle 2
Rectangle room2 = new Rectangle(30, 75);
double areaOfRoom2 = room2.calculateArea();
```

`room1` and `room2` are new objects with the data type `Rectangle`.

### Objects as Method Parameters and Return Types

The arguments for methods don't just have to be primitive data types, you can use objects as well.

A method can return an object that contains multiple values. Also, you can return an object directly, you don't have to save it to a variable.

```java
return new Rectangle(length, width);
```

Remember how `main` is always marked as `static`.

`static` is used for members of a class which can be accessed without using an instance of the class to do so. Because it’s not associated with an instantiation, these members have no state.

If you try to use a non-static method from a static context, you'll get a compilation error.

Here, setting the `width` and `length` for `room1` gives it state. `calculateArea()` then has access to these values.

```java
Rectangle room1 = new Rectangle();
room1.setWidth(25);
room1.setLength(50);
double areaOfRoom1 = room1.calculateArea();
```

In a static context, there is no state, you're just calling the method itself.

If you don't want to use `static` and want to keep state, you need to create an instance and then call methods on it.

```java
HomeAreaCalculator calculator = new HomeAreaCalculator();
Rectangle kitchen = calculator.getRoom();
Rectangle bathroom = calculator.getRoom();
```

Here, you've instantiated `HomeAreaCalculator` using the default constructor (In Java, if you don't define a constructor, a default constructor is defined implicitly).

The `calculator` object is an instance of `HomeAreaCalculator` and has access to the `getRoom()` method using dot notation.

### Overloading Methods within a Class

Within a class, you can have multiple methods that have the same name but different signatures. This is **overloading**.

```java
// Default constructor
public PhoneBill(){
    id = 0;
    baseCost = 79.99;
    allottedMinutes = 800;
    minutesUsed = 800;
}

// Constructor with id
public PhoneBill(int id){
    this.id = id;
    baseCost = 79.99;
    allottedMinutes = 800;
    minutesUsed = 800;
}

// Constructor with all fields
public PhoneBill(int id, double baseCost, int allotedMinutes, int minutesUsed){
    this.id = id;
    this.baseCost = baseCost;
    this.allottedMinutes = allotedMinutes;
    this.minutesUsed = minutesUsed;
}
```

## Arrays

Arrays are a container for multiple values. All the values must be of the same data type.

The following array declaration creates an array of ints. The length of an array is also fixed at its declaration.

```java
int[] lottoTicket = new int[6];
```

Arrays are 0-indexed. Each element in the array has an index.

Each element in an array works as an individual variable. It can be read or set by accessing its index.

```java
lottoTicket[0] = 24;
lottoTicket[1] = 18;
lottoTicket[2] = 9;
lottoTicket[3] = 11;
lottoTicket[4] = 34;
lottoTicket[5] = 64;
```

If you know all of an array's values in advance, you can use `{}` to initialize the array.

```java
int[] lottoTicket = {24, 18, 9, 11, 34, 64};
```

To read a value, use the value's index.

```java
int[] lottoTicket = {24, 18, 9, 11, 34, 64};
System.out.println("The third lottery number is " + lottoTicket[2]);
```

By convention, a field that doesn't change its value is named with all caps to show that it is a constant. You can add the keyword `final` to make sure it cannot be updated: `private static final int LENGTH = 6;`

You will often use loops to add each value to, or read each value from, an array.

```java
for(int i = 0; i < LENGTH; i++){
    ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
}

for(int i=0; i < LENGTH; i++){
    System.out.print(ticket[i] + " | ");
}
```

### Searching Arrays

Often you won't know the exact contents of an array.

Two common ways to search arrays are:

1. Sequential Search

This searches every element in an array until it finds the value it's looking for or arrives at the end of the array.

This is inefficient for larger arrays.

2. Binary Search

Binary search is more efficient but the array must first be sorted.

On each iteration, binary search checks if the middle element is greater than or less than the value you're searching for and dismisses the half of the array that's too high or too low.

Java has a util method for this: `Arrays.binarySearch`.

You can generate a Javadoc to describe how a method works.

```java
/**
* Does a sequential search on the array to find a value
* @param array Array to search through
* @param numberToSearchFor Value to search for
* @return true if found, false if not
*/
public static boolean search(int[] array, int numberToSearchFor){
  for(int value : array){
      if (value == numberToSearchFor){
          return true;
      }
  }
  // If entire array was searched and value not found
  return false;
}
```

The code above uses an enhanced for loop. It iterates through the array and each time assigns the current element to value.

The `Arrays` class has a number of useful methods including `sort`, which will put all the elements of the array in ascending order, and `binarySearch`, which will return an int of the index of the found value or -1 if the value wasn't found.

### Useful Tricks for Arrays

You can create an array with a length based off user input:

```java
System.out.println("How many grades would you like to enter?");
grades = new int[scanner.nextInt()];
```

`String.format("%.2f", NUMBER_TO_FORMAT);` formats strings to two decimal places.

To get the highest value in an array, you could:

- sort the array in ascending order and take the last item
- set a variable to the first element in the array, loop over the array, if any element is higher than the variable, set it to the variable.

```java
public static int getHighest(){
    int highest = grades[0];
    for (int grade : grades){
        if(grade > highest){
            highest = grade;
        }
    }
    return highest;
}
```

#### Common errors with arrays

Trying to access an index greater than the length of the array will generate an `ArrrayIndexOutOfBoundsException`. This can also happen when looping if you don't keep track of the number of elements.

### Arrays of Objects

Arrays are not limited to ints, they can hold any data type, including objects.

```java
Students students[] = new Students[24];
students[0] = new Student("John Doe");
```

### Multidimensional arrays

You can declare an array of arrays, though it's not very common.

A two-dimensional array is like a table that holds data in rows and columns.

```java
int[][] grades = new grades[24][4];
```

## Data Types

Programming languages are either dynamically typed or statically typed.

Dynamically typed languages determine the data type of a variable at runtime so you don't need to specify the data type in advance.

Java is a statically typed programming language. You need to declare the type of variables before they can be assigned values. Their data type is checked at compile time.

In Java 10 support for type inference was added. This means you can declare a variable as `var` and Java will infer the data type based on what is assigned to the variable.

```java
// Static typing
Rectangle[][] grid = getGridArray();

// Type inference
var grid = getGridArray(;)
```

### Rules for type inference

- Local only - It only works for local variables.
- Initialization is required - The variable must be initialized at the time of declaration.
- Not allowed in headers - It cannot be used for parameters or as return types.

### Primitive Data Types

Primitives are the 8 most basic datatypes and are provided by Java itself.

Variables that are declared without an initial value are set to their default value, except for local variables which you must initialize before using.

| Name    | Default  | Size   | Type           | Example           |
| ------- | -------- | ------ | -------------- | ----------------- |
| byte    | 0        | 8-bit  | Integral       | byte b = 100;     |
| short   | 0        | 16-bit | Integral       | short s = 10000;  |
| int     | 0        | 32-bit | Integral       | int i = 100000;   |
| long    | 0L       | 64-bit | Integral       | long l = 9999999; |
| float   | 0.0f     | 32-bit | Floating Point | float f = 123.4f; |
| double  | 0.0d     | 64-bit | Floating Point | double d = 12.4;  |
| boolean | false    | 1-bit  | Boolean        | boolean b = true; |
| char    | `\u0000` | 16-bit | Character      | char c = 'C';     |

### Wrapper Classes

All primitive data types can also be expressed as objects. There are **wrapper classes**.

```java
int number1 = 5;

Integer number2 = 5;
```

`number1` has a data type of `int`, which is a primitive.

`number2` has a data type of `Integer`, which is a wrapper class for the primitive data type `int`. This makes `number2` an object, so you can use methods from the `Integer` class.

```java
public static void convertDecimalToInt(){
  double[] numbers = {1.5, 3.99, 45.5, 222.6};
  for (Double number : numbers){
    System.out.println(number.intValue());
  }
}
// 1
// 3
// 45
// 222
```

Here you have an array of numbers declared as the primitive data type `double`. Inside the for loop their type is converted to the corresponding wrapper class `Double`. This now gives them access to methods such as `intValue()` which will convert the decimal to a whole number.

As well as methods to convert values to other data types, there are also methods to do things like sum two numbers together ot get the min and max values allowed for the data type.

Wrapper classes exist for all primitive data types.

| Primitive Data Type | Wrapper Class |
| ------------------- | ------------- |
| byte                | Byte          |
| short               | Short         |
| int                 | Integer       |
| long                | Long          |
| float               | Float         |
| double              | Double        |
| boolean             | Boolean       |
| char                | Character     |

If you look at the Javadoc for the `Integer` class, you'll see it has fields such as `MAX_VALUE` and `MIN_VALUE`, as well as methods such as `compare()` and `toString()`.

## Strings

Strings are not a primitive data type and also they aren't a wrapper class.

A String is an object and a sequence of characters. Like the wrapper classes, the `String` class provides helpful methods for dealing with strings.

A String

```java
String str = "abc";
```

is equivalent to an array of characters:

```java
char data[] = {'a', 'b', 'c'};
String str = new String(data);
```

Unlike an array, you can't access an element using bracket notation. The `charAt()` method lets you get the char at a specified index.

`contain()` lets you see if a string contains a certain sequence of characters. `endsWith()` and `startsWith()` let you do this for the ends of strings.

`indexOf()` returns the index in the string where a substring first occurs.

`isEmpty()` tells you if the string has data in it.

`replace()` and `replaceAll()` lets you replace a substring.

`substring()` gives you a substring based off a beginning and ending index.

`trim()` gets rid of whitespace at the beginning or end of a string.

### StringBuilder

The `String` object is immutable. It doesn't allow for the manipulation of the actual string itself.

To insert or delete characters from a string, you need to use the `StringBuilder` class.

```java
/**
  * Adds spaces before each uppercase letter
  * @param text jumbled text
  */
public static void addSpaces(String text){
    var modifiedText = new StringBuilder(text);
    for(int i = 0; i < modifiedText.length(); i++){
        if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
            modifiedText.insert(i, " ");
            i++;
        }
    }
    System.out.println(modifiedText);
}
```

### Popular text processing methods

| Character    | String      | StringBuilder |
| ------------ | ----------- | ------------- |
| isUpperCase  | StartsWith  | append        |
| isLowerCase  | endsWith    | insert        |
| isDigit      | indexOf     | delete        |
| isWhitespace | lastIndexOf | reverse       |
|              | charAt      |               |
|              | substring   |               |
|              | split       |               |
|              | trim        |               |
|              | replace     |               |
|              | concat      |               |

## Inheritance

There are 4 main principles of OOP:

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

Inheritance is where one class becomes an extension of another class, therefore inheriting the members of that class.

There are two parties involved in inheritance: a parent superclass and a child subclass.

This lets classes reuse data that already exists in other classes.

Subclasses should be a more specialized form of the superclass they inherit from. This lets you focus on defining things specific to the subclass.

Inheritance sets up an "is a" relationship between two classes, for example an Employee **is a** Person.

To set up an inheritance relationship between classes, use the `extends` keyword in the subclass's header. You don't need to do anything to the superclass.

```java
public class Employee extends Person {
  // Employee now has access to Person's methods
}
```

The subclass can also have things that are specific to the subclass. For example, the Person class could provide getters and setters for name and age, while the Employee class adds getters and setters for employeeId and title.

### Constructors in Inheritance

When you make a new instance of a subclass it makes a call to the constructor of the superclass before it executes its own constructor.

This makes sure everything in the superclass is set up before trying to use it in the subclass.

You can specify if you want to call a non-default constructor by using `super()`.

`super()` will call the constructor of the superclass. If you pass no parameters to `super()` it will call the default constructor.

If you pass arguments to `super()` it will call the relevant constructor in the superclass.

If you're going to make a `super()` call to the superclass's constructor, that call must be the first line of the subclass' constructor.

```java
// Constructors in Person class
public Person() {
    System.out.println("In Person default constructor");
}

public Person(String name){
    System.out.println("In Person 2nd constructor. Name is set");
}

// Calling super with arguments in Employee class
public Employee() {
    super("angie");
}
```

If the superclass doesn't have a default constructor, the subclass must explicitly call one of its other constructors.

To reiterate:

- superclass constructors run first
- Use `super` to call specific superclass constructors
- `super` calls must be first in the subclass constructor
- some constructor must be executed

### Overriding and Inherited Methods

A subclass might want to change the functionality of a method it inherited. This is allowed by overriding the inherited method.

You recreate the method in the subclass with the same signature as exists in the superclass.

It's good practice to mark overriden mehtods with `@Override`.

```java
// Rectangle superclass
public double calculatePerimeter(){
    return (2 * length) + (2 * width);
}

// Square subclass
@Override
public double calculatePerimeter(){
    return sides * length;
}
```

### Overloading Inherited Methods

Overloading methods is when you have two methods with the same name but different parameter lists.

You can overload a method inherited from a superclass even though that method lives on another class.

```java
// Rectangle superclass
public void print(){
    System.out.println("This is a rectangle");
}

// Square subclass
public void print(String thingToPrint) {
    System.out.println("This is a " + thingToPrint);
}
```

## Access Limitations and Multiple Inheritance

When a subclass inherits from a superclass, not everything is inherited.

- Constructors are not inherited (they're technically not members of a class)
- Public and protected methods and fields are inherited
- Private methods and fields are not inherited
- Final methods are inherited but cannot be overriden

Fields marked as `public`, `protected` or unmarked can be inherited. FIelds marked as `private` cannot.

If you inherited a `public` method and are overriding it, you need to keep it as `public`. If you try to set the overriden method as something stricter, you'll get an error.

### Chain of Inheritance

Java classes can only directly inherit from one superclass. But a superclass can also inherit from another class, forming a **chain of inheritance** where a subclass inherits from all of its ancestor classes.

Java provides an Object class and all classes, whether created by Java or by you, inherit from the Object class (without needing the explicit use of `extends`).

You could create a `Woman` class that inherits from a `Person` class and then a `Mother` class that inherits from `Woman`.

Multiple classes can inherit from the same superclass without having any connection: for example, `Employee` and `Woman` can both inherit from `Person`.

## Polymorphism

Polymorphism is the ability to take multiple forms. In OOP, polymorphism is where a subclass can define its own unique behaviours but still share some of the same behavious of its superclass.

An example of polymorphism is where an object has a superclass type but is an instance of a subclass.

Say you have a `Dog` subclass which inherits from its superclass `Animal`.

```java
Animal dog = new Dog();
```

`dog` is an instance of `Dog` but is defined as having the type `Animal`.

This is possible because `Dog` inherits from `Animal`, and therefore `dog` is an `Animal`.

With polymorphism, you can can change an object from being an instance of one class to being an instance of another. This is legal as long as both classes inherit from the same superclass.

Below, the `sasha` object is an instance of `Dog` but can be changed to be an instance of `Cat`.

Because `sasha` is of type `Animal`, not `Cat`, it doesn't have access to the `Cat`'s `scratch` method.

You can get around this using **casting**. Casting is the act of converting an object's type into a different type.

`((Cat) sasha).scratch();` let's `sasha` be considered as type `Cat` in this instance, and gives it access to `Cat`'s methods.

Casting doesn't permanently change an objects type.

```java
Dog rocky = new Dog();
rocky.fetch(); // from Dog class
rocky.makeSound(); // from Animal, overriden in Dog

Animal sasha = new Dog();
sasha.makeSound(); // from Animal, overriden in Dog

sasha = new Cat(); // legal because both Cat and Dog inherit from Animal
sasha.makeSound(); // from Animal, overriden in Cat
((Cat) sasha).scratch(); // cast to Cat type
```

### Polymorphism key points

- **Type vs Instance** - An object can have a superclass type and a subclass instance.
- **Access** - Polymorphic objects can only access the methods of their type (not their instance). Casting is required in order to access the methods of their instance.
- **Overridden Methods** - If a method is overridden by the subclass, the polymorphic object will execute the overridden method at runtime.
- **instanceof Operator** - This operator is used to determine if an object is an instance of a certain class.

## Abstraction

Abstraction is something that exists in theory but doesn't have a concrete existence.

In Java the reserved keyword `abstract` is a non-access modifier that can be used on classes and methods. It's used when you want to define a template for a class or method but don't intend to use it as is.

An abstract class isn't designed to be instantiated. It's designed to serve as a parent class, from which more specific subclasses can be extended.

For example, a `Shape` is an abstract concept that can specify some general behaviour that a type of shape would have but is too abstract to actually define what an individual shape's behaviour should be.

An abstract method has no body, only the signature of the method. It's not designed to be run but to be overriden in a subclass.

This is meant to be a template to set a standard that any subclass of `Shape` should follow.

An abstract class can contain implemented methods as well as abstract methods.

```java
public abstract class Shape {
  abstract double calculateArea();

  public void print(){
    System.out.println("This is a shape");
  }
}
```

You can use an abstract class as a type but you cannot instantiate it. You'll get a compilation error.

### Abstraction key points

- **Templates** - Abstract classes and methods are templates that meant to be implemented by subclasses.
- **Reserved words** - Classes and methods are declared abstract using the `abstract` keyword.
- **Implementation required in inheritance** - If a subclass extends from an abstract class, it must implement its abstract ethods or be declared abstract itself.
- **Abstract classes** - Abstract classes cannot be instantiated. They can only be used as superclasses. If one method in a class is abstract, the whole class must be declared abstract.

## Interfaces

An interface is similar to an abstract class. In an abstract class some methods can be implemented, while in an interface all methods are abstract.\* For this reason you don't need to declare that the methods are abstract.

Another difference is that interfaces are implemented, not extended. Any class that implements an interface must implement all it's methods or must declare itself as an abstract class.

If you define a field in an interface, that field has to be final. Becuae it's final, it's essentially a constant and so you would also have to give it a value.

If the purpose of the interface is so that other classes can inherit from it, then you won't want to add fields where the values can change based on the implementation of the interface. So most of the time you'll only provide methods, not fields.

```java
public interface Product {
  double getPrice();
  void setPrice(double price);

  String getName();
  void setName(String name);

  String getColor();
  void setColor(String color);

  default String getBarcode() {
      return "No barcode found.";
  }
}
```

While a class can only extend one superclass, it can implement multiple interfaces.

If a class declares that it implements multiple interfaces, it must provide the methods specified in all of the interfaces.

```java
public class Book implements Product, KindleItem {
}
```

Since Java 8, not all methods in an interface need to be abstract.

Between an interface and the classes that implement it is a contract. If you changed the interface by adding a method it would break everything that implemented the interface.

Java 8 introduced the option of declaring methods as `default` in an interface. If you declare a method as `default`, you can provide a default implementation for this method. This won't break any classes implementing the interface.

```java
public interface Product {
    // abstract methods

    default String getBarcode() {
        return "No barcode found.";
    }
}
```

### Interfaces key points

- **Not for instantiation** - Interfaces cannot be instantiated.
- **Implement** - Interfaces are implemented, not extended.
- **Abstract if not implemented** - Any clas sthat implements an interface must implement all its methods or it must declare itself abstract.
- **Abstract methods** - Methods in an interface must be abstract (no explicit declaration needed) or default.

## Collections

A Collection is an object that holds references to other objetcs. A Collection is a **data structure** and the objects within it are **elements**.

Java provides a collections framework which consists of interfaces, classes and methods to store and manipulate aggregate data.

Some collections allow duplicate elements while others require every element to be unique. Some collections are ordered while others are not.

All of the interfaces and classes for the collections framework can be found in the `java.util` package.

`Collection` itself is an interface and is the root of the hierarchy. Java doesn't provide any direct implementations of the `Collection` interface but there are other interfaces which inherit from `Collection`.

- **Set** - Unordered unique elements.
- **List** - Ordered elements which can be accessed by position.
- **Queue** - Ordered elements for processing. Access in the order the elements were added (FIFO - first in first out)
- **Map** - Unordered unique key-value pairs.

### Set

`Set` is a collection which cannot contain duplicate elements. A use case would be a deck of 52 unique cards.

Because `Set` is an interface, it cannot be instantiated, but it can be an object's type.

Some implementations of `Set` are `HashSet`, `LinkedHashSet` and `TreeSet`.

You use the `add` method to place items in a set. If you try to add duplicates to a set, no error will happen but the duplicate items won't be saved.

Since the set is unordered, you have no control over where your elements will be placed.

```java
Set fruit = new HashSet();
fruit.add("apple");
fruit.add("lemon");
fruit.add("banana");
fruit.add("orange");
fruit.add("lemon");

System.out.println(fruit.size()); // 4
System.out.println(fruit); // [banana, orange, apple, lemon]
```

The methods available for sets (inherited from `Collection`) are:

| Method   | Description                                                                            |
| -------- | -------------------------------------------------------------------------------------- |
| add      | Adds an object to the collection                                                       |
| clear    | Removes all objects from the collection                                                |
| contains | Returns true if a specified object is an element within the collection                 |
| isEmpty  | Returns true if the collection has no elements                                         |
| iterator | Returns an Iterator object for the collection, which can be used to retrieve an object |
| remove   | Removes a specified object from the collection                                         |
| size     | Returns the number of elements in the collection                                       |

### List

`List` is a collection where elements are ordered. A `List` can contain duplicate elements. A use case would be the contacts in your call history, which are listed in order and some numbers may appear more than once.

Some implementations of lists are `ArrayList`, `LinkedList`, `Stack` and `Vector`.

Lists are ordered so their elements can be accessed using their index. A list can also contain duplicate elements.

```java
List fruit = new ArrayList();
fruit.add("apple");
fruit.add("lemon");
fruit.add("banana");
fruit.add("orange");
fruit.add("lemon");

System.out.println(fruit.get(2)); // banana
System.out.println(fruit.size()); // 5
System.out.println(fruit); // [apple, lemon, banana, orange, lemon]
```

In addition to methods inherited from `Collection`, additional methods available for lists are:

| Method                                  | Description                                                                                                                  |
| --------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| add(int index, Object obj)              | Inserts obj into list at position of index                                                                                   |
| addAll(int index, Collection c)         | Inserts all elements of c into the list at the position of index                                                             |
| get(int index)                          | Returns the object stored at the specified index within the invoking collection                                              |
| isEmpty()                               | Returns true if the list contains no elements                                                                                |
| indexOf(Object obj)                     | Returns the index of the first instance of obj in the list                                                                   |
| lastIndexOf(Object obj)                 | Returns the index of the last instance of obj in the list                                                                    |
| listIterator(), listIterator(int index) | Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list. |
| remove(int index)                       | Removes the element at position index and returns the deleted element                                                        |
| set(int index, Object obj)              | Assigns obj to the location specified by index within the invoking list                                                      |
| subList(int start, int end)             | Returns a list containing elements from start to end                                                                         |

### Queue

`Queue` is a collection of ordered elements, typically used to hold items that are going to be processed in some way.

Queues typically follow the first in-first out algorithm — elements are processed in the order in which they were entered.

The first element of a Queue is the head and the last element is the tail.

A use case would be a checkout queue, where new people are added to the end and the processing of the queue is handled from the beginning.

```java
Queue fruit = new LinkedList();
fruit.add("apple");
fruit.add("lemon");
fruit.add("banana");
fruit.add("orange");
fruit.add("lemon");

System.out.println(fruit.size()); // 5
System.out.println(fruit); // [apple, lemon, banana, orange, lemon]
fruit.remove();
System.out.println(fruit); // [lemon, banana, orange, lemon]
System.out.println(fruit.peek()); // lemon
```

In addition to the basic `Collection` operations, `Queue` also provides additional methods for insertion, removal and inspection of elements.

| Method  | Description                                                                             |
| ------- | --------------------------------------------------------------------------------------- |
| add     | Adds element to the tail of the queue                                                   |
| peek    | Used to view the head of the queue without removing it. Returns false if queue is empty |
| element | Similar to peek but throws an exception if the queue is empty                           |
| remove  | Removes and returns the head of the queue. Throws an exception if the queue is empty    |
| poll    | Similar to remove but returns null if the queue is empty                                |

### Map

`Map` isn't a true collection, it doesn't inherit from the `Collection` interface. But it does contain collection-like operations which enable them to be used as collections.

`Map`s are used to hold key-value pairs, for example a list of bank transactions where each `Map` entry has a unique transaction ID serving as the key and the actual transaction object serving as the value.

You can access an element in a map by its key. While the keys are required to be unique, the values are not.

If you try to pass in a key that already exists, the map will update that entry with the new value that was passed in. You can use `putIfAbsent()` to prevent yourself from unintentionally overriding something that's already in the map.

Popular implementations of the map interface are `HashMap`, `TreeMap` and `LinkedHashMap`.

```java
Map fruitCalories = new HashMap();
fruitCalories.put("apple", 95);
fruitCalories.put("lemon", 20);
fruitCalories.put("banana", 105);
fruitCalories.put("orange", 45);
fruitCalories.put("lemon", 17);

System.out.println(fruitCalories.size()); // 4
System.out.println(fruitCalories); // {banana=105, orange=45, apple=95, lemon=17}
fruit.remove();
System.out.println(fruitCalories.get("lemon")); // 17
System.out.println(fruitCalories.entrySet()); // [banana=105, orange=45, apple=95, lemon=17]
fruitCalories.remove("orange");
System.out.println(fruitCalories); // {banana=105, apple=95, lemon=17}
```

| Method                                | Description                                                                      |
| ------------------------------------- | -------------------------------------------------------------------------------- |
| clear                                 | Removes all key/value pairs from the map                                         |
| containsKey(Object key)               | Returns true if the map contains an element that has key                         |
| containsValue()                       | Returns true if the map contains an element that has value                       |
| entrySet                              | Returns a Set that contains the entries in the map                               |
| get(Object key)                       | Returns the value associated with the key                                        |
| isEmpty                               | Returns true if the Map is empty, otherwise returns false                        |
| keyset                                | Returns a Set that contains the keys in the map                                  |
| put(Object key, Object value)         | Puts an entry in the map, overwriting any previous value associated with the key |
| putAll(Map m)                         | Puts all the entries from m into the map                                         |
| putIfAbsent(Object key, Object value) | Puts an entry in the map if the key doesn't already exist                        |
| remove(Object key)                    | Removes the entry whose key equals key                                           |

### The of method

So far, you've used `add` to add elements to collections.

You can also use the `of` method and pass in all the elements you want. This is convenient but has the cost that setting a collection in this way makes the collection immutable, so you cannot change it later. This applies to `List`s, `Set`s and `Map`s.

```java
List unchangeableList = List.of("apple", "lemon", "banana");
unchangeableList.add("orange"); // UnsupportedOperationException
unchangeableList.remove(1); // UnsupportedOperationException
```

## Looping through collections and Maps

### Iterators

The `Collection` interface provides an `iterator` for you, in order to loop through a collection.

For example, `Set` is an unordered collection so there are no methods on it that will let you get a certain item by its index. But an iterator will let you iterate over each of the items in this collection.

The iterator's `hasNext` method returns true as long as there is another element in the collection and will return false once it reaches the end of the collection.

The iterator's `next` method will return the next element in the collection.

```java
public static void setDemo(){
    Set fruit = new HashSet();
    fruit.add("apple");
    fruit.add("lemon");
    fruit.add("banana");
    fruit.add("orange");
    fruit.add("lemon");

    var i = fruit.iterator();
    while(i.hasNext()) {
        System.out.println(i.next());
    }
}
```

### Collections - Enhanced for loops

Collections are generic, in that they just store Objects, and since Object is the grandparent to every class in Java, then that is safe to use.

If you want to use an enhanced for loop to iterate through a Set of strings, you need to tell the Set it's holding strings.

You can use the diamond operator `<>` to update the Set's declaration.

```java
public static void setDemo(){
    Set<String> fruit = new HashSet();
    fruit.add("apple");
    fruit.add("lemon");
    fruit.add("banana");
    fruit.add("orange");
    fruit.add("lemon");

    for(String item: fruit){
    System.out.println(item);
    }
}
```

### Collections - forEach

The `forEach` method takes a lambda expression which it executes for each element in the collection. Lambda's are short single-purpose functions.

The lambda takes in a generic name for the current element in the collection and an action to perform.

There is also a shorthand lambda that uses `::` and doens't need to be explicitly passed a variable.

```java
// lambda
fruit.forEach(x -> System.out.println(x));

// lambda shorthand
fruit.forEach(System.out::println);
```

### Maps- Enhanced for loops

Since a `Map` is not a `Collection`, it's a little trickier to iterate over it.

The `entrySet` method will give you a Set object from which you can then access individual entries.

But to call `getValue` on an entry you need to specify the type using the diamond operator. Because `Map` takes two objects you need to provide two data types, in this case:

1. One for the key, in this case a String
2. One for the value, in this case an int

Now `entry` is a Map of a String and an Integer and `getValue` can access this.

```java
public static void mapDemo(){
    Map<String,Integer> fruitCalories = new HashMap();
    fruitCalories.put("apple", 95);
    fruitCalories.put("lemon", 20);
    fruitCalories.put("banana", 105);
    fruitCalories.put("lemon", 17);

    for(var entry : fruitCalories.entrySet()){
        System.out.println(entry.getValue());
    }
}
```

### Map - forEach

A Map also has access to the `forEach` method. You can call `fruitCalories.forEach()` and pass it a key and a value.

```java
fruitCalories.forEach(
    (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
```

## Exceptions

An exception is an unexpected event that occurs at runtime due to an error and disrupts the normal flow of a programme.

For example, if you try to create a file in a directory that doesn't yet exist you'll cause an `IOException`.

The following code will compile but will throw an `ArrayIndexOutOfBoundsException` when it tries to access index 3.

```java
String[] employees = {"Moshe", "Adam", "Gil"};
for(int i = 0; i<4; i++){
    System.out.println("Hi " + employees[i]);
}
```

You can handle exceptions so that your programme doesn't crash and a meaningful message is provided to your user.

You do this using a `try/catch` clause.

The programme will try to run the code in the `try` block and if an exception occurs it can be handled in the `catch` block.

In the parenthesis for `catch` you need to specify what type of exception you are catching, for example an `IOException`, and give it a variable name, such as `e` or `ex`.

The exception has methods on it which allow you to provide more information, such as `getMessage()` or `printStackTrace()`.

```java
import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        createNewFile();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch(IOException e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }
}
```

### Polymorphism with Exceptions

When handling exceptions, you can also use the superclass as a way to catch broader exceptions.

For example, `ArrayIndexOutOfBoundsException` inherits from a chain of exceptions going up to `Exception`.

All exceptions inherit from this `Exception` class.

If you don't know which exception is likely to occur, or the method could throw more than one exception, you can use `Exception` instead of specifying a particular exception.

You don't have to use `Exception`, you could also use any of the parent classes of the particular exception you expect.

```java
try{
    file.createNewFile();
}catch (Exception e){
    System.out.println("Directory does not exist.");
    e.printStackTrace();
}
```

### Handling Multiple Exceptions

You can use multiple `catch` clauses to handle different types of exceptions.

If the multiple `catch` clauses contain related exceptions, the subclass’ `catch` clause must appear first. Otherwise, it will never have the possibility of reaching other `catch` clauses.

```java
try{
    Scanner fileReader = new Scanner(file);
    while(fileReader.hasNext()){
        double num = fileReader.nextDouble();
        System.out.println(num);
    }
} catch(FileNotFoundException e){
    e.printStackTrace();
} catch(InputMismatchException e){
    e.printStackTrace();
} catch(Exception e){
    e.printStackTrace();
}
```

You can include multiple exceptions in one catch clause using `|`.

```java
catch(FileNotFoundException | InputMismatchException e){
    e.printStackTrace();
}
```

### The finally Clause

A `finally` clause can optionally be added below any `catch` clauses.

This clause is executed after `try` and after any `catch` clauses, even if the `catch` clauses don't execute.

The `finally` block will execute no matter what and is useful for code that you need to make sure runs even if an exception happens.

```java
public static void numbersExceptionHandling(){
    File file = new File("resources/numbers.txt");
    Scanner fileReader = null;
    try {
        fileReader = new Scanner(file);
        while(fileReader.hasNext()){
            double num = fileReader.nextDouble();
            System.out.println(num);
        }
    } catch(FileNotFoundException | InputMismatchException e){
        e.printStackTrace();
    } finally{
        fileReader.close();
    }
}
```

### Try with resources

Try with resources allows you to specify a resource and Java will automatically close this resource on your behalf once done with the try/catch.

This only works with classes that implement the Closable or AutoClosable interfaces, such as `Scanner`.

```java
File file = new File("resources/numbers.txt");
try(Scanner fileReader = new Scanner(file)){
    while(fileReader.hasNext()){
        double num = fileReader.nextDouble();
        System.out.println(num);
    }
}
```

### Rethrowing Exceptions

If your method has code that could potentially throw an exception, you must either catch that exception or rethrow it.

When a method throws an exception, it's assumed that that exception will be caught and handled, or rethrown by any calling methods.

You can tell a method not to handle an exception but to rethrow it by adding the `throws` keyword to the method header and then specifying the `Exception` to be thrown.

```java
public class ExceptionHandling {

    public static void main(String args[]){
        createNewFileRethrow();
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }
}
```

Polymorphism also works here, so you could use `Exception` if you didn't know exactly which exception might be thrown.

Now, if any other method calls this method, then they are now responsible for handling the exception.

### Throwing Exceptions

Your method can initiate throwing an exception by using `throw` inside the method body and instantiating an exception.

For example, if a `calculateSalary()` method doesn't allow for overtime, there is no built-in Java exception that will automatically be called.

So you would need to deliberately throw an exception and pass in a custom error message.

```java
public static void calculateSalary(double hours, double rate){
    if(hours > 40) {
        throw new IllegalArgumentException("Overtime is not allowed.")
    }
}
```

You can also define a custom exception class which extends `Exception` and throw that instead, for example `NoOvertimeAllowedException`.

```java
public class DivideByZero {
    public static void main(String[] args){
        try{
            int c = 30/0;
        } catch(ArithmeticException e){
            System.out.println("Dividing by zero is not permitted");
        } finally {
            System.out.println("Division is fun!");
        }
    }
}
```