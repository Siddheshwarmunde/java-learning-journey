
package com.learning.javabasics;

public class L12_ForLoop {

    public static void main(String[] args) {

        // 1. Print numbers from 1 to 10
        System.out.println("NUMBERS FROM 1 TO 10");
        System.out.println("----------------");

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

        }


        // 2. Print numbers backwards
        System.out.println("\nREVERSE COUNTING");
        System.out.println("----------------");

        for (int i = 10; i >= 1; i--) {

            System.out.println(i);

        }


        // 3. Print even numbers
        System.out.println("\nEVEN NUMBERS");
        System.out.println("----------------");

        for (int i = 2; i <= 20; i += 2) {

            System.out.println(i);

        }


        // 4. Sum of numbers
        System.out.println("\nSUM OF NUMBERS");
        System.out.println("----------------");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum += i;

        }

        System.out.println("Total: " + sum);


        // 5. Multiplication table
        System.out.println("\nMULTIPLICATION TABLE");
        System.out.println("----------------");

        int number = 5;

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));

        }


        // 6. Factorial
        System.out.println("\nFACTORIAL");
        System.out.println("----------------");

        int factorialNumber = 5;
        long factorial = 1;

        for (int i = 1; i <= factorialNumber; i++) {

            factorial *= i;

        }

        System.out.println("Factorial: " + factorial);


        // 7. Nested loops
        System.out.println("\nSTAR PATTERN");
        System.out.println("----------------");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }


        // 8. Multiple variables
        System.out.println("\nMULTIPLE VARIABLES");
        System.out.println("----------------");

        for (int i = 1, j = 5; i <= 5; i++, j--) {

            System.out.println("i = " + i + ", j = " + j);

        }


        // 9. Digital Khata transaction summary
        System.out.println("\nDIGITAL KHATA TRANSACTIONS");
        System.out.println("----------------");

        double transactionAmount = 500.00;
        double totalAmount = 0;

        for (int transaction = 1; transaction <= 5; transaction++) {

            totalAmount += transactionAmount;

            System.out.println(
                "Transaction " + transaction + ": " + transactionAmount
            );

        }

        System.out.println("Total Amount: " + totalAmount);

    }
}
