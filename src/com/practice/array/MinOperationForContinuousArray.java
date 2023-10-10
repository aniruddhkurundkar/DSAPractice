package com.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MinOperationForContinuousArray {
    public static void main(String[] args) {
        MinOperationForContinuousArray conArray = new MinOperationForContinuousArray();
        int[] arr = {1,2,3,5,6};
        conArray.solve(arr);
    }

    int solve(int[] nums){
        int n = nums.length;
        int ans = n;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i: nums){
            set.add(i);
        }
        int[] newNums = new int[set.size()];
        int index = 0;
        for(int j:set){
            newNums[index++] = j;
        }
        Arrays.sort(newNums);
        int k=0;
        for(int i=0; i<newNums.length; i++){
            while(k < newNums.length && newNums[k] < (newNums[i] + n)){
                k++;
            }

            int count = k - i;
            ans = Math.min(ans, n-count);
        }
        System.out.print("Minimum Operation : " + ans);
        return ans;
    }
}
