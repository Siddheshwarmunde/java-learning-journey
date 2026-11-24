
package com.learning.javabasics;

public class L11_Switch {

    public static void main(String[] args) {

        // 1. Traditional switch
        System.out.println("TRADITIONAL SWITCH");
        System.out.println("----------------");

        int choice = 2;

        switch (choice) {

            case 1:
                System.out.println("Add Customer");
                break;

            case 2:
                System.out.println("View Customers");
                break;

            case 3:
                System.out.println("Add Transaction");
                break;

            case 4:
                System.out.println("View Balance");
                break;

            default:
                System.out.println("Invalid Choice");

        }


        // 2. Multiple case labels
        System.out.println("\nMULTIPLE CASE LABELS");
        System.out.println("----------------");

        int day = 3;

        switch (day) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working Day");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid Day");

        }


        // 3. String switch
        System.out.println("\nSTRING SWITCH");
        System.out.println("----------------");

        String paymentStatus = "PAID";

        switch (paymentStatus) {

            case "PAID":
                System.out.println("Payment Completed");
                break;

            case "PENDING":
                System.out.println("Payment Pending");
                break;

            case "FAILED":
                System.out.println("Payment Failed");
                break;

            default:
                System.out.println("Unknown Status");

        }


        // 4. Modern switch syntax
        System.out.println("\nMODERN SWITCH");
        System.out.println("----------------");

        int menuChoice = 3;

        switch (menuChoice) {

            case 1 -> System.out.println("Add Customer");

            case 2 -> System.out.println("View Customers");

            case 3 -> System.out.println("Add Transaction");

            case 4 -> System.out.println("View Balance");

            default -> System.out.println("Invalid Choice");

        }


        // 5. Switch expression
        System.out.println("\nSWITCH EXPRESSION");
        System.out.println("----------------");

        int month = 11;

        String monthName = switch (month) {

            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";

            default -> "Invalid Month";

        };

        System.out.println(monthName);


        // 6. Switch expression with yield
        System.out.println("\nSWITCH WITH YIELD");
        System.out.println("----------------");

        int action = 1;

        String message = switch (action) {

            case 1 -> {

                System.out.println("Customer Management");

                yield "Add New Customer";

            }

            case 2 -> {

                System.out.println("Transaction Management");

                yield "Add New Transaction";

            }

            default -> "Invalid Action";

        };

        System.out.println(message);


        // 7. Digital Khata application status
        System.out.println("\nDIGITAL KHATA PAYMENT");
        System.out.println("----------------");

        String status = "PENDING";

        String description = switch (status) {

            case "PAID" -> "All payments completed";

            case "PENDING" -> "Customer has outstanding balance";

            case "FAILED" -> "Payment was unsuccessful";

            default -> "Unknown payment status";

        };

        System.out.println("Status: " + status);
        System.out.println("Description: " + description);

    }
}
