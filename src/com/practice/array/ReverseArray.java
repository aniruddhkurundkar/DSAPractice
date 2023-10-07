package com.practice.array;

/**
 * Given an array of N size, reverse an entire array.
 * input: int[] array = {-1,4,7,6,-2,7,8,10}
 */

import java.util.Scanner;

/**
 * OBSERVATION:
 * 1. Existing array should reverse. No need to create new array to store reversed array.
 * 2. This can be solved using while loos and swap function.
 * 3. stop loop through the array element when i == j
 * 4. In both way iteration could be n/2 where n is size of array.
 *
 * TC = BigO(n) and SC=BigO(1)
 */
public class ReverseArray {
    public static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter the size of an array : ");
        size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the element of array : ");
        for(int i=0; i<size;i++) {
            array[i] = scan.nextInt();
        }
        ReverseArray reverse = new ReverseArray();
        reverse.reverseUsingBrutForceApproach(array);
        reverse.reverseUsingOptimisedSolution(array);
    }

    // BruteForceApproach has two for loop with Swapping the elements.
    public int[] reverseUsingBrutForceApproach(int[] A){
        int temp = 0;
        int n=A.length-1;
        int j=n;
        for(int i=0; i<A.length;i++){
            for(;j>n/2;){
                if(A[i]>A[j]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                    j--;
                }
                break;
            }
        }
        return A;
    }

    //Optimised approach has only one while loop with swapping the elements.
    public int[] reverseUsingOptimisedSolution(int[] A){
        int i=0;
        int j=A.length-1;
        int temp = 0;
        while(i<j){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }
}
