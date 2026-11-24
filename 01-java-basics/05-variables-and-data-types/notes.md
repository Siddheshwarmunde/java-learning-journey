# Lesson 5 – Variables and Data Types in Java

## 1. What is a variable?

A variable is a named storage location that holds a value in a Java program.

Example:

```java
int age = 25;
String name = "Siddheshwar";
double balance = 1500.50;
```

## 2. Variable declaration and initialization

Syntax:

```java
dataType variableName = value;
```

Example:

```java
int age;
age = 25;
```

Or:

```java
int age = 25;
```

A local variable must be initialized before it is used.

## 3. Eight primitive data types

| Data type | Size | Purpose |
|---|---:|---|
| byte | 8 bits | Small whole numbers |
| short | 16 bits | Whole numbers |
| int | 32 bits | Ordinary whole numbers |
| long | 64 bits | Large whole numbers |
| float | 32 bits | Decimal numbers |
| double | 64 bits | Decimal numbers |
| char | 16 bits | One UTF-16 code unit |
| boolean | Not specified | true or false |

Examples:

```java
byte number = 100;
short year = 2026;
int age = 25;
long population = 9000000000L;
float price = 10.5f;
double balance = 1500.50;
char grade = 'A';
boolean paid = true;
```

## 4. String

String stores text. It is a Java class, not a primitive data type.

```java
String name = "Amit";
String city = "Pune";
```

Use double quotes for String and single quotes for char.

## 5. Updating variables

```java
int age = 22;
age = 23;
```

The value changes without declaring the variable again.

## 6. Variable naming rules

- Cannot start with a digit.
- Cannot contain spaces.
- Cannot use Java keywords.
- Java is case-sensitive.
- Use meaningful names.
- Follow camelCase naming conventions.

Examples:

```java
String customerName = "Amit";
double accountBalance = 1500.50;
```

## 7. Printing variable values

```java
String name = "Amit";
System.out.println("Hello " + name);
```

Output:

```text
Hello Amit
```

The `+` operator joins text and variable values. This is called string concatenation.

## 8. Important points

- Java has eight primitive data types.
- String is a class, not a primitive.
- Use L for long literals when needed.
- Use f for float literals.
- Use single quotes for char.
- Use double quotes for String.
- Initialize local variables before using them.
- Use String for phone numbers because they are identifiers, not quantities.
- BigDecimal is preferable for precise monetary calculations in financial applications.

## 9. Practical exercises

1. Create and print personal information.
2. Store and display Digital Khata customer information.
3. Update a customer balance and print the original and updated values.
4. Identify appropriate data types for different information.

## 10. What I learned

- Variables and data types.
- Declaration and initialization.
- Eight primitive data types.
- String and its use.
- Updating variable values.
- Naming conventions.
- Printing variables and concatenating text.

