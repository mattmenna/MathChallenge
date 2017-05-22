package com.company;

import java.util.Scanner;

public class Main {

    /*

    For the input integer number, find if the sum of the cubes of the number's digits is equal to the number itself

    Input: Program will read an integer number from the user.
    Output: Your program should print out True or False based on the result.

    Things to include
    Proper validation on the user's input
    Write the task in a seperate method
    Provide adequate comments
    Provide adequate user prompts.

     */

    public static void main(String[] args) {

        //System.out.println(scrn.nextLine());
        String numInput = "";

        System.out.println("Math Challenge Deliverable part 1");
        System.out.println("Enter the interger your would like to check"); //Boilerplate Text

        Scanner scrn = new Scanner(System.in); // Sets up to read from terminal
        numInput = scrn.nextLine();


        System.out.println("You entered " + numInput); // Verifies results - can add a yes no dialog later

        // breaks up number into digits and lets user verify
        for (int i = 0; i < numInput.length(); i++) {
            System.out.println("Number at location " + i + " is " + numInput.charAt(i));
            System.out.println("_____________");
        }

        sumOfcubes op = new sumOfcubes();

        int firstDigit = Character.getNumericValue(numInput.charAt(0));
        int secondDigit = Character.getNumericValue(numInput.charAt(1));
        int thirdDigit = Character.getNumericValue(numInput.charAt(2));

        System.out.println("What was your number again?");
        int sumOfdigits = scrn.nextInt();

        System.out.println("First Digit is " + firstDigit);
        System.out.println("Second Digit is " + secondDigit);
        System.out.println("Third Digit is " + thirdDigit);

        System.out.println("Total is "+ sumOfdigits);

        System.out.println("Test CheckSum with integer");
        op.checkSum(sumOfdigits, firstDigit, secondDigit, thirdDigit); // 153 is true 154 is false


    }
}
