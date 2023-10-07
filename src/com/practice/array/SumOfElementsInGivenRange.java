package com.practice.array;

import java.util.Scanner;

/**
 *  Given N array elements and Q queries for each array,
 *  Calculate the sum of element in the given range from L to R.(left to right)
 *   L <= R
 *
 */
public class SumOfElementsInGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt(); //Total number of Queries initialised.
        int L = scan.nextInt();
        int R = scan.nextInt();
        int[] array = {-3,2,6,4,5,2,8,-9,3,1};
        SumOfElementsInGivenRange range = new SumOfElementsInGivenRange();
        if(L <= R) {
           // range.solve(array, Q, L, R);
            range.optimisedSolution(array, Q, L, R);
        }
    }

    /**
     * Bruteforce approach
     * Iterations = N-1
     * TC = BigO(Q*N) and SC = BigO(1)
     * @param arr
     * @param Q
     * @param L
     * @param R
     * @return
     */
    int solve(int[] arr, int Q, int L, int R){
        int sum = 0;
        for(int i=0;i<Q;i++){
            for(int j=L;j<=R;j++ ){
                sum = sum+arr[j];
            }
        }
        System.out.println("Sum of the given range : " + sum);
        return sum;
    }

    /**
     * Optimised solution using prefix array.
     * Iterations = N-1
     * TC = BigO(N) and SC = BigO(N)
     */


    int optimisedSolution(int[] arr, int Q, int L, int R){
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pf[i] = pf[i-1] + arr[i];
        }
        int ans = 0;
        for(int j=1; j<=Q;j++){
            if(L == 0){
                ans = pf[R];
            }else{
                ans = pf[R] - pf[L-1];
            }
        }
        System.out.println("Sum of the given range : " + ans);
        return ans;
    }
}
