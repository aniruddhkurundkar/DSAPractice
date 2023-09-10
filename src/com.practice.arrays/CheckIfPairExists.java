package com.practice.arrays;

import java.util.Scanner;

/**
 * Check if there exists a pair [i,j] such that A[i]+A[j]=k
 * Note: i!=j
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
