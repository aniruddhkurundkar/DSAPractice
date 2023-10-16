package com.practice.array;

public class SmallestIntegerWithoutComparision {
    public static void main(String[] args) {
        SmallestIntegerWithoutComparision smallest = new SmallestIntegerWithoutComparision();

        int x=3,y=5;
        smallest.solve(x,y);
    }

    int solve(int x, int y){
        int c = 0;
        while(x != 0 && y != 0){
            x--;
            y--;
            c++;
        }
        return c;
    }
}
