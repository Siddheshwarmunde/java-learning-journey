# Lesson 12 – for Loop in Java

## 1. What is a loop?

A loop is a programming structure that executes a block of code repeatedly while a condition allows it to continue.

Loops reduce repeated code and make programs more efficient.

## 2. What is a for loop?

A for loop is used to repeat code based on a condition, commonly when the number of repetitions is known or controlled by a counter.

### Syntax

```java
for (initialization; condition; update) {

    // Repeated code

}
```

## 3. Three parts of a for loop

| Component | Purpose |
|---|---|
| Initialization | Initializes the counter |
| Condition | Determines whether to continue |
| Update | Changes the counter |

Example:

```java
for (int i = 1; i <= 5; i++) {

    System.out.println(i);

}
```

Output:

```text
1
2
3
4
5
```

## 4. Execution order

1. Initialization executes once.
2. Condition is checked.
3. If true, the loop body executes.
4. Update executes.
5. Condition is checked again.
6. When false, the loop terminates.

## 5. Forward counting

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

## 6. Backward counting

```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

## 7. Even and odd numbers

Even numbers:

```java
for (int i = 2; i <= 20; i += 2) {
    System.out.println(i);
}
```

Odd numbers:

```java
for (int i = 1; i <= 19; i += 2) {
    System.out.println(i);
}
```

## 8. Calculations using for loops

### Sum of numbers

```java
int sum = 0;

for (int i = 1; i <= 10; i++) {
    sum += i;
}
```

### Multiplication table

```java
int number = 5;

for (int i = 1; i <= 10; i++) {
    System.out.println(number * i);
}
```

### Factorial

```java
int number = 5;
long factorial = 1;

for (int i = 1; i <= number; i++) {
    factorial *= i;
}
```

## 9. Nested for loops

A nested loop is a for loop inside another for loop.

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 2; j++) {

        System.out.println(i + " " + j);

    }

}
```

The inner loop completes its iterations for each iteration of the outer loop.

## 10. Multiple variables

Java allows multiple variables in the initialization and update sections.

```java
for (int i = 1, j = 5; i <= 5; i++, j--) {

    System.out.println(i + " " + j);

}
```

## 11. Optional sections

Some for loop sections can be omitted.

```java
int i = 1;

for (; i <= 5; i++) {
    System.out.println(i);
}
```

An infinite loop can be written as:

```java
for (;;) {
    // Repeated code
}
```

It needs a way to terminate to avoid running indefinitely.

## 12. Variable scope

A counter declared in the initialization section is scoped to the for loop.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

The variable i cannot normally be accessed after the loop.

## 13. Common mistakes

- Using an incorrect loop condition.
- Forgetting to update the counter.
- Updating in the wrong direction.
- Creating an unintended infinite loop.
- Making off-by-one errors.
- Confusing outer and inner loop counters.

## 14. Real-world uses

For loops are useful for:

- Processing transaction records.
- Calculating totals.
- Generating reports.
- Printing multiplication tables.
- Processing lists of customers.
- Repeating operations a known number of times.

## 15. What I learned

- What loops are.
- for loop syntax.
- Initialization, condition and update.
- Forward and backward counting.
- Even and odd numbers.
- Calculations using loops.
- Nested loops.
- Multiple loop variables.
- Optional loop sections.
- Variable scope in for loops.