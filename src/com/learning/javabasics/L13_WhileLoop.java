
package com.learning.javabasics;

import java.util.Scanner;

public class L13_WhileLoop {

    public static void main(String[] args) {

        // 1. Basic while loop
        System.out.println("WHILE LOOP");
        System.out.println("----------------");

        int i = 1;

        while (i <= 5) {

            System.out.println(i);

            i++;

        }


        // 2. Reverse counting
        System.out.println("\nREVERSE COUNTING");
        System.out.println("----------------");

        int number = 5;

        while (number >= 1) {

            System.out.println(number);

            number--;

        }


        // 3. Even numbers
        System.out.println("\nEVEN NUMBERS");
        System.out.println("----------------");

        int even = 2;

        while (even <= 20) {

            System.out.println(even);

            even += 2;

        }


        // 4. Sum of numbers
        System.out.println("\nSUM OF NUMBERS");
        System.out.println("----------------");

        int count = 1;
        int sum = 0;

        while (count <= 10) {

            sum += count;

            count++;

        }

        System.out.println("Total: " + sum);


        // 5. Multiplication table
        System.out.println("\nMULTIPLICATION TABLE");
        System.out.println("----------------");

        int tableNumber = 5;
        int multiplier = 1;

        while (multiplier <= 10) {

            System.out.println(
                tableNumber + " x " + multiplier
                + " = " + (tableNumber * multiplier)
            );

            multiplier++;

        }


        // 6. Basic do-while loop
        System.out.println("\nDO-WHILE LOOP");
        System.out.println("----------------");

        int j = 1;

        do {

            System.out.println(j);

            j++;

        } while (j <= 5);


        // 7. do-while with initially false condition
        System.out.println("\nDO-WHILE EXECUTION");
        System.out.println("----------------");

        int value = 10;

        do {

            System.out.println("Executed once: " + value);

            value++;

        } while (value <= 5);


        // 8. Nested while loops
        System.out.println("\nNESTED WHILE LOOP");
        System.out.println("----------------");

        int row = 1;

        while (row <= 3) {

            int column = 1;

            while (column <= 3) {

                System.out.print("* ");

                column++;

            }

            System.out.println();

            row++;

        }


        // 9. Sentinel-controlled loop
        System.out.println("\nTRANSACTION TOTAL");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        int amount;
        int total = 0;

        System.out.println("Enter transaction amounts.");
        System.out.println("Enter 0 to finish.");

        System.out.print("Amount: ");
        amount = sc.nextInt();

        while (amount != 0) {

            total += amount;

            System.out.print("Amount: ");
            amount = sc.nextInt();

        }

        System.out.println("Total Transactions Amount: " + total);


        // 10. do-while menu
        System.out.println("\nDIGITAL KHATA MENU");
        System.out.println("----------------");

        int choice;

        do {

            System.out.println("\n1. Add Customer");
            System.out.println("2. View Balance");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Add Customer Selected");

            } else if (choice == 2) {

                System.out.println("View Balance Selected");

            } else if (choice == 3) {

                System.out.println("Exiting Application");

            } else {

                System.out.println("Invalid Choice");

            }

        } while (choice != 3);

        sc.close();

    }
}
