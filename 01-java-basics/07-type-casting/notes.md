# Lesson 7 – Type Casting in Java

## 1. What is type casting?

Type casting is the process of converting a value from one data type into another compatible data type.

Java has two main types of primitive conversion:

- Widening casting
- Narrowing casting

## 2. Widening casting

Widening is the automatic conversion of a primitive value into a compatible type with a wider range.

Example:

```java
int number = 100;
double result = number;
```

Output:

```text
100.0
```

Common widening paths:

- byte → short → int → long → float → double
- char → int → long → float → double

Widening is automatic, but conversions to floating-point types can lose precision.

## 3. Narrowing casting

Narrowing is the explicit conversion of a value into a smaller or less precise compatible type.

Syntax:

```java
targetType variable = (targetType) value;
```

Example:

```java
double price = 99.99;
int result = (int) price;
```

Output:

```text
99
```

The fractional portion is truncated toward zero, not rounded.

## 4. Data loss during casting

Example:

```java
int number = 130;
byte result = (byte) number;
```

Output:

```text
-126
```

The byte type has a range of -128 to 127. Narrowing can discard bits and change the value.

## 5. Character casting

A char can be converted into an integer code unit.

```java
char letter = 'A';
int code = letter;
```

Output:

```text
65
```

An integer can also be explicitly converted into char.

```java
int number = 66;
char letter = (char) number;
```

Output:

```text
B
```

## 6. Type promotion

During arithmetic, byte, short and char operands are generally promoted to int.

Example:

```java
byte a = 10;
byte b = 20;

int result = a + b;
```

Output:

```text
30
```

To assign the result to byte, an explicit cast is required.

```java
byte result = (byte) (a + b);
```

## 7. String conversion

String-to-number conversion uses parsing methods, not primitive casting.

```java
int age = Integer.parseInt("25");
double amount = Double.parseDouble("1500.50");
float price = Float.parseFloat("10.5");
long number = Long.parseLong("9000000000");
```

Number-to-String conversion:

```java
String text = String.valueOf(25);
```

Invalid numeric text can cause NumberFormatException.

## 8. Boolean conversion

Boolean is not compatible with numeric primitive casting.

Java does not allow converting true to 1 or false to 0.

## 9. Important differences

| Widening | Narrowing |
|---|---|
| Automatic | Explicit |
| No cast syntax required | Cast syntax required |
| Usually preserves magnitude | Can overflow or lose information |
| Example: int to double | Example: double to int |

## 10. Important points

- Java supports automatic widening.
- Java requires explicit narrowing.
- Narrowing can lose precision or magnitude.
- float and double can have precision limitations.
- Smaller integer operands are promoted to int in most arithmetic expressions.
- String parsing is different from primitive casting.
- Boolean cannot be converted to numeric primitive types.

## 11. What I learned

- Meaning of type casting.
- Widening conversion.
- Narrowing conversion.
- Type promotion.
- Character conversion.
- String parsing and conversion.
- Data loss during narrowing.