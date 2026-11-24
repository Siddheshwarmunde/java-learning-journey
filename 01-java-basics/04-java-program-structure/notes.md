# Lesson 4: Java Program Structure and Basic Output Statements

## 1. Structure of a Java Program

A basic Java program contains a package declaration, class and main method.

### Example

```java
package com.learning.javabasics;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Siddheshwar!");

    }

}
```

### Main parts of a Java program

1. Package
2. Class
3. Main method
4. Statements

---

## 2. What is a Package?

A package is used to organise related Java classes.

### Example

```java
package com.learning.javabasics;
```

Packages help organise large Java applications.

Example package structure for a Digital Khata application:

```text
com.digitalkhata
    ├── user
    ├── customer
    ├── supplier
    └── ledger
```

---

## 3. What is a Class?

A class is a blueprint for creating objects.

### Example

```java
public class Main {

}
```

Important points:

- `class` is a Java keyword.
- `Main` is the class name.
- `public` is an access modifier.
- Curly braces `{ }` define the class body.

### Important rule

If a class is declared public, its filename must match the class name.

Example:

```text
Main.java → public class Main
```

---

## 4. What is the main() Method?

The `main()` method is the standard entry point used when launching a traditional Java application.

### Syntax

```java
public static void main(String[] args) {

}
```

### Meaning of each keyword

| Keyword | Meaning |
|---|---|
| public | Accessible to the Java launcher |
| static | Can be invoked without creating a Main object |
| void | Does not return a value |
| main | Entry-point method name |
| String[] args | Receives command-line arguments |

---

## 5. System.out.println()

`println()` displays output and moves the cursor to the next line.

### Example

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("Welcome to Java");
        System.out.println("Java learning begins");

    }
}
```

### Output

```text
Hello
Welcome to Java
Java learning begins
```

Each statement displays its output on a separate line.

---

## 6. System.out.print()

`print()` displays output without automatically moving to the next line.

### Example

```java
public class Main {

    public static void main(String[] args) {

        System.out.print("Hello ");
        System.out.print("Siddheshwar ");
        System.out.print("Welcome to Java");

    }
}
```

### Output

```text
Hello Siddheshwar Welcome to Java
```

---

## 7. Difference between print() and println()

| print() | println() |
|---|---|
| Prints on the current line | Prints and moves to the next line |
| No automatic line break | Adds a line break |
| Useful for same-line output | Useful for separate lines |

---

## 8. System.out.printf()

`printf()` is used to display formatted output.

### Example

```java
public class Main {

    public static void main(String[] args) {

        System.out.printf("My age is %d", 22);

    }
}
```

### Output

```text
My age is 22
```

### Common format specifiers

| Specifier | Used for |
|---|---|
| %d | Integer |
| %f | Decimal number |
| %s | String |
| %c | Character |
| %n | New line |

---

## 9. What are Java Comments?

Comments are notes written inside Java code.

Java compiler ignores comments when compiling the program.

Comments help developers understand and explain code.

There are three common types of comments.

### 9.1 Single-line comment

Syntax:

```java
// This is a single-line comment
```

Example:

```java
public class Main {

    public static void main(String[] args) {

        // Display a message
        System.out.println("Hello Java");

    }
}
```

### 9.2 Multi-line comment

Syntax:

```java
/*
 This is a multi-line comment.
 We can write multiple lines here.
*/
```

Example:

```java
public class Main {

    public static void main(String[] args) {

        /*
         This program displays
         a Java welcome message.
        */

        System.out.println("Welcome to Java");

    }
}
```

### 9.3 Documentation comment

Documentation comments are used to describe classes, methods and other program elements.

They can be processed by the Javadoc tool to generate documentation.

Syntax:

```java
/**
 * This is a documentation comment.
 * It describes the Java program.
 */
public class Main {

}
```

---

## 10. Practical 1 – Personal Introduction

### Java program

```java
package com.learning.javabasics;

public class Main {

    public static void main(String[] args) {

        System.out.println("My Java Learning Journey");
        System.out.println("------------------------");

        System.out.print("My name is ");
        System.out.print("Siddheshwar.");

        System.out.println();

        System.out.println("I am learning Java.");
        System.out.println("My goal is to become a Java Backend Developer.");

    }
}
```

### Expected output

```text
My Java Learning Journey
------------------------
My name is Siddheshwar.
I am learning Java.
My goal is to become a Java Backend Developer.
```

---

## 11. Practical 2 – Using Java Comments

### Java program

```java
package com.learning.javabasics;

// This program displays my introduction

public class Main {

    public static void main(String[] args) {

        // Display my name
        System.out.println("My name is Siddheshwar.");

        /*
         * Display my career goal.
         * I want to become a Java Backend Developer.
         */

        System.out.println("My goal is Java Backend Development.");

    }
}
```

### Important observation

Comments do not appear in the program output.

---

## 12. Important Java Rules

1. Java is case-sensitive.
2. Every Java statement generally ends with a semicolon `;`.
3. Curly braces `{ }` define blocks of code.
4. A public class name must match its filename.
5. The standard Java application entry point is `main()`.
6. `System.out.println()` prints output with a line break.
7. `System.out.print()` prints output without an automatic line break.
8. Comments are ignored by the Java compiler.

---

## 13. What I Learned in This Lesson

- Understood Java program structure.
- Learned about packages.
- Learned about classes.
- Understood the main() method.
- Learned the meaning