package com.company;

/**
 * Created by Matt on 5/22/2017.
 */
public class sumOfcubes {


int checkSum(int[] inputNumberArray){
    int total= 0;
    for(int i = 0; i < inputNumberArray.length; i++){
        total += Math.pow(inputNumberArray[i],3);
        System.out.println("Total is " + total);
    }
    System.out.println("Final Total is " + total);
    return total;
    }


}