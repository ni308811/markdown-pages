# Comprehensive Java Guide: From Scratch to Advanced Expert

This guide covers Java programming from basic concepts to advanced topics, following a structure similar to W3Schools but with more depth and practical examples. Each section includes explanations, code examples, and important concepts.

## Table of Contents

1. [Java Introduction](#1-java-introduction)
2. [Java Syntax and Basics](#2-java-syntax-and-basics)
3. [Java Methods](#3-java-methods)
4. [Java Classes and OOP](#4-java-classes-and-oop)
5. [Java Data Structures](#5-java-data-structures)
6. [Java Advanced Concepts](#6-java-advanced-concepts)
7. [Java File Handling](#7-java-file-handling)
8. [Java How-To's](#8-java-how-tos)
9. [Java Reference](#9-java-reference)
10. [Java Examples](#10-java-examples)

---

## 1. Java Introduction

### What is Java?
Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It's platform-independent (write once, run anywhere) due to the Java Virtual Machine (JVM).

### Java Features
- Object-oriented
- Platform-independent
- Secure
- Robust
- Multithreaded
- High performance

### Java Editions
- Java SE (Standard Edition)
- Java EE (Enterprise Edition)
- Java ME (Micro Edition)

### Setting Up Java
1. Download JDK from Oracle's website
2. Set up environment variables (JAVA_HOME, PATH)
3. Verify installation with `java -version`

### First Java Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Compile: `javac HelloWorld.java`
Run: `java HelloWorld`

---

## 2. Java Syntax and Basics

### Variables and Data Types
```java
// Primitive types
byte b = 127;          // 8-bit integer
short s = 32767;       // 16-bit integer
int i = 2147483647;    // 32-bit integer
long l = 9223372036854775807L; // 64-bit integer
float f = 3.14f;       // 32-bit floating point
double d = 3.141592653589793; // 64-bit floating point
char c = 'A';          // 16-bit Unicode
boolean bool = true;   // true/false

// Reference types
String str = "Hello";
int[] arr = {1, 2, 3};
```

### Operators
```java
// Arithmetic
int sum = 10 + 20;
int diff = 20 - 10;
int product = 10 * 20;
int quotient = 20 / 10;
int remainder = 20 % 3;

// Comparison
boolean isEqual = (10 == 20);
boolean isGreater = (10 > 20);

// Logical
boolean result = (true && false);
boolean result2 = (true || false);
boolean result3 = !true;

// Assignment
int x = 10;
x += 5; // x = x + 5
```

### Control Flow
```java
// If-else
int num = 10;
if (num > 0) {
    System.out.println("Positive");
} else if (num < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}

// Switch
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    // ...
    default: System.out.println("Invalid day");
}

// Loops
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

int j = 0;
while (j < 5) {
    System.out.println(j);
    j++;
}

int k = 0;
do {
    System.out.println(k);
    k++;
} while (k < 5);
```

### Arrays
```java
// 1D Array
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}

// 2D Array
int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
for (int[] row : matrix) {
    for (int num : row) {
        System.out.print(num + " ");
    }
    System.out.println();
}
```

### Methods
```java
// Method declaration
public static int add(int a, int b) {
    return a + b;
}

// Method overloading
public static double add(double a, double b) {
    return a + b;
}

// Calling methods
int sum = add(5, 10);
double dSum = add(3.5, 2.5);

// Varargs method
public static int sum(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}
int result = sum(1, 2, 3, 4, 5);
```

### Strings

```java
// String creation
String s1 = "Hello";
String s2 = new String("World");

// Common String operations
String combined = s1 + " " + s2;       // Concatenation
int length = s1.length();              // Length
char character = s1.charAt(0);         // Character at index
boolean contains = s1.contains("el");  // Contains substring
String upper = s1.toUpperCase();       // Convert to uppercase
String sub = s1.substring(1, 4);       // Substring
String[] parts = combined.split(" ");  // Split string

// String comparison
boolean isEqual = s1.equals("Hello");            // Content equality
boolean isEqualIgnoreCase = s1.equalsIgnoreCase("hello");
boolean isSameRef = s1 == "Hello";               // Reference equality
```

### Exception Handling
```java

// Try-catch block
try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[3]);  // Will throw ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out of bounds: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Some other exception occurred");
} finally {
    System.out.println("This block always executes");
}

// Throwing exceptions
public static void checkAge(int age) throws IllegalArgumentException {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
}

// Try-with-resources (Java 7+)
try (FileReader fr = new FileReader("file.txt")) {
    // Code that uses the resource
    // fr will be automatically closed
} catch (IOException e) {
    e.printStackTrace();
}
```

### Collections Framework

```java
// ArrayList
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.get(0);             // Access element
list.remove(0);          // Remove element
list.size();             // Get size

// HashMap
HashMap<String, Integer> map = new HashMap<>();
map.put("Apple", 10);
map.put("Banana", 20);
int value = map.get("Apple");   // Get value
map.containsKey("Apple");       // Check key
map.remove("Apple");            // Remove entry

// Enhanced for loop with collections
for (String fruit : list) {
    System.out.println(fruit);
}

// Using iterators
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    String fruit = it.next();
    System.out.println(fruit);
}
```

### Classes and Objects

```java
// Class definition
public class Person {
    // Fields
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Method
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

// Creating and using objects
Person person = new Person("John", 25);
person.introduce();
person.setAge(26);
```


### Type Casting and Conversion

```java
// Implicit casting (widening)
int i = 100;
long l = i;    // int to long
float f = l;   // long to float
double d = f;  // float to double

// Explicit casting (narrowing)
double dNum = 100.05;
float fNum = (float) dNum;  // double to float
long lNum = (long) fNum;    // float to long
int iNum = (int) lNum;      // long to int

// String conversion
String strNum = "123";
int num = Integer.parseInt(strNum);
String str = Integer.toString(num);
```

### Enums

```java
// Enum declaration
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Using enums
Day today = Day.MONDAY;

// Switch with enum
switch (today) {
    case MONDAY:
        System.out.println("Start of work week");
        break;
    case FRIDAY:
        System.out.println("End of work week");
        break;
    case SATURDAY:
    case SUNDAY:
        System.out.println("Weekend");
        break;
    default:
        System.out.println("Midweek");
}
```

### Static Members

```java
public class Counter {
    // Static variable (shared across all instances)
    private static int count = 0;
    
    // Instance variable (unique to each instance)
    private int id;
    
    // Constructor
    public Counter() {
        id = ++count;
    }
    
    // Static method
    public static int getCount() {
        return count;
    }
    
    // Instance method
    public int getId() {
        return id;
    }
}

// Using static members
Counter c1 = new Counter();
Counter c2 = new Counter();
System.out.println(Counter.getCount());  // Outputs: 2
```

### Final Keyword

```java
// Final variable (constant)
final double PI = 3.14159;
// PI = 3.14;  // Error: cannot assign a value to final variable

// Final method (cannot be overridden)
public final void cannotOverride() {
    System.out.println("This method cannot be overridden in subclasses");
}

// Final class (cannot be extended)
final class FinalClass {
    // Class implementation
}
```

### Wrapper Classes

```java
// Primitive types vs wrapper classes
int primitive = 42;
Integer wrapper = Integer.valueOf(primitive);  // Boxing
int unwrapped = wrapper.intValue();           // Unboxing

// Autoboxing and unboxing (Java 5+)
Integer num = 42;    // Autoboxing
int value = num;     // Auto-unboxing

// Useful wrapper methods
Integer.parseInt("123");    // String to int
Integer.toString(123);     // int to String
Character.isDigit('5');    // Check if char is digit
Boolean.parseBoolean("true");  // String to boolean
```

### Access Modifiers

```java
public class AccessExample {
    public String publicVar;       // Accessible from anywhere
    private String privateVar;     // Accessible only within this class
    protected String protectedVar; // Accessible within package and subclasses
    String defaultVar;             // Accessible only within package (default)
    
    public void publicMethod() {
        // Accessible from anywhere
    }
    
    private void privateMethod() {
        // Accessible only within this class
    }
    
    protected void protectedMethod() {
        // Accessible within package and subclasses
    }
    
    void defaultMethod() {
        // Accessible only within package (default)
    }
}
```



## 3. Java Methods

### Method Basics
```java
public class MethodExample {
    // Method with no return value and no parameters
    public static void greet() {
        System.out.println("Hello!");
    }
    
    // Method with return value and parameters
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        greet();
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
    }
}
```

### Method Overloading
```java
public class OverloadExample {
    // Same method name, different parameters
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2.5, 3.5));
        System.out.println(add(1, 2, 3));
    }
}
```

### Recursion
```java
public class RecursionExample {
    // Factorial using recursion
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
```

### Varargs
```java
public class VarargsExample {
    // Method with variable arguments
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum()); // works with zero arguments too
    }
}
```

---

## 4. Java Classes and OOP

### Class and Object
```java
public class Car {
    // Fields (attributes)
    String brand;
    String model;
    int year;
    
    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Method
    public void displayInfo() {
        System.out.println("Brand: " + brand + 
                         ", Model: " + model + 
                         ", Year: " + year);
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayInfo();
    }
}
```

### Inheritance
```java
// Base class
class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void honk() {
        System.out.println("Honk honk!");
    }
}

// Derived class
class Car extends Vehicle {
    private String model;
    
    public Car(String brand, String model) {
        super(brand); // Call parent constructor
        this.model = model;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.honk(); // Inherited method
        myCar.displayInfo();
    }
}
```

### Polymorphism
```java
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}
```

### Encapsulation
```java
public class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current balance: " + account.getBalance());
    }
}
```

### Abstraction
```java
// Abstract class
abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract method (no implementation)
    public abstract double area();
    
    // Concrete method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double area() {
        return length * width;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 4, 6);
        
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
```

### Interfaces
```java
interface Drawable {
    void draw(); // abstract method
    default void print() { // default method
        System.out.println("Printing...");
    }
    static void display() { // static method
        System.out.println("Displaying...");
    }
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.print();
        Drawable.display();
    }
}
```



## 5. Java Data Structures

### Collections Framework Overview
- List: Ordered collection, allows duplicates
- Set: Unordered collection, no duplicates
- Map: Key-value pairs
- Queue: FIFO order
- Deque: Double-ended queue

### List Implementations
```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);
        
        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Bird");
        System.out.println("LinkedList: " + linkedList);
        
        // Common operations
        System.out.println("Size: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana"));
        arrayList.remove("Banana");
        System.out.println("After removal: " + arrayList);
    }
}
```

### Set Implementations
```java
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        // HashSet - unordered
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate
        System.out.println("HashSet: " + hashSet);
        
        // LinkedHashSet - maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        // TreeSet - sorted
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet: " + treeSet);
    }
}
```

### Map Implementations
```java
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        // HashMap - unordered
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Apple");
        hashMap.put(1, "Banana");
        hashMap.put(2, "Cherry");
        System.out.println("HashMap: " + hashMap);
        
        // LinkedHashMap - maintains insertion order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(2, "Cherry");
        System.out.println("LinkedHashMap: " + linkedHashMap);
        
        // TreeMap - sorted by keys
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(2, "Cherry");
        System.out.println("TreeMap: " + treeMap);
        
        // Common operations
        System.out.println("Value for key 2: " + treeMap.get(2));
        System.out.println("Contains key 4: " + treeMap.containsKey(4));
        System.out.println("Contains value 'Apple': " + treeMap.containsValue("Apple"));
    }
}
```

### Queue and Deque
```java
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Queue implementations
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("First");
        linkedListQueue.add("Second");
        linkedListQueue.add("Third");
        System.out.println("LinkedList Queue: " + linkedListQueue);
        System.out.println("Removed: " + linkedListQueue.remove());
        
        // PriorityQueue - natural ordering
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Orange");
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Removed: " + priorityQueue.remove());
        
        // Deque (Double-ended queue)
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");
        deque.addFirst("New First");
        System.out.println("Deque: " + deque);
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
    }
}
```

### Sorting and Searching
```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        // Sorting arrays
        int[] numbers = {5, 2, 8, 1, 6};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // Sorting lists
        List<String> fruits = Arrays.asList("Orange", "Apple", "Banana");
        Collections.sort(fruits);
        System.out.println("Natural order: " + fruits);
        
        // Custom sorting with Comparator
        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println("Sorted by length: " + fruits);
        
        // Using lambda expression (Java 8+)
        Collections.sort(fruits, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse order: " + fruits);
        
        // Searching
        Collections.sort(fruits); // Binary search requires sorted list
        int index = Collections.binarySearch(fruits, "Banana");
        System.out.println("Index of 'Banana': " + index);
    }
}
```

---

## 6. Java Advanced Concepts

### Generics
```java
// Generic class
class Box<T> {
    private T content;
    
    public void setContent(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
}

// Generic method
class GenericMethods {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Using generic class
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
        System.out.println(stringBox.getContent());
        
        Box<Integer> intBox = new Box<>();
        intBox.setContent(123);
        System.out.println(intBox.getContent());
        
        // Using generic method
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};
        
        GenericMethods.printArray(intArray);
        GenericMethods.printArray(strArray);
    }
}
```

### Lambda Expressions
```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        
        // Simple lambda expression
        languages.forEach(lang -> System.out.println(lang));
        
        // Method reference
        languages.forEach(System.out::println);
        
        // Predicate (boolean-valued function)
        Predicate<String> startsWithJ = s -> s.startsWith("J");
        languages.stream()
                .filter(startsWithJ)
                .forEach(System.out::println);
                
        // Consumer (operation that accepts a single input)
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        languages.forEach(printUpperCase);
        
        // Runnable with lambda
        Runnable runnable = () -> System.out.println("Running in a thread");
        new Thread(runnable).start();
    }
}
```

### Stream API
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby", null, "");
        
        // Filtering and mapping
        List<String> filtered = languages.stream()
                .filter(lang -> lang != null && !lang.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Filtered: " + filtered);
        
        // Sorting and limiting
        List<String> sorted = languages.stream()
                .filter(lang -> lang != null)
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3: " + sorted);
        
        // Aggregation operations
        long count = languages.stream()
                .filter(lang -> lang != null && lang.startsWith("J"))
                .count();
        System.out.println("Count starting with J: " + count);
        
        // Parallel stream
        List<String> parallelProcessed = languages.parallelStream()
                .filter(lang -> lang != null)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Parallel processed: " + parallelProcessed);
    }
}
```

### Multithreading
```java
// Extending Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

// Implementing Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Thread class
        MyThread thread1 = new MyThread();
        thread1.start();
        
        // Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
        
        // Lambda expression
        Thread thread3 = new Thread(() -> {
            System.out.println("Lambda thread running: " + Thread.currentThread().getName());
        });
        thread3.start();
        
        // Thread synchronization
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final count: " + counter.getCount());
    }
}

class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}
```

### Exception Handling
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Try-catch block
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
        
        // Multiple catch blocks
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("General exception");
        }
        
        // Finally block
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("nonexistent.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            System.out.println("Finally block executed");
        }
        
        // Custom exception
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
    
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
    
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
        System.out.println("Age is valid");
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

### Annotations
```java
import java.lang.annotation.*;
import java.lang.reflect.Method;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value() default "Default value";
    int count() default 0;
}

class AnnotationExample {
    // Applying annotation
    @MyAnnotation(value = "Test method", count = 3)
    public void testMethod() {
        System.out.println("Inside test method");
    }
    
    // Processing annotation
    public static void main(String[] args) throws Exception {
        AnnotationExample example = new AnnotationExample();
        Method method = example.getClass().getMethod("testMethod");
        
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("Value: " + annotation.value());
            System.out.println("Count: " + annotation.count());
            
            // Call method multiple times based on count
            for (int i = 0; i < annotation.count(); i++) {
                example.testMethod();
            }
        }
    }
}
```

### Reflection
```java
import java.lang.reflect.*;

class MyClass {
    private String name;
    public int value;
    
    public MyClass() {
        this.name = "Default";
        this.value = 0;
    }
    
    public MyClass(String name, int value) {
        this.name = name;
        this.value = value;
    }
    
    private void privateMethod() {
        System.out.println("Private method called");
    }
    
    public void publicMethod(String message) {
        System.out.println("Public method: " + message);
    }
    
    public String getName() {
        return name;
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get class object
        Class<?> myClass = MyClass.class;
        
        // Create instance
        MyClass instance = (MyClass) myClass.getDeclaredConstructor().newInstance();
        System.out.println("Default name: " + instance.getName());
        
        // Create instance with parameters
        Constructor<?> constructor = myClass.getDeclaredConstructor(String.class, int.class);
        MyClass paramInstance = (MyClass) constructor.newInstance("Test", 42);
        System.out.println("Parameterized name: " + paramInstance.getName());
        
        // Access fields
        Field valueField = myClass.getField("value");
        System.out.println("Value field: " + valueField.get(paramInstance));
        valueField.set(paramInstance, 100);
        System.out.println("Modified value: " + paramInstance.value);
        
        // Access private field
        Field nameField = myClass.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("Private name field: " + nameField.get(paramInstance));
        nameField.set(paramInstance, "Modified");
        System.out.println("Modified name: " + paramInstance.getName());
        
        // Call methods
        Method publicMethod = myClass.getMethod("publicMethod", String.class);
        publicMethod.invoke(paramInstance, "Hello Reflection");
        
        // Call private method
        Method privateMethod = myClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(paramInstance);
    }
}
```

---

## 7. Java File Handling

### Reading and Writing Files
```java
import java.io.*;
import java.nio.file.*;

public class FileIOExample {
    public static void main(String[] args) {
        String content = "Hello, Java File Handling!\nThis is a second line.";
        String fileName = "example.txt";
        
        // Writing to a file (Java 7+ Files class)
        try {
            Files.write(Paths.get(fileName), content.getBytes());
            System.out.println("File written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Reading from a file (Files class)
        try {
            String fileContent = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println("File content:\n" + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Traditional way with FileWriter/FileReader
        try (FileWriter writer = new FileWriter("traditional.txt")) {
            writer.write("Traditional way of writing to files");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (FileReader reader = new FileReader("traditional.txt");
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            System.out.println("Traditional file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Working with Paths
```java
import java.io.IOException;
import java.nio.file.*;

public class PathExample {
    public static void main(String[] args) {
        // Creating Path objects
        Path path1 = Paths.get("example.txt");
        Path path2 = Paths.get("/home/user/documents", "report.txt");
        
        System.out.println("Path1: " + path1);
        System.out.println("Absolute path1: " + path1.toAbsolutePath());
        System.out.println("Parent of path2: " + path2.getParent());
        System.out.println("File name of path2: " + path2.getFileName());
        
        // Checking file properties
        try {
            System.out.println("Exists: " + Files.exists(path1));
            System.out.println("Is directory: " + Files.isDirectory(path1));
            System.out.println("Is readable: " + Files.isReadable(path1));
            System.out.println("Size: " + Files.size(path1) + " bytes");
            System.out.println("Last modified: " + Files.getLastModifiedTime(path1));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Creating directories
        Path dirPath = Paths.get("testdir/subdir");
        try {
            Files.createDirectories(dirPath);
            System.out.println("Directories created");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Copying files
        try {
            Files.copy(path1, Paths.get("example_copy.txt"), 
                      StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Deleting files
        try {
            Files.deleteIfExists(Paths.get("example_copy.txt"));
            System.out.println("File deleted if existed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Serialization
```java
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age; // transient fields are not serialized
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        String filename = "person.ser";
        
        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Object serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Object deserialized: " + deserializedPerson);
            // Note: age will be 0 (default for int) because it was transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

---

## 8. Java How-To's

### How to Reverse a String
```java
public class StringReverse {
    public static String reverseString(String str) {
        // Using StringBuilder
        return new StringBuilder(str).reverse().toString();
        
        // Alternative: Manual reversal
        /*
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
        */
    }
    
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
```

### How to Check for Palindrome
```java
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal, Panama";
        String test2 = "Not a palindrome";
        
        System.out.println("Is '" + test1 + "' a palindrome? " + isPalindrome(test1));
        System.out.println("Is '" + test2 + "' a palindrome? " + isPalindrome(test2));
    }
}
```

### How to Find Factorial
```java
public class Factorial {
    // Iterative approach
    public static long factorialIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Recursive approach
    public static long factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        return n == 0 || n == 1 ? 1 : n * factorialRecursive(n - 1);
    }
    
    // Using streams (Java 8+)
    public static long factorialStream(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        return n == 0 ? 1 : LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
    
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Iterative factorial of " + number + ": " + factorialIterative(number));
        System.out.println("Recursive factorial of " + number + ": " + factorialRecursive(number));
        System.out.println("Stream factorial of " + number + ": " + factorialStream(number));
    }
}
```

### How to Generate Random Numbers
```java
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        // Using Math.random()
        double randomDouble = Math.random(); // 0.0 to 1.0
        System.out.println("Math.random(): " + randomDouble);
        
        // Random number in range (0 to 99)
        int randomInt = (int)(Math.random() * 100);
        System.out.println("Random int (0-99): " + randomInt);
        
        // Using Random class
        Random random = new Random();
        System.out.println("Random int: " + random.nextInt());
        System.out.println("Random int (0-99): " + random.nextInt(100));
        System.out.println("Random double: " + random.nextDouble());
        System.out.println("Random boolean: " + random.nextBoolean());
        
        // Using ThreadLocalRandom (better for multithreading)
        System.out.println("ThreadLocalRandom int (10-20): " + 
            ThreadLocalRandom.current().nextInt(10, 21));
    }
}
```

### How to Convert Date to String and Vice Versa
```java
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
    public static void main(String[] args) {
        // Current date
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);
        
        // Formatting date to string
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(currentDate);
        System.out.println("Formatted date: " + dateString);
        
        // Parsing string to date
        try {
            Date parsedDate = dateFormat.parse("2023-12-25 15:30:00");
            System.out.println("Parsed date: " + parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        // Java 8+ DateTime API (recommended)
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println("Java 8 LocalDateTime: " + now);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String formatted = now.format(formatter);
        System.out.println("Formatted: " + formatted);
        
        LocalDateTime parsed = LocalDateTime.parse("25/12/2023 15:30", formatter);
        System.out.println("Parsed: " + parsed);
    }
}
```

### How to Read CSV File
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<String[]> readCSV(String filePath) throws IOException {
        List<String[]> records = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(values);
            }
        }
        
        return records;
    }
    
    public static void main(String[] args) {
        String csvFile = "data.csv";
        
        try {
            List<String[]> data = readCSV(csvFile);
            System.out.println("CSV Data:");
            for (String[] row : data) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### How to Make HTTP Request
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {
    public static String sendGetRequest(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            StringBuilder response = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
            return response.toString();
        }
    }
    
    public static void main(String[] args) {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";
        
        try {
            String response = sendGetRequest(apiUrl);
            System.out.println("Response:\n" + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

## 9. Java Reference

### Java Keywords
```
abstract   continue   for          new         switch
assert     default    if           package     synchronized
boolean    do         goto         private     this
break      double     implements   protected   throw
byte       else       import       public      throws
case       enum       instanceof   return      transient
catch      extends    int          short       try
char       final      interface    static      void
class      finally    long         strictfp    volatile
const      float      native       super       while
```

### Primitive Data Types
| Type    | Size    | Range                           | Default |
|---------|---------|---------------------------------|---------|
| byte    | 8 bits  | -128 to 127                     | 0       |
| short   | 16 bits | -32,768 to 32,767               | 0       |
| int     | 32 bits | -2^31 to 2^31-1                 | 0       |
| long    | 64 bits | -2^63 to 2^63-1                 | 0L      |
| float   | 32 bits | IEEE 754 floating point         | 0.0f    |
| double  | 64 bits | IEEE 754 floating point         | 0.0d    |
| char    | 16 bits | Unicode (0 to 65,535)           | '\u0000'|
| boolean | 1 bit   | true or false                   | false   |

### Common Exceptions
- `NullPointerException`: When trying to access methods/properties on null
- `ArrayIndexOutOfBoundsException`: Invalid array index access
- `ClassCastException`: Invalid type casting
- `IllegalArgumentException`: Invalid argument passed to method
- `IOException`: Input/output operation failure
- `FileNotFoundException`: File not found
- `NumberFormatException`: Invalid string to number conversion
- `ArithmeticException`: Arithmetic error (e.g., division by zero)

### Java Version History
- Java 1.0 (1996)
- Java 1.1 (1997)
- Java 2 (1.2) (1998)
- Java 5 (1.5) (2004) - Generics, annotations, autoboxing
- Java 6 (1.6) (2006)
- Java 7 (1.7) (2011) - try-with-resources, strings in switch
- Java 8 (2014) - Lambdas, Stream API, Optional
- Java 9 (2017) - Modules, JShell
- Java 10 (2018) - Local variable type inference (var)
- Java 11 (2018) - LTS version, HTTP client
- Java 17 (2021) - Current LTS version

---

## 10. Java Examples

### Simple Calculator
```java
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
```

### Student Management System
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private int age;
    
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManagement {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    public void addStudent() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student age: ");
        int age = Integer.parseInt(scanner.nextLine());
        
        students.add(new Student(id, name, age));
        System.out.println("Student added successfully");
    }
    
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display");
            return;
        }
        
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    
    public void searchStudent() {
        System.out.print("Enter student ID to search: ");
        String id = scanner.nextLine();
        
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        
        System.out.println("Student not found with ID: " + id);
    }
    
    public void run() {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    public static void main(String[] args) {
        StudentManagement system = new StudentManagement();
        system.run();
    }
}
```

### Bank Account Simulation
```java
import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private List<String> transactionHistory;
    
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposit: +" + amount);
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawal: -" + amount);
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
    
    public void transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            recipient.balance += amount;
            
            this.transactionHistory.add("Transfer to " + recipient.accountNumber + ": -" + amount);
            recipient.transactionHistory.add("Transfer from " + this.accountNumber + ": +" + amount);
            
            System.out.println("Transfer successful");
        } else {
            System.out.println("Invalid transfer amount or insufficient funds");
        }
    }
    
    public void printStatement() {
        System.out.println("\nAccount Statement for " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
        System.out.println("\nTransaction History:");
        
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "Alice Johnson");
        BankAccount account2 = new BankAccount("789012", "Bob Smith");
        
        account1.deposit(1000);
        account1.withdraw(200);
        account1.transfer(account2, 300);
        
        account2.deposit(500);
        account2.withdraw(100);
        
        account1.printStatement();
        account2.printStatement();
    }
}
```

### To-Do List Application
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TodoItem {
    private String description;
    private boolean isCompleted;
    
    public TodoItem(String description) {
        this.description = description;
        this.isCompleted = false;
    }
    
    public String getDescription() { return description; }
    public boolean isCompleted() { return isCompleted; }
    
    public void markAsComplete() {
        isCompleted = true;
    }
    
    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description;
    }
}

public class TodoList {
    private List<TodoItem> items = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    public void addItem() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        items.add(new TodoItem(description));
        System.out.println("Task added");
    }
    
    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("No tasks in the list");
            return;
        }
        
        System.out.println("\nTo-Do List:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }
    
    public void markItemComplete() {
        listItems();
        if (items.isEmpty()) return;
        
        System.out.print("Enter task number to mark complete: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());
        
        if (taskNumber > 0 && taskNumber <= items.size()) {
            items.get(taskNumber - 1).markAsComplete();
            System.out.println("Task marked as complete");
        } else {
            System.out.println("Invalid task number");
        }
    }
    
    public void removeItem() {
        listItems();
        if (items.isEmpty()) return;
        
        System.out.print("Enter task number to remove: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());
        
        if (taskNumber > 0 && taskNumber <= items.size()) {
            items.remove(taskNumber - 1);
            System.out.println("Task removed");
        } else {
            System.out.println("Invalid task number");
        }
    }
    
    public void run() {
        while (true) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    listItems();
                    break;
                case 3:
                    markItemComplete();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    public static void main(String[] args) {
        TodoList app = new TodoList();
        app.run();
    }
}
```

### Connect Four Game
```java
import java.util.Arrays;
import java.util.Scanner;

public class ConnectFour {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY = '.';
    private static final char[] PLAYERS = {'X', 'O'};
    
    private char[][] board;
    private int currentPlayer;
    private Scanner scanner;
    
    public ConnectFour() {
        board = new char[ROWS][COLS];
        for (char[] row : board) {
            Arrays.fill(row, EMPTY);
        }
        currentPlayer = 0;
        scanner = new Scanner(System.in);
    }
    
    public void printBoard() {
        for (int i = 0; i < COLS; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(" " + cell);
            }
            System.out.println();
        }
    }
    
    public boolean dropPiece(int col) {
        if (col < 0 || col >= COLS || board[0][col] != EMPTY) {
            return false;
        }
        
        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][col] == EMPTY) {
                board[row][col] = PLAYERS[currentPlayer];
                return true;
            }
        }
        
        return false;
    }
    
    public boolean checkWin() {
        char player = PLAYERS[currentPlayer];
        
        // Check horizontal
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == player &&
                    board[row][col+1] == player &&
                    board[row][col+2] == player &&
                    board[row][col+3] == player) {
                    return true;
                }
            }
        }
        
        // Check vertical
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] == player &&
                    board[row+1][col] == player &&
                    board[row+2][col] == player &&
                    board[row+3][col] == player) {
                    return true;
                }
            }
        }
        
        // Check diagonal (top-left to bottom-right)
        for (int row = 0; row < ROWS - 3; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == player &&
                    board[row+1][col+1] == player &&
                    board[row+2][col+2] == player &&
                    board[row+3][col+3] == player) {
                    return true;
                }
            }
        }
        
        // Check diagonal (bottom-left to top-right)
        for (int row = 3; row < ROWS; row++) {
            for (int col = 0; col < COLS - 3; col++) {
                if (board[row][col] == player &&
                    board[row-1][col+1] == player &&
                    board[row-2][col+2] == player &&
                    board[row-3][col+3] == player) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean isBoardFull() {
        for (int col = 0; col < COLS; col++) {
            if (board[0][col] == EMPTY) {
                return false;
            }
        }
        return true;
    }
    
    public void play() {
        System.out.println("Connect Four Game!");
        printBoard();
        
        while (true) {
            System.out.println("Player " + (currentPlayer + 1) + 
                             " (" + PLAYERS[currentPlayer] + "), choose a column (1-" + COLS + "): ");
            int col;
            try {
                col = Integer.parseInt(scanner.nextLine()) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
                continue;
            }
            
            if (!dropPiece(col)) {
                System.out.println("Invalid move. Try again.");
                continue;
            }
            
            printBoard();
            
            if (checkWin()) {
                System.out.println("Player " + (currentPlayer + 1) + " wins!");
                break;
            }
            
            if (isBoardFull()) {
                System.out.println("Game over. It's a draw!");
                break;
            }
            
            currentPlayer = (currentPlayer + 1) % PLAYERS.length;
        }
    }
    
    public static void main(String[] args) {
        ConnectFour game = new ConnectFour();
        game.play();
    }
}
```

This comprehensive Java guide covers all the essential topics from basic syntax to advanced concepts, with practical examples for each section. You can study it sequentially or use it as a reference for specific topics. The examples range from simple demonstrations to complete applications like the Student Management System and Connect Four game.

To continue your Java journey:
1. Practice all the examples
2. Modify them to add new features
3. Work on personal projects
4. Explore Java frameworks like Spring and Hibernate
5. Learn about design patterns in Java
6. Study Java performance optimization
7. Explore Java for Android development

Happy coding!