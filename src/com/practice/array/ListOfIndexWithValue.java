package com.practice.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListOfIndexWithValue {
    public static void main(String[] args) {
        ListOfIndexWithValue indexValue = new ListOfIndexWithValue();
        int[] arr = {1,2,3,4,5,3,1};
        indexValue.solve(arr);
    }

    HashMap<Integer, List<Integer>> solve(int[] nums){
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i< nums.length; i++){
            if(!map.containsKey(nums[i])){
               map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        return map;
    }
}
