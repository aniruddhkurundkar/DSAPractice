package com.practice.array;

import java.util.*;

public class ConstrainedSubsequenceSum {
    public static void main(String[] args) {
        ConstrainedSubsequenceSum subSequenceSum = new ConstrainedSubsequenceSum();
        int[] nums = {10,2,-10,5,20};
        int k = 2;
        subSequenceSum.constrainedSubsetSum(nums,k);
        subSequenceSum.bottumUpApproach(nums,k);
        subSequenceSum.maxHeapApproach(nums,k);
    }

    public int constrainedSubsetSum(int[] nums, int k) {
        int value =  solve(-1,0,nums,k);
        if(value == 0){
            int max = Arrays.stream(nums).max().getAsInt();
            int min = Arrays.stream(nums).min().getAsInt();
            value = Math.max(min, max);
        }
        System.out.println("Value : " + value);
        return value;
    }
    public int solve(int prevIndex,int currIndex,int[] nums, int k){
        int result = 0;
        int n = nums.length;
        if(currIndex >= n)
            return 0;

        if(prevIndex == -1 || currIndex - prevIndex <= k){
            int take = nums[currIndex] + solve(currIndex, currIndex+1, nums,k);
            int not_take = solve(prevIndex, currIndex+1, nums,k);
            result = Math.max(take,not_take);
        }
        return result;
    }


    int bottumUpApproach(int[] nums,int k){

        int n = nums.length;
        int[] arr = new int[n];
        int result = arr[0];
        for(int i =1; i<n; i++){
            for(int j=i-1; j>=0 && i-j <=k; j--){
                arr[i] = Math.max(arr[i], nums[i]+arr[j]);
                result = Math.max(result,arr[i]);
            }
        }
        return result;
    }

    int maxHeapApproach(int[] nums,int k){
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = nums[i];
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
            return b[0] - a[0];
        });
        heap.add(new int[]{arr[0],0});

        int result = arr[0];
        for(int i =1; i<n; i++){
            while(!heap.isEmpty() && i-heap.peek()[1]>k){
                heap.remove();
            }
            arr[i] = Math.max(arr[i],nums[i]+heap.peek()[0]);
            heap.add(new int[]{arr[i],i});
            result = Math.max(result,arr[i]);
        }
        System.out.println("Result : " + result);
        return result;
    }
}
