package com.practice.bitmanipulation;

public class PowerOfFour {

    public static void main(String[] args) {
        PowerOfFour four = new PowerOfFour();
        int num = 64;
        four.isPowerOfFourUsingMathSolution(num);
        four.isPowerOfFourUsingBitManipulation(num);
    }

    public boolean isPowerOfFourUsingMathSolution(int n) {
        boolean flag = false;
        flag = n > 0 && (Math.log(n) / Math.log(2))%2 == 0;
        System.out.println("Flag : " + flag);
        return flag;
    }

    public boolean isPowerOfFourUsingBitManipulation(int n) {
        boolean flag = false;
        flag = (n > 0) && ((n&(n-1)) == 0) && ((n & 0xaaaaaaaa) == 0);
        System.out.println("Flag : " + flag);
        return flag;
    }
}
