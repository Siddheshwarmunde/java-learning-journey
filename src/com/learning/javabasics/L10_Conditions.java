
package com.learning.javabasics;

public class L10_Conditions {

    public static void main(String[] args) {

        // 1. Simple if statement
        System.out.println("SIMPLE IF");
        System.out.println("----------------");

        int age = 25;

        if (age >= 18) {

            System.out.println("Customer is an adult.");

        }


        // 2. if-else statement
        System.out.println("\nIF-ELSE");

        double balance = 3000;

        if (balance > 0) {

            System.out.println("Payment Pending");

        } else {

            System.out.println("Payment Completed");

        }


        // 3. else-if ladder
        System.out.println("\nELSE-IF LADDER");

        int marks = 85;

        if (marks >= 90) {

            System.out.println("Grade A");

        } else if (marks >= 75) {

            System.out.println("Grade B");

        } else if (marks >= 60) {

            System.out.println("Grade C");

        } else if (marks >= 40) {

            System.out.println("Grade D");

        } else {

            System.out.println("Fail");

        }


        // 4. Nested if
        System.out.println("\nNESTED IF");

        boolean accountActive = true;
        double accountBalance = 10000;
        double withdrawalAmount = 3000;

        if (accountActive) {

            if (accountBalance >= withdrawalAmount) {

                System.out.println("Withdrawal successful");

            } else {

                System.out.println("Insufficient balance");

            }

        } else {

            System.out.println("Account inactive");

        }


        // 5. Logical AND
        System.out.println("\nLOGICAL AND");

        boolean hasId = true;
        int customerAge = 25;

        if (customerAge >= 18 && hasId) {

            System.out.println("Access granted");

        } else {

            System.out.println("Access denied");

        }


        // 6. Logical OR
        System.out.println("\nLOGICAL OR");

        boolean isAdmin = false;
        boolean isManager = true;

        if (isAdmin || isManager) {

            System.out.println("Management access");

        } else {

            System.out.println("Access denied");

        }


        // 7. Logical NOT
        System.out.println("\nLOGICAL NOT");

        boolean paymentCompleted = false;

        if (!paymentCompleted) {

            System.out.println("Payment is pending");

        }


        // 8. Even or odd
        System.out.println("\nEVEN OR ODD");

        int number = 15;

        if (number % 2 == 0) {

            System.out.println("Even number");

        } else {

            System.out.println("Odd number");

        }


        // 9. String comparison
        System.out.println("\nSTRING COMPARISON");

        String username = "admin";

        if ("admin".equalsIgnoreCase(username)) {

            System.out.println("Welcome Admin");

        } else {

            System.out.println("Access denied");

        }


        // 10. Digital Khata payment status
        System.out.println("\nDIGITAL KHATA PAYMENT");

        String customerName = "Amit";
        double totalAmount = 5000;
        double amountPaid = 2000;

        double outstandingBalance = totalAmount - amountPaid;

        System.out.println("Customer: " + customerName);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Outstanding: " + outstandingBalance);

        if (outstandingBalance > 0) {

            System.out.println("Status: Payment Pending");

        } else if (outstandingBalance == 0) {

            System.out.println("Status: Payment Completed");

        } else {

            System.out.println("Status: Extra Amount Paid");

        }

    }
}
