
package com.learning.javabasics;

import java.util.Scanner;

public class L09_Scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Customer information
        System.out.println("DIGITAL KHATA");
        System.out.println("====================");

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter mobile number: ");
        String mobileNumber = sc.nextLine();

        System.out.print("Enter customer age: ");
        int age = sc.nextInt();

        // Account information
        System.out.print("Enter total amount: ");
        double totalAmount = sc.nextDouble();

        System.out.print("Enter amount paid: ");
        double amountPaid = sc.nextDouble();

        System.out.print("Is payment completed? (true/false): ");
        boolean paymentCompleted = sc.nextBoolean();

        // Calculate outstanding amount
        double outstandingBalance = totalAmount - amountPaid;

        // Display customer information
        System.out.println("\nCUSTOMER DETAILS");
        System.out.println("====================");

        System.out.println("Name: " + customerName);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Age: " + age);

        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Outstanding Balance: " + outstandingBalance);

        System.out.println("Payment Completed: " + paymentCompleted);

        sc.close();
    }
}
