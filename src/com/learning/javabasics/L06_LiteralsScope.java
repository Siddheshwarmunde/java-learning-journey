
package com.learning.javabasics;

public class L06_LiteralsScope {

    // Class-level constant
    static final String APP_NAME = "Digital Khata";

    // Static variable shared by all objects
    static int totalCustomers = 0;

    // Instance variables
    String customerName;
    double balance;

    // Constructor
    L06_LiteralsScope(String name, double openingBalance) {

        customerName = name;
        balance = openingBalance;

        totalCustomers++;
    }

    public static void main(String[] args) {

        // 1. Integer literals
        int decimal = 25;
        int binary = 0b11001;
        int octal = 031;
        int hexadecimal = 0x19;

        // 2. Numeric literals
        long transactionId = 9_876_543_210L;
        float interestRate = 5.5f;
        double amount = 1500.50;

        // 3. Character and String literals
        char grade = 'A';
        String message = "Payment\nReceived";

        // 4. Boolean and null literals
        boolean paymentCompleted = false;
        String optionalNote = null;

        // 5. Local constant
        final double DAILY_LIMIT = 10000.00;

        System.out.println("DIGITAL KHATA");
        System.out.println("----------------");

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Amount: " + amount);

        System.out.println("Grade: " + grade);
        System.out.println(message);
        System.out.println("Payment Completed: " + paymentCompleted);
        System.out.println("Optional Note: " + optionalNote);

        System.out.println("Daily Limit: " + DAILY_LIMIT);

        // 6. Block scope
        if (amount > 1000) {

            int discount = 100;

            System.out.println("Discount: " + discount);
        }

        // 7. Creating objects
        L06_LiteralsScope customer1 =
                new L06_LiteralsScope("Amit", 1500.50);

        L06_LiteralsScope customer2 =
                new L06_LiteralsScope("Rahul", 2500.00);

        System.out.println("----------------");
        System.out.println("Application: " + APP_NAME);

        System.out.println("Customer 1: " + customer1.customerName);
        System.out.println("Balance 1: " + customer1.balance);

        System.out.println("Customer 2: " + customer2.customerName);
        System.out.println("Balance 2: " + customer2.balance);

        System.out.println("Total Customers: " + totalCustomers);
    }
}
