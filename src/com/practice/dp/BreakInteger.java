package com.practice.dp;

public class BreakInteger {

//    Integer[] cache;
//    public int integerBreak(int n){
//        cache = new Integer[n+1];
//        return solution(n);
//    }
//    public int solution(int num){
//
//        if(num < 2)
//            return 0;
//
//        if(cache[num] != null)
//            return cache[num];
//
//        int result = 0;
//        for(int i=1;i<num; i++){
//            int product = i * Math.max(solution(num-i),num-i);
//            result = Math.max(product,result);
//        }
//        cache[num] = result;
//        System.out.println("Result : " + result);
//        return result;
//    }

    Integer[] cache;

    public int integerBreak(int n) {
        cache = new Integer[n + 1];
        return solution(n);
    }

    private int solution(int n) {
        if (n < 2)
            return 0;

        if (cache[n] != null)
            return cache[n];

        int result = 0;
        for (int i = 1; i < n; i++) {
            int curMaxProduct = Math.max(solution(n - i), n - i);
            result = Math.max(curMaxProduct * i, result);
        }
        cache[n] = result;
        System.out.println("Result : " + result);
        return result;
    }

    public static void main(String[] args) {
        int n = 32;
        BreakInteger integer = new BreakInteger();
        integer.integerBreak(n);
    }
}
