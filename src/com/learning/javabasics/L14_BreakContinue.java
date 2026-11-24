
package com.learning.javabasics;

public class L14_BreakContinue {

    public static void main(String[] args) {

        // 1. Break in for loop
        System.out.println("BREAK IN FOR LOOP");
        System.out.println("----------------");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);

        }


        // 2. Break in while loop
        System.out.println("\nBREAK IN WHILE LOOP");
        System.out.println("----------------");

        int i = 1;

        while (i <= 10) {

            if (i == 6) {
                break;
            }

            System.out.println(i);

            i++;

        }


        // 3. Break in do-while loop
        System.out.println("\nBREAK IN DO-WHILE LOOP");
        System.out.println("----------------");

        int j = 1;

        do {

            if (j == 4) {
                break;
            }

            System.out.println(j);

            j++;

        } while (j <= 10);


        // 4. Continue in for loop
        System.out.println("\nCONTINUE IN FOR LOOP");
        System.out.println("----------------");

        for (int number = 1; number <= 5; number++) {

            if (number == 3) {
                continue;
            }

            System.out.println(number);

        }


        // 5. Continue in while loop
        System.out.println("\nCONTINUE IN WHILE LOOP");
        System.out.println("----------------");

        int count = 0;

        while (count < 5) {

            count++;

            if (count == 3) {
                continue;
            }

            System.out.println(count);

        }


        // 6. Continue in do-while loop
        System.out.println("\nCONTINUE IN DO-WHILE LOOP");
        System.out.println("----------------");

        int value = 0;

        do {

            value++;

            if (value == 3) {
                continue;
            }

            System.out.println(value);

        } while (value < 5);


        // 7. Break in nested loops
        System.out.println("\nBREAK IN NESTED LOOPS");
        System.out.println("----------------");

        for (int row = 1; row <= 3; row++) {

            for (int column = 1; column <= 3; column++) {

                if (column == 2) {
                    break;
                }

                System.out.println(
                    "Row: " + row + ", Column: " + column
                );

            }

        }


        // 8. Continue in nested loops
        System.out.println("\nCONTINUE IN NESTED LOOPS");
        System.out.println("----------------");

        for (int row = 1; row <= 2; row++) {

            for (int column = 1; column <= 3; column++) {

                if (column == 2) {
                    continue;
                }

                System.out.println(
                    "Row: " + row + ", Column: " + column
                );

            }

        }


        // 9. Labeled break
        System.out.println("\nLABELED BREAK");
        System.out.println("----------------");

        outerLoop:
        for (int x = 1; x <= 3; x++) {

            for (int y = 1; y <= 3; y++) {

                if (x == 2 && y == 2) {
                    break outerLoop;
                }

                System.out.println(
                    "x = " + x + ", y = " + y
                );

            }

        }


        // 10. Labeled continue
        System.out.println("\nLABELED CONTINUE");
        System.out.println("----------------");

        outer:
        for (int x = 1; x <= 3; x++) {

            for (int y = 1; y <= 3; y++) {

                if (y == 2) {
                    continue outer;
                }

                System.out.println(
                    "x = " + x + ", y = " + y
                );

            }

        }


        // 11. Search for a customer
        System.out.println("\nCUSTOMER SEARCH");
        System.out.println("----------------");

        int searchId = 103;

        for (int customerId = 101;
             customerId <= 105;
             customerId++) {

            if (customerId == searchId) {

                System.out.println(
                    "Customer Found: " + customerId
                );

                break;
            }

        }


        // 12. Process transactions
        System.out.println("\nTRANSACTION PROCESSING");
        System.out.println("----------------");

        int totalAmount = 0;

        for (int transaction = 1;
             transaction <= 5;
             transaction++) {

            int amount = transaction * 500;

            // Skip the third transaction
            if (transaction == 3) {
                continue;
            }

            totalAmount += amount;

            System.out.println(
                "Transaction " + transaction
                + ": " + amount
            );

        }

        System.out.println("Total Amount: " + totalAmount);

    }
}
