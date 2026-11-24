# Lesson 14 – break and continue in Java

## 1. What is break?

The break statement immediately terminates the nearest enclosing loop or switch statement.

Syntax:

```java
break;
```

Example:

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```

## 2. break in different loops

break can be used in:

- for loop
- while loop
- do-while loop
- switch statement

It terminates the nearest applicable loop or switch statement.

## 3. What is continue?

The continue statement skips the remaining statements in the current iteration and moves to the next iteration.

Syntax:

```java
continue;
```

Example:

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

## 4. continue in different loops

continue can be used in:

- for loop
- while loop
- do-while loop

In a while or do-while loop, make sure the loop variable is updated correctly to avoid an infinite loop.

## 5. Difference between break and continue

| break | continue |
|---|---|
| Terminates the current loop | Skips current iteration |
| Exits the loop | Continues with next iteration |
| Can be used in switch | Does not terminate a switch |
| Useful for stopping searches | Useful for skipping records |

## 6. break in nested loops

An ordinary break terminates only the nearest enclosing loop.

Example:

```java
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {

        if (j == 2) {
            break;
        }

    }

}
```

The inner loop terminates, but the outer loop continues.

## 7. continue in nested loops

An ordinary continue skips the current iteration of the nearest enclosing loop.

The outer loop continues normally.

## 8. Labeled break

A labeled break exits a specified enclosing labeled statement.

Example:

```java
outer:
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {

        if (i == 2 && j == 2) {
            break outer;
        }

    }

}
```

Both loops are terminated.

## 9. Labeled continue

A labeled continue moves to the next iteration of a specified enclosing labeled loop.

Example:

```java
outer:
for (int i = 1; i <= 3; i++) {

    for (int j = 1; j <= 3; j++) {

        if (j == 2) {
            continue outer;
        }

    }

}
```

The next outer-loop iteration begins immediately.

## 10. Real-world applications

- Stop searching after finding a customer.
- Skip invalid transaction records.
- Stop processing when a termination condition occurs.
- Skip records that do not meet requirements.
- Control nested loops.

## 11. Important points

- break exits the nearest applicable loop or switch.
- continue skips the current iteration of the nearest loop.
- Ordinary break and continue affect only the innermost applicable loop.
- Labeled break exits a specified enclosing labeled statement.
- Labeled continue advances a specified enclosing labeled loop.
- Always update loop counters correctly.
- Avoid unintended infinite loops.

## 12. What I learned

- break statement.
- continue statement.
- break in for, while and do-while loops.
- continue in for, while and do-while loops.
- Nested loops.
- Labeled break.
- Labeled continue.
- Practical transaction processing using loop control.