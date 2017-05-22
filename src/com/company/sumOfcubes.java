package com.company;

/**
 * Created by Matt on 5/22/2017.
 */
public class sumOfcubes {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int total = 0;

    void checkSum(int total, int a, int b, int c){
        if(total == Math.pow(a,3)+ Math.pow(b,3) + Math.pow(c,3)){
    System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }


}