
package com.learning.javabasics;

public class L08_Operators {

    public static void main(String[] args) {

        // 1. Arithmetic operators
        System.out.println("ARITHMETIC OPERATORS");
        System.out.println("----------------");

        int a = 20;
        int b = 6;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


        // 2. Assignment operators
        System.out.println("\nASSIGNMENT OPERATORS");
        System.out.println("----------------");

        int balance = 5000;

        balance += 1000;
        System.out.println("After Adding: " + balance);

        balance -= 1500;
        System.out.println("After Subtracting: " + balance);

        balance *= 2;
        System.out.println("After Multiplication: " + balance);

        balance /= 2;
        System.out.println("After Division: " + balance);

        balance %= 3000;
        System.out.println("After Modulus: " + balance);


        // 3. Relational operators
        System.out.println("\nRELATIONAL OPERATORS");
        System.out.println("----------------");

        int age = 25;

        System.out.println(age == 25);
        System.out.println(age != 20);
        System.out.println(age > 18);
        System.out.println(age < 30);
        System.out.println(age >= 25);
        System.out.println(age <= 25);


        // 4. Logical operators
        System.out.println("\nLOGICAL OPERATORS");
        System.out.println("----------------");

        boolean isAdmin = false;
        boolean isManager = true;

        System.out.println(isAdmin && isManager);
        System.out.println(isAdmin || isManager);
        System.out.println(!isAdmin);


        // 5. Increment and decrement
        System.out.println("\nINCREMENT AND DECREMENT");
        System.out.println("----------------");

        int count = 5;

        System.out.println("Original: " + count);
        System.out.println("Post Increment: " + count++);
        System.out.println("After Increment: " + count);
        System.out.println("Pre Increment: " + (++count));

        System.out.println("Post Decrement: " + count--);
        System.out.println("After Decrement: " + count);


        // 6. Bitwise operators
        System.out.println("\nBITWISE OPERATORS");
        System.out.println("----------------");

        int x = 5;
        int y = 3;

        System.out.println("AND: " + (x & y));
        System.out.println("OR: " + (x | y));
        System.out.println("XOR: " + (x ^ y));
        System.out.println("Complement: " + (~x));


        // 7. Shift operators
        System.out.println("\nSHIFT OPERATORS");
        System.out.println("----------------");

        int number = 8;

        System.out.println("Left Shift: " + (number << 1));
        System.out.println("Right Shift: " + (number >> 1));
        System.out.println("Unsigned Right Shift: " + (number >>> 1));


        // 8. Ternary operator
        System.out.println("\nTERNARY OPERATOR");
        System.out.println("----------------");

        double customerBalance = 500.00;

        String status = customerBalance > 0
                ? "Amount Due"
                : "No Amount Due";

        System.out.println("Customer Status: " + status);


        // 9. Operator precedence
        System.out.println("\nOPERATOR PRECEDENCE");
        System.out.println("----------------");

        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;

        System.out.println("Without Parentheses: " + result1);
        System.out.println("With Parentheses: " + result2);


        // 10. instanceof operator
        System.out.println("\nINSTANCEOF OPERATOR");
        System.out.println("----------------");

        String customerName = "Amit";

        System.out.println(customerName instanceof String);
    }
}
