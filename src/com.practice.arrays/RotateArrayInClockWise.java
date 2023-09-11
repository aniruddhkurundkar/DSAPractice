package com.practice.arrays;

/**
 * Given an array of N element, rotate it in clockwise direction by k times.
 * for example:
 * Input : int[] array = {3,-2,1,4,6,9,8} and k = 4
 * Output: array = {4,6,9,8,3,-2,1}
 */

import java.util.Scanner;

/**
 * OBSERVATION:
 * We can get the rotated array by using reverse array. They are same but only the order differs.
 * 1. Reverse the entire array. Iteration could n/2 times.
 * 2. Reverse first k elements of an array with iteration k/2 times.
 * 3. Reverse last n-k elements of an array with (n-k)/2 iteration.
 *
 * TC = BigO(n) and SC = BigO(1)
 */
public class RotateArrayInClockWise {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the size of an array : ");
        n = scan.nextInt();
        int[] A = new int[n];
        System.out.print("Enter the elements of an array : ");
        for(int i=0;i<n;i++){
            A[i]=scan.nextInt();
        }
        int k=0;
        System.out.print("Enter the value of K : ");
        k = scan.nextInt();
        RotateArrayInClockWise rotate = new RotateArrayInClockWise();
        // BruteForceApproach
//        rotate.reverseEntireArray(A,n);
//        rotate.reverseFirstKElements(A,k);
//        rotate.reverseLastElements(A,k,n-1);
        //Optimised Solution
        rotate.rotationGame(A,0,n-1);
        rotate.rotationGame(A,0,k-1);
        rotate.rotationGame(A,k,n-1);
    }

    public int[] reverseEntireArray(int[] A, int n){
        int p=0;
        int q=n-1;
        int temp = 0;
        while(p<q){
            temp = A[p];
            A[p] = A[q];
            A[q] = temp;
            p++;
            q--;
        }
        return A;
    }
    public int[] reverseFirstKElements(int[] A, int k){
        int p=0;
        int q=k-1;
        int temp = 0;
        while(p<q){
            temp = A[p];
            A[p] = A[q];
            A[q] = temp;
            p++;
            q--;
        }
        return A;
    }
    public int[] reverseLastElements(int[] A,int k, int m){
        int p=k;
        int q=m;
        int temp = 0;
        while(p<q){
            temp = A[p];
            A[p] = A[q];
            A[q] = temp;
            p++;
            q--;
        }
        return A;
    }

    public int[] rotationGame(int [] A, int start, int end){
        int i,j;
        int temp = 0;
        for(i=start,j=end;i<j;i++,j--){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
