package com.practice.arrays;

import java.util.Scanner;

/**
 * Created new class to find number of consecutive one from the given Binary array.
 */
public class FindConsecutiveOne {
    public static void main(String[] str) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the value of n : ");
        n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array : ");
        for(int i=0; i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        FindConsecutiveOne consecutiveOne = new FindConsecutiveOne();
        consecutiveOne.findMaxConsecutiveOnes(arr);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxi = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxi = Math.max(maxi,count);
            }else{
                count = 0;
            }
        }
        System.out.print("Number of Consecutive one : " + maxi);
        return maxi;
    }
}