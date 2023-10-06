package com.practice.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int count=1;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                count = count+1;
                map.put(nums[i],count);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i< nums.length; i++){
            if(map.get(nums[i]) == 1){
              sum = sum+nums[i];
            }
        }

        return sum;
    }
   public static void main(String[] args) {
        int[] arr = {10,4,10,9,5};
       SumOfUniqueElements sum = new SumOfUniqueElements();
       sum.sumOfUnique(arr);
    }
}
