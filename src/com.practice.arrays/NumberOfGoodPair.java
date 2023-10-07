package com.practice.arrays;

import java.util.*;

public class NumberOfGoodPair {

    int getCountOfGoodPair(int[] nums){
        int goodPairsCount =0;
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(i<j && nums[i] == nums[j]){
                    goodPairsCount += 1;
                }
            }
        }

        return goodPairsCount;
    }
    public static void main(String[] args) {
        NumberOfGoodPair goodPair = new NumberOfGoodPair();
        int[] arr = {1,1,1,1};
        goodPair.getCountOfGoodPair(arr);
    }
}
