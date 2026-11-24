
package com.learning.javabasics;

public class L05_Variables {

    public static void main(String[] args) {

        // 1. String
        String customerName = "Amit";

        // 2. Integer types
       // byte smallNumber = 100;
        //short year = 2026;
        int customerAge = 25;
        long mobileNumber = 9876543210L;

        // 3. Decimal types
        float interestRate = 5.5f;
        double balance = 1500.50;

        // 4. Character
        char customerGrade = 'A';

        // 5. Boolean
        boolean paymentCompleted = false;

        // Display customer information
        System.out.println("CUSTOMER DETAILS");
        System.out.println("----------------");

        System.out.println("Name: " + customerName);
        System.out.println("Age: " + customerAge);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Grade: " + customerGrade);
        System.out.println("Payment Completed: " + paymentCompleted);

        // Update the balance
        balance = 1200.00;

        System.out.println("----------------");
        System.out.println("Updated Balance: " + balance);

    }
}
