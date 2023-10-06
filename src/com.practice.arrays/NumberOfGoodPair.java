package com.practice.arrays;

import java.util.*;

public class NumberOfGoodPair {

    int getCountOfGoodPair(int[] nums){
        Map<Integer, Integer> map = new HashMap();
        int count = 1;
        int goodPairsCount = 0;
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],++count);
            }else{
                map.put(nums[i],1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        for(int i =0; i<set.size(); i++){
            if(map.get(nums[i])>1){
                goodPairsCount = goodPairsCount + map.get(nums[i]);
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
