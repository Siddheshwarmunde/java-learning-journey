# Lesson 11 – Switch Statements in Java

## 1. What is a switch statement?

A switch statement is a decision-making statement used to select one block of code from multiple possible choices.

It is useful for fixed options such as application menus and payment statuses.

## 2. Traditional switch syntax

```java
switch (expression) {

    case value1:
        // Code
        break;

    case value2:
        // Code
        break;

    default:
        // Default code

}
```

## 3. Important keywords

| Keyword | Purpose |
|---|---|
| switch | Starts selection |
| case | Defines a matching value |
| break | Exits the switch |
| default | Handles unmatched values |

## 4. Break

The break statement terminates the nearest enclosing switch or loop.

It prevents execution from continuing into subsequent traditional case sections.

## 5. Fall-through

If a traditional switch case has no terminating statement, execution can continue into following cases.

This behaviour is called fall-through.

It can be intentional when multiple case labels share the same block.

## 6. Default

The default label executes when no other case matches.

It is optional, but useful for handling unexpected values.

## 7. Multiple case labels

Multiple values can share one block.

```java
switch (day) {

    case 1:
    case 2:
    case 3:
        System.out.println("Working Day");
        break;

}
```

## 8. Supported switch types

Traditional Java switch supports:

- byte
- short
- char
- int
- Their corresponding wrapper types
- String
- Enum types

It does not support long, float, double or boolean selectors.

## 9. String switch

String values can be used in switch statements.

String matching is case-sensitive.

```java
switch (status) {

    case "PAID":
        System.out.println("Completed");
        break;

    case "PENDING":
        System.out.println("Pending");
        break;

    default:
        System.out.println("Unknown");

}
```

## 10. Modern switch syntax

Modern Java supports arrow labels.

```java
switch (choice) {

    case 1 -> System.out.println("Add Customer");

    case 2 -> System.out.println("View Customer");

    default -> System.out.println("Invalid Choice");

}
```

Arrow labels do not fall through.

Multiple labels can be grouped:

```java
case 1, 2, 3 -> System.out.println("Selected");
```

## 11. Switch expressions

Switch expressions return a value.

```java
String result = switch (day) {

    case 1 -> "Monday";
    case 2 -> "Tuesday";

    default -> "Invalid Day";

};
```

Switch expressions were finalised in Java 14.

They are supported in JDK 21.

## 12. Yield keyword

yield returns a value from a block inside a switch expression.

```java
String result = switch (choice) {

    case 1 -> {
        System.out.println("Customer Section");
        yield "Add Customer";
    }

    default -> "Invalid Choice";

};
```

## 13. if-else versus switch

- if-else is useful for ranges and complex boolean conditions.
- switch is useful for fixed values and menu choices.
- Modern switch expressions can return values.

## 14. Important points

- Use break in traditional switch cases to prevent unwanted fall-through.
- default is optional but recommended for unexpected values.
- String matching in switch is case-sensitive.
- Arrow-style cases do not fall through.
- Switch expressions must provide a value for every possible path.
- Use yield to return a value from a block in a switch expression.

## 15. What I learned

- Traditional switch statement.
- case, break and default.
- Fall-through behaviour.
- Multiple case labels.
- String switch.
- Modern arrow syntax.
- Switch expressions.
- yield keyword.
- Choosing between if-else and switch.