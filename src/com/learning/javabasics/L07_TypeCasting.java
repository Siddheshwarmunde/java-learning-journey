
package com.learning.javabasics;

public class L07_TypeCasting {

    public static void main(String[] args) {

        // 1. Widening casting
        System.out.println("WIDENING CASTING");
        System.out.println("----------------");

        int number = 100;

        double decimalNumber = number;

        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimalNumber);


        // 2. Narrowing casting
        System.out.println("\nNARROWING CASTING");
        System.out.println("----------------");

        double price = 99.99;

        int wholePrice = (int) price;

        System.out.println("Original Price: " + price);
        System.out.println("Converted Price: " + wholePrice);


        // 3. Byte overflow during narrowing
        System.out.println("\nBYTE CONVERSION");
        System.out.println("----------------");

        int largeNumber = 130;

        byte smallNumber = (byte) largeNumber;

        System.out.println("Original Number: " + largeNumber);
        System.out.println("Converted Number: " + smallNumber);


        // 4. Character conversion
        System.out.println("\nCHARACTER CONVERSION");
        System.out.println("----------------");

        char letter = 'A';

        int characterCode = letter;

        System.out.println("Character: " + letter);
        System.out.println("Character Code: " + characterCode);


        // 5. Integer to character
        int code = 66;

        char convertedCharacter = (char) code;

        System.out.println("Converted Character: " + convertedCharacter);


        // 6. Type promotion
        System.out.println("\nTYPE PROMOTION");
        System.out.println("----------------");

        byte first = 10;
        byte second = 20;

        int sum = first + second;

        System.out.println("Sum: " + sum);


        // 7. String to number
        System.out.println("\nSTRING CONVERSION");
        System.out.println("----------------");

        String amountText = "1500.50";

        double amount = Double.parseDouble(amountText);

        System.out.println("Amount: " + amount);


        // 8. Number to String
        int age = 25;

        String ageText = String.valueOf(age);

        System.out.println("Age as String: " + ageText);

    }
}
