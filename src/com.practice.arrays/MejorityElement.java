package com.practice.arrays;

import java.util.*;

public class MejorityElement {

    public List<Integer> majorityElement(int[] nums) {
        int count = 1;
        boolean uniqueArr = true;
        Set<Integer> repeatedElementSet = new HashSet();
        Map<Integer, Integer> map = new HashMap<>();
        if(nums.length > 1) {
            int threshold = 0;
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    count = map.get(nums[i]) + 1;
                    map.put(nums[i], count);
                    uniqueArr = false;
                } else {
                    map.put(nums[i], 1);
                }
            }
            for (int j = 0; j < nums.length; j++) {
                threshold = nums.length/3;
                if (map.get(nums[j]) > threshold) {
                    repeatedElementSet.add(nums[j]);
                }else if(uniqueArr){
                    repeatedElementSet.add(nums[j]);
                }
            }
        }else{
           for(int k=0; k<nums.length;k++){
               repeatedElementSet.add(nums[k]);
           }
        }
        return new ArrayList(repeatedElementSet);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,1,1,1,1,2,2,1,1};
        MejorityElement element = new MejorityElement();
        element.majorityElement(arr);
    }
}
