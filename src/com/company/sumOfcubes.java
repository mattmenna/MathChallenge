package com.company;

/**
 * Created by Matt on 5/22/2017.
 */
public class sumOfcubes {


int checkSum(int[] inputNumberArray){
    int total= 0;
    for(int i = 0; i < inputNumberArray.length; i++){
        total += Math.pow(inputNumberArray[i],3);
        //System.out.println("Total is " + total);
    }
    //System.out.println("Final Total is " + total);
    return total;
    }

int[] split(String numInput){
    int intInput = Integer.parseInt(numInput); //turns numInput into a int
    int[] arrayInput;

    arrayInput = new int[numInput.length()];
    System.out.println("You entered " + numInput); // Verifies results - can add a yes no dialog later

    // breaks up number into digits and lets user verify
    for (int i = 0; i < numInput.length(); i++) {
        //System.out.println("Number at location " + i + " is " + numInput.charAt(i));
        //System.out.println("_____________");
        arrayInput[i]=intInput % 10;
        //System.out.println("Number at array location " + i + " is " + arrayInput[i]);
        //System.out.println("_____________");
        intInput = intInput / 10;
    }
    return arrayInput;
}
}