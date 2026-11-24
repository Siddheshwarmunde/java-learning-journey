# Lesson 8 – Operators in Java

## 1. What are operators?

Operators are special symbols used to perform operations on variables and values.

Example:

```java
int a = 10;
int b = 20;

int result = a + b;
```

Here:
- `a` and `b` are operands.
- `+` is the operator.
- `30` is the result.

## 2. Arithmetic operators

| Operator | Meaning |
|---|---|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus (remainder) |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Integer division discards the fractional part when both operands are integers.

## 3. Assignment operators

| Operator | Meaning |
|---|---|
| = | Assignment |
| += | Add and assign |
| -= | Subtract and assign |
| *= | Multiply and assign |
| /= | Divide and assign |
| %= | Modulus and assign |

Example:

```java
int balance = 5000;
balance += 1000;
balance -= 500;
```

Compound assignment performs an operation and stores the result back into the variable.

## 4. Relational operators

| Operator | Meaning |
|---|---|
| == | Equal to |
| != | Not equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal to |
| <= | Less than or equal to |

Relational operators return boolean values: true or false.

## 5. Logical operators

| Operator | Meaning |
|---|---|
| && | Logical AND |
| \|\| | Logical OR |
| ! | Logical NOT |

- AND requires both conditions to be true.
- OR requires at least one condition to be true.
- NOT reverses a boolean value.

The && and || operators support short-circuit evaluation.

## 6. Unary operators

| Operator | Meaning |
|---|---|
| + | Unary positive |
| - | Unary negative |
| ++ | Increment |
| -- | Decrement |
| ! | Logical NOT |
| ~ | Bitwise complement |

### Pre-increment

```java
int a = 5;
int result = ++a;
```

The variable is incremented before its value is used.

### Post-increment

```java
int a = 5;
int result = a++;
```

The original value is used before incrementing the variable.

## 7. Bitwise operators

| Operator | Meaning |
|---|---|
| & | Bitwise AND |
| \| | Bitwise OR |
| ^ | Bitwise XOR |
| ~ | Bitwise complement |

Bitwise operators work on individual bits of integral values.

## 8. Shift operators

| Operator | Meaning |
|---|---|
| << | Left shift |
| >> | Signed right shift |
| >>> | Unsigned right shift |

Shift operators move bits to the left or right.

## 9. Ternary operator

The ternary operator is a conditional expression.

Syntax:

```java
condition ? valueIfTrue : valueIfFalse;
```

Example:

```java
int age = 20;

String status = age >= 18 ? "Eligible" : "Not Eligible";
```

## 10. instanceof operator

Checks whether an object is an instance of a particular type.

```java
String name = "Amit";

System.out.println(name instanceof String);
```

## 11. Operator precedence

Operator precedence determines the order in which operators are evaluated.

Example:

```java
int result = 10 + 5 * 2;
```

Multiplication happens before addition, producing 20.

Use parentheses to make expressions clear.

## 12. Operator categories summary

1. Arithmetic operators
2. Assignment operators
3. Relational operators
4. Logical operators
5. Unary operators
6. Bitwise operators
7. Shift operators
8. Conditional (ternary) operator
9. instanceof operator

## 13. Important points

- = assigns a value, while == compares values.
- Integer division can discard fractional parts.
- Modulus returns a remainder.
- && and || perform short-circuit evaluation.
- ++ increases a value by one.
- -- decreases a value by one.
- Bitwise operators work on individual bits.
- Operator precedence determines evaluation order.
- Parentheses make complex expressions easier to understand.

## 14. What I learned

- What Java operators are.
- Arithmetic and assignment operators.
- Relational and logical operators.
- Unary, increment and decrement operators.
- Bitwise and shift operators.
- Ternary and instanceof operators.
- Operator precedence and associativity.
- Using operators in customer balance calculations.