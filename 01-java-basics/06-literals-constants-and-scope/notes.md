# Lesson 6 – Literals, Constants and Variable Scope

## 1. What are literals?

A literal is a fixed value written directly in Java source code.

Examples:

```java
int age = 25;
double amount = 1500.50;
String name = "Amit";
char grade = 'A';
boolean paid = true;
```

## 2. Types of literals

- Integer literals
- Floating-point literals
- Character literals
- String literals
- Boolean literals
- Null literal

## 3. Integer literal representations

Java supports:

| Representation | Prefix | Example |
|---|---|---|
| Decimal | None | `25` |
| Binary | `0b` | `0b11001` |
| Octal | `0` | `031` |
| Hexadecimal | `0x` | `0x19` |

All four examples represent decimal value 25.

## 4. Floating-point literals

```java
float price = 10.5f;
double balance = 1500.50;
```

- Decimal literals are double by default.
- Use f or F for float.
- Use d or D optionally for double.

## 5. Character and String literals

```java
char grade = 'A';
String name = "Amit";
```

- char uses single quotes.
- String uses double quotes.
- String is a Java class, not a primitive type.

## 6. Boolean and null literals

```java
boolean paid = true;
String address = null;
```

- Boolean values are true and false.
- null represents the absence of an object reference.
- null cannot be assigned to primitive data types.

## 7. Underscores in numeric literals

Underscores improve the readability of large numeric literals.

```java
long population = 9_876_543_210L;
```

They do not change the value.

## 8. Escape sequences

| Escape | Meaning |
|---|---|
| `\n` | New line |
| `\t` | Tab |
| `\"` | Double quotation mark |
| `\'` | Single quotation mark |
| `\\` | Backslash |
| `\r` | Carriage return |
| `\b` | Backspace |

## 9. Constants

A constant is a variable that cannot be reassigned after initialization.

Use the final keyword.

```java
final double TAX_RATE = 18.0;
final int MAX_ATTEMPTS = 3;
```

Naming convention: uppercase letters with underscores.

Class-level constants commonly use static final.

```java
static final String APP_NAME = "Digital Khata";
```

## 10. Variable scope

Scope determines where a variable can be accessed.

### Local variable

Declared inside a method or constructor.

### Block variable

Declared inside a block and accessible only within that block.

### Instance variable

Declared in a class outside methods. Each object gets its own instance fields.

### Static variable

Declared with static. Shared by all objects of the class.

## 11. Default values

Fields receive default values.

| Data type | Default value |
|---|---|
| int | 0 |
| long | 0L |
| double | 0.0 |
| float | 0.0f |
| boolean | false |
| char | '\u0000' |
| Reference types | null |

Local variables must be initialized before use.

## 12. What I learned

- Meaning of literals.
- Types of Java literals.
- Binary, octal and hexadecimal numbers.
- Escape sequences.
- Constants using final.
- Static final class constants.
- Local and block scope.
- Instance and static variables.
- Default values of fields.

## 13. Practical exercises

1. Print different types of literals.
2. Create and use constants.
3. Demonstrate variable scope.
4. Create a shared customer counter.
5. Format a receipt using escape sequences.