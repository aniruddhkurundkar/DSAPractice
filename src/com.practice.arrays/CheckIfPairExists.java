package com.practice.arrays;

import java.util.Scanner;

/**
 * Check if there exists a pair [i,j] such that A[i]+A[j]=k
 * Note: i!=j
 */

/**
 * OBSERVATION:
 *
 * Make all the pairs and chek if it can exists in the given array.
 * For ex: A[1,2,3,4,5] so total number of pairs can be 25 as shown below.
 * 00 01 02 03 04
 * 10 11 12 13 14
 * 20 21 22 23 24
 * 30 31 32 33 34
 * 40 41 42 43 44
 *
 * Having two for loops to crate pair so TC= BigO(n^2) and SC = BigO(1)
 */
public class CheckIfPairExists {

    public boolean findIfPairExists(int[] arr,int K){
        boolean pairExists = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == K){
                    pairExists = true;
                }
            }
        }
    return pairExists;
    }
    public static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        int size = 0;
        System.out.println("Enter the size of an array : " );
        size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element." );
        for(int i =0; i<size; i++){
            array[i]=scan.nextInt();
        }
        int K=0;
        System.out.println("Enter the value for K : ");
        K = scan.nextInt();
        CheckIfPairExists pairExists = new CheckIfPairExists();
        pairExists.findIfPairExists(array,K);
    }
}
