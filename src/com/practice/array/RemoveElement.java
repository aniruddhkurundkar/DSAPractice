package com.practice.array;

import java.util.HashMap;
import java.util.Set;

public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement remove = new RemoveElement();
        int[] arr = {0,1,2,2,3,0,4,2};
        int num = 2;
        remove.solve(arr,num);
    }

    int solve(int[] nums, int val){
        int N = nums.length;
        int j = 0;
        for(int i=0 ; i<N; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
