# Lesson 13 – while and do-while Loops in Java

## 1. What is a while loop?

A while loop repeatedly executes a block of code as long as its condition is true.

### Syntax

```java
while (condition) {

    // Repeated code

}
```

The condition is checked before executing the loop body.

## 2. Execution order of while

1. Initialize the variable.
2. Check the condition.
3. Execute the loop body if true.
4. Update the variable.
5. Check the condition again.
6. Stop when the condition becomes false.

A while loop can execute zero times.

## 3. Basic while loop

```java
int i = 1;

while (i <= 5) {

    System.out.println(i);

    i++;

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

## 4. Different while loop examples

### Reverse counting

```java
int i = 5;

while (i >= 1) {

    System.out.println(i);

    i--;

}
```

### Even numbers

```java
int i = 2;

while (i <= 20) {

    System.out.println(i);

    i += 2;

}
```

### Sum of numbers

```java
int i = 1;
int sum = 0;

while (i <= 10) {

    sum += i;

    i++;

}
```

### Multiplication table

```java
int number = 5;
int i = 1;

while (i <= 10) {

    System.out.println(number * i);

    i++;

}
```

## 5. What is a do-while loop?

A do-while loop executes its body first and checks its condition afterward.

The body always executes at least once.

### Syntax

```java
do {

    // Repeated code

} while (condition);
```

A semicolon is required after the while condition.

## 6. Basic do-while example

```java
int i = 1;

do {

    System.out.println(i);

    i++;

} while (i <= 5);
```

Output:

```text
1
2
3
4
5
```

## 7. Difference between while and do-while

| while | do-while |
|---|---|
| Condition checked first | Condition checked last |
| Entry-controlled | Exit-controlled |
| Can execute zero times | Executes at least once |
| No semicolon after condition | Semicolon after condition |

## 8. Counter-controlled loops

A counter variable determines the number of iterations.

```java
int count = 1;

while (count <= 5) {

    System.out.println(count);

    count++;

}
```

## 9. Sentinel-controlled loops

A sentinel is a special value that signals the loop to stop.

Example: Enter transaction amounts until zero is entered.

```java
int amount = -1;
int total = 0;

while (amount != 0) {

    // Read the next amount

    // Add nonzero amounts to total

}
```

## 10. Nested while loops

A nested while loop is a while loop inside another while loop.

```java
int i = 1;

while (i <= 3) {

    int j = 1;

    while (j <= 2) {

        System.out.println(i + " " + j);

        j++;

    }

    i++;

}
```

The inner loop completes all its iterations for every outer loop iteration.

## 11. Infinite loops

An infinite loop continues indefinitely unless it has a termination mechanism.

Example:

```java
while (true) {

    System.out.println("Running");

}
```

Always ensure your loop has an appropriate way to terminate.

## 12. Common mistakes

- Forgetting to update the counter.
- Using the wrong condition.
- Updating in the wrong direction.
- Creating unintended infinite loops.
- Forgetting the semicolon after a do-while condition.
- Forgetting to initialize local variables.

## 13. Real-world applications

- Repeating application menus.
- Processing transaction records.
- Accepting input until a sentinel value.
- Repeating a process until a condition changes.
- Validating user input.

## 14. What I learned

- while loop syntax and execution.
- Condition checking.
- Counter-controlled loops.
- Sentinel-controlled loops.
- do-while loop syntax.
- Difference between while and do-while.
- Nested while loops.
- Infinite loops.
- Using loops with Scanner.