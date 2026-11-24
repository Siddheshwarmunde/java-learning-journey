# Lesson 9 – User Input Using Scanner in Java

## 1. What is Scanner?

Scanner is a Java class used to read input from different sources, including the keyboard.

It belongs to the java.util package.

Import:

```java
import java.util.Scanner;
```

Create an object:

```java
Scanner sc = new Scanner(System.in);
```

System.in represents standard keyboard input.

## 2. Reading String input

### next()

Reads one token and stops at whitespace.

```java
String name = sc.next();
```

### nextLine()

Reads an entire line, including spaces.

```java
String fullName = sc.nextLine();
```

## 3. Scanner methods

| Method | Purpose |
|---|---|
| nextInt() | Read int |
| nextLong() | Read long |
| nextShort() | Read short |
| nextByte() | Read byte |
| nextFloat() | Read float |
| nextDouble() | Read double |
| nextBoolean() | Read boolean |
| next() | Read one token |
| nextLine() | Read a complete line |

## 4. Reading characters

Scanner does not have a nextChar() method.

Use:

```java
char grade = sc.next().charAt(0);
```

## 5. Difference between next() and nextLine()

- next() reads one token.
- nextLine() reads an entire line.
- next() stops at whitespace.
- nextLine() includes spaces in its returned String.

## 6. Scanner newline issue

Numeric methods such as nextInt() leave the remaining line separator behind.

Example:

```java
int age = sc.nextInt();
sc.nextLine();

String name = sc.nextLine();
```

The additional nextLine() consumes the leftover newline before reading the name.

## 7. Input validation methods

Scanner provides methods for checking input:

```java
sc.hasNext();
sc.hasNextInt();
sc.hasNextDouble();
sc.hasNextLong();
sc.hasNextBoolean();
```

These methods return boolean values.

Example:

```java
if (sc.hasNextInt()) {
    int number = sc.nextInt();
    System.out.println(number);
} else {
    System.out.println("Invalid input");
}
```

## 8. Closing Scanner

Use:

```java
sc.close();
```

Close Scanner after all required input has been read.

Be careful: closing a Scanner created using System.in also closes standard input.

## 9. Digital Khata example

Scanner can accept:
- Customer name.
- Mobile number.
- Age.
- Total amount.
- Amount paid.
- Payment status.

Example:

```java
String customerName = sc.nextLine();
String mobileNumber = sc.nextLine();
int age = sc.nextInt();
double totalAmount = sc.nextDouble();
```

## 10. Important points

- Scanner belongs to java.util.
- System.in reads standard keyboard input.
- next() reads one token.
- nextLine() reads a complete line.
- nextInt() reads integers.
- nextDouble() reads decimal numbers.
- nextBoolean() reads true or false.
- next().charAt(0) reads the first character.
- Use hasNextInt() to check integer input.
- Numeric input methods may throw InputMismatchException.
- Be aware of the leftover newline after numeric input.
- Use String for phone numbers.

## 11. What I learned

- Scanner class and its purpose.
- Importing and creating Scanner objects.
- Reading different data types.
- next() versus nextLine().
- Reading character input.
- Handling newline issues.
- Checking input with hasNext methods.
- Accepting Digital Khata customer details.