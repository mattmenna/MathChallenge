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
        System.out.println("Enter the interger your would like to check");
        Scanner scrn = new Scanner(System.in);
        numInput = scrn.nextLine();
        System.out.println("You entered " + numInput);

        for (int i = 0; i < numInput.length(); i++) {
            System.out.println("Number at location " + i + " is " + numInput.charAt(i));
            System.out.println("_____________");
        }
        sumOfcubes op = new sumOfcubes();

        op.checkSum(154, 1, 5, 4); // 153 is true 154 is false


    }
}
