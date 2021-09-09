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

Eclipse and IntelliJ are two of the most common IDEs used for Java development, with Eclipse easier for beginners and IntelliJ mor powerful for more advanced users.
