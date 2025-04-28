╔════════════════════════════════╗
║    JAVA MASTERY PROGRAM        ║
╚════════════════════════════════╝

Choose a chapter to practice:
# 1.  Chapter 1 - Introduction to Java
        ╔════════════════════════════════╗
        ║ CHAPTER 1- INTRODUCTION TO JAVA║
        ╚════════════════════════════════╝

        Choose a practice problem:
        1. Sum three numbers
        2. Calculate CGPA using marks of 3 subjects
        3. Greet user by name
        4. Convert Kilometers into miles
        5. Detect if a number is an integer
        6. Basic calculator (add, subtract, multiply, divide)
        7. Temperature converter (Celsius to Fahrenheit)
        8. Simple interest calculator
        9. Print ASCII value of a character
        10. Swap two numbers without temporary variable
---
## What is Java?
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


### Java Development History and Evolution
- Created by James Gosling at Sun Microsystems in 1995
- Java versions evolution from JDK 1.0 to the latest (Java 21 as of 2023)
- Key milestones: Introduction of Generics (Java 5), Lambda expressions (Java 8), Modules (Java 9)
- Regular release cycle with new versions every 6 months (since Java 9)

### How Java Works
- Source code (.java) → Java compiler → Bytecode (.class) → JVM → Machine code
- JVM architecture: Class loader, JIT compiler, Garbage collector
- JRE vs JDK: Runtime Environment vs Development Kit 

### Java Development Tools
- IDEs: IntelliJ IDEA, Eclipse, NetBeans, Visual Studio Code
- Build tools: Maven, Gradle, Ant
- Testing frameworks: JUnit, TestNG
- Debugging and profiling tools

### Java Memory Management
- Automatic memory management through garbage collection
- Stack vs Heap memory
- Different garbage collection algorithms

### Java Program Structure
        ```java
        // Package declaration
        package com.example;

        // Import statements
        import java.util.Scanner;

        // Class declaration
        public class Example {
        // Fields (variables)
        private int number;
        
        // Constructor
        public Example(int number) {
                this.number = number;
        }
        
        // Methods
        public void display() {
                System.out.println("Number: " + number);
        }
        
        // Main method (program entry point)
        public static void main(String[] args) {
                Example example = new Example(10);
                example.display();
        }
        }
        ```

### Java Documentation
- JavaDoc - standard for documenting Java code
- How to write and generate documentation
```java
/**
 * This class demonstrates documentation comments
 * @author Your Name
 * @version 1.0
 */
public class DocumentationExample {
    /**
     * Adds two numbers
     * @param a first number
     * @param b second number
     * @return sum of the numbers
     */
    public int add(int a, int b) {
        return a + b;
    }
}
```

### Java Community and Resources
- Oracle's official documentation
- Community forums: Stack Overflow, Reddit
- Open-source contributions
- Professional certifications
                

# 2.  Chapter 2 - Variables, Data Types & Operators
        ╔══════════════════════════════════════════════╗
        ║ CHAPTER 2 - VARIABLES, DATA TYPES & OPERATORS ║
        ╚══════════════════════════════════════════════╝

        Choose a practice problem:
        1. Expression evaluation (7/4 * 9/2)
        2. Grade encryption/decryption
        3. Number comparison with user input
        4. Physics expression (v²-u²/2as)
        5. Expression evaluation (7*49/7 + 35/7)
        6. Type conversion examples
        7. Bitwise operations demonstration
        8. Compound assignment operations
        9. Operator precedence demonstration
        10. Ternary operator example

# 3.  Chapter 3 - Strings & Methods
        ╔══════════════════════════════════╗
        ║ CHAPTER 3 - STRINGS & METHODS   ║
        ╚══════════════════════════════════╝

        Choose a practice problem:
        1. Convert string to lowercase
        2. Replace spaces with underscores
        3. Letter template with name replacement
        4. Detect double and triple spaces
        5. Format letter with escape sequences
        6. String palindrome check
        7. Count vowels in a string
        8. Reverse a string
        9. Count words in a string
        10. String concatenation vs StringBuilder

# 4.  Chapter 4 - Conditionals & Decision Making

5.  Chapter 5 - Loops & Iteration
6.  Chapter 6 - Arrays & Collections
7.  Chapter 7 - Methods & Functions
8.  Chapter 8 - Object-Oriented Programming
9.  Chapter 9 - Exception Handling
10. Chapter 10 - File I/O Operations
11. Chapter 11 - Multithreading
12. Chapter 12 - Java Collections Framework
13. Chapter 13 - Generics
14. Chapter 14 - Lambda Expressions
15. Chapter 15 - Stream API
16. Chapter 16 - JDBC & Database Connectivity
17. Chapter 17 - Networking
18. Chapter 18 - Java GUI (Swing/JavaFX)
19. Chapter 19 - Design Patterns
20. Chapter 20 - Advanced Topics (JVM, Reflection)
