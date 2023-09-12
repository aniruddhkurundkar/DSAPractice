package com.practice.arrays;

import java.util.Scanner;

/**
 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 *
 * TC = BigO(n^2) and SC = BigO(n) with bruteforce approach.
 * TC = BigO(n) and SC = BigO(1) with optimised solution.
 */
public class DuplicateZeros {

    // BruteForce Approach.
    public void duplicateZeroToGivenArrayBruteForce(int[] array){
        int n=array.length;
        for(int i=0; i<array.length;i++){
            if(array[i] == 0){
                int j;
                for(j = n-2; j>=i+1; j--) {
                    array[j+1] = array[j];
                }
                array[j+1] = 0;
                i++;
            }
        }
    }

    // Optimised solution.

    /**
     * OBSERVATION:
     * 1. count all the zeros in the given array.
     * 2. find out the index of non-zero element which should be less than n i.e. n+zerosCount-1 < n
     * 3. Iterate the array in reverse order from end of the original array to beginning.
     * 4. If current element is 0 then duplicate it and decrement endIndex.
     *
     * @param array
     */
    public void duplicateZeroToGivenArrayOptimised(int[] array){
        int n = array.length;
        int zerosCount = 0;
        // Count the number of zeros in the original array
        for (int num : array) {
            if (num == 0) {
                zerosCount++;
            }
        }
        int endIndex = n + zerosCount - 1;
        // Iterate from the end of the original array to the beginning
        for (int i = n - 1; i >= 0; i--) {
            if (endIndex < n) {
                array[endIndex] = array[i];
            }
            // If the current element is 0, duplicate it and decrement endIndex
            if (array[i] == 0) {
                endIndex--;
                if (endIndex < n) {
                    array[endIndex] = 0;
                }
            }
            endIndex--;
        }
    }

    public static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        int n=0;
        System.out.print("Enter the size of an array : ");
        n = scan.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements of an array : ");
        for(int i=0; i< array.length;i++){
            array[i] =scan.nextInt();
        }
        DuplicateZeros duplicate = new DuplicateZeros();
        duplicate.duplicateZeroToGivenArrayBruteForce(array);
        duplicate.duplicateZeroToGivenArrayOptimised(array);
    }
}
