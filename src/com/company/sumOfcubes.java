package com.company;

/**
 * Created by Matt on 5/22/2017.
 */
public class sumOfcubes {

    /**
     *
     * @param total
     * @param a
     * @param b
     * @param c
     */

    void checkSum(int total, int a, int b, int c){
        if(total == Math.pow(a,3)+ Math.pow(b,3) + Math.pow(c,3)){
    System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    void checkString(String input){
        for (int i = 0; i < input.length(); i++) {
            input.charAt(i);
        }
    }

}