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

There are two parties involved in inheritance: a parent Superclass and a child Subclass.

This lets classes reuse data that already exists in other classes.

Subclasses should be a more specialized form of the Superclass they inherit from. This lets you focus on defining things specific to the Subclass.

Inheritance sets up an "is a" relationship between two classes, for example an Employee **is a** Person.

To set up an inheritance relationship between classes, use the `extends` keyword in the Subclass's header. You don't need to do anything to the Superclass.

```java
public class Employee extends Person {
  // Employee now has access to Person's methods
}
```

The Subclass can also have things that are specific to the Subclass. For example, the Person class could provide getters and setters for name and age, while the Employee class adds getters and setters for employeeId and title.

### Constructors in Inheritance

When you make a new instance of a Subclass it makes a call to the constructor of the Superclass before it executes its own constructor.

This makes sure everything in the Superclass is set up before trying to use it in the Subclass.

You can specify if you want to call a non-default constructor by using `super()`.

`super()` will call the constructor of the Superclass. If you pass no parameters to `super()` it will call the default constructor.

If you pass arguments to `super()` it will call the relevant constructor in the Superclass.

If you're going to make a `super()` call to the Superclass's constructor, that call must be the first line of the Subclass' constructor.

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

If the Superclass doesn't have a default constructor, the Subclass must explicitly call one of its other constructors.

To reiterate:

- Superclass constructors run first
- Use `super` to call specific Superclass constructors
- `super` calls must be first in the Subclass constructor
- some constructor must be executed

### Overriding and Inherited Methods

A Subclass might want to change the functionality of a method it inherited. This is allowed by overriding the inherited method.

You recreate the method in the Subclass with the same signature as exists in the Superclass.

It's good practice to mark overriden mehtods with `@Override`.

```java
// Rectangle Superclass
public double calculatePerimeter(){
    return (2 * length) + (2 * width);
}

// Square Subclass
@Override
public double calculatePerimeter(){
    return sides * length;
}
```

### Overloading Inherited Methods

Overloading methods is when you have two methods with the same name but different parameter lists.

You can overload a method inherited from a Superclass even though that method lives on another class.

```java
// Rectangle Superclass
public void print(){
    System.out.println("This is a rectangle");
}

// Square Subclass
public void print(String thingToPrint) {
    System.out.println("This is a " + thingToPrint);
}
```

## Access Limitations and Multiple Inheritance

When a Subclass inherits from a Superclass, not everything is inherited.

- Constructors are not inherited (they're technically not members of a class)
- Public and protected methods and fields are inherited
- Private methods and fields are not inherited
- Final methods are inherited but cannot be overriden

Fields marked as `public`, `protected` or unmarked can be inherited. FIelds marked as `private` cannot.

If you inherited a `public` method and are overriding it, you need to keep it as `public`. If you try to set the overriden method as something stricter, you'll get an error.

### Chain of Inheritance

Java classes can onyl directly inherit from one Superclass. But a Superclass can also inherit from another class, forming a **chain of inheritance** where a Subclass inherits from all of its ancestor classes.

Java provides an Object class and all classes, whether created by Java or by you, inherit from the Object class (without needing the explicit use of `extends`).

You could create a `Woman` class that inherits from a `Person` class and then a `Mother` class that inherits from `Woman`.

Multiple classes can inherit from the same Superclass without having any connection: for example, `Employee` and `Woman` can both inherit from `Person`.
