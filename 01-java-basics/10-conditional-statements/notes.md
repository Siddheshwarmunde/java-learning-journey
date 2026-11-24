# Lesson 10 – Conditional Statements in Java

## 1. What are conditional statements?

Conditional statements allow a Java program to make decisions based on conditions.

They execute different blocks of code depending on whether a condition is true or false.

Java conditions must evaluate to boolean values.

## 2. if statement

The if statement executes a block when its condition is true.

Syntax:

```java
if (condition) {
    // Code executes when true
}
```

Example:

```java
int age = 25;

if (age >= 18) {
    System.out.println("Eligible");
}
```

## 3. if-else statement

Executes one block when true and another when false.

Syntax:

```java
if (condition) {

    // True block

} else {

    // False block

}
```

Example:

```java
double balance = 0;

if (balance > 0) {
    System.out.println("Payment Pending");
} else {
    System.out.println("Payment Completed");
}
```

## 4. else-if ladder

Used when multiple conditions need to be checked.

Syntax:

```java
if (condition1) {

} else if (condition2) {

} else if (condition3) {

} else {

}
```

Java checks conditions from top to bottom and executes the first matching branch.

## 5. Nested if

An if statement inside another if statement is called a nested if.

Example:

```java
if (accountActive) {

    if (balance >= withdrawalAmount) {
        System.out.println("Withdrawal successful");
    }

}
```

Useful when a second decision depends on the first condition.

## 6. Logical operators in conditions

| Operator | Meaning |
|---|---|
| && | Both conditions must be true |
| || | At least one condition must be true |
| ! | Reverses the boolean value |

Example:

```java
if (age >= 18 && hasId) {
    System.out.println("Access granted");
}
```

## 7. Relational operators

| Operator | Meaning |
|---|---|
| == | Equal to |
| != | Not equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal |
| <= | Less than or equal |

These operators return true or false.

## 8. String comparison

Use equals() to compare String contents.

```java
if ("admin".equals(username)) {
    System.out.println("Welcome");
}
```

Use equalsIgnoreCase() for case-insensitive comparison.

Avoid == for comparing String contents.

## 9. Common mistakes

- Using = instead of ==.
- Incorrect else-if condition ordering.
- Forgetting braces.
- Using == for String content comparison.
- Failing to validate input ranges.
- Forgetting that Java conditions must produce boolean values.

## 10. Real-world uses

Conditional statements can be used for:

- Customer payment status.
- Account eligibility.
- Login validation.
- Balance checking.
- Discount calculation.
- Access permissions.
- Customer categorization.

## 11. What I learned

- What conditional statements are.
- How if works.
- How if-else works.
- How else-if ladders work.
- How nested if works.
- Logical and relational operators in conditions.
- String comparisons.
- How Java makes decisions in real applications.