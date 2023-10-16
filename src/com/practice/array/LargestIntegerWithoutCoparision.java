package com.practice.array;

public class LargestIntegerWithoutCoparision {
    public static void main(String[] args) {
        LargestIntegerWithoutCoparision largest = new LargestIntegerWithoutCoparision();
        int x = 3, y = 4;
        largest.solve(x,y);
    }

    int solve(int x,int y){
        //return x/y != 0 ? x:y; // Division method
        return (Math.abs(x-y)+(x+y)/2); // Mathematical Expression.
    }
}
