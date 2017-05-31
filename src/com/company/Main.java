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

        String numInput;

        System.out.println("Math Challenge Deliverable part 1");
        System.out.println("Enter the integer your would like to check"); //Boilerplate Text

        Scanner scrn = new Scanner(System.in); // Sets up to read from terminal
        numInput = scrn.nextLine(); //numInput is a string

        int intInput = Integer.parseInt(numInput); //turns numInput into a int

        sumOfcubes op = new sumOfcubes();

        int[] arrayInput;
        arrayInput = op.split(numInput);
        op.checkSum(arrayInput);

        System.out.println("Testing CheckSum with integer");
        if (intInput == op.checkSum(arrayInput)) {// 153 is true 154 is false
            System.out.println("The integer is a perfect cube");
        }
        else { System.out.println("The integer is not a perfect cube");
        }
    }
}
