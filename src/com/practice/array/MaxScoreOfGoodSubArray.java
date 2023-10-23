package com.practice.array;

public class MaxScoreOfGoodSubArray {
    public static void main(String[] args) {
        MaxScoreOfGoodSubArray subArray = new MaxScoreOfGoodSubArray();
        int[] nums = {1,4,3,7,4,5};
        int k = 3;
        subArray.maximumScore(nums, k);
    }

    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int i = k;
        int j = k;
        int currMin = nums[k];
        int result = nums[k];
        while(i > 0 || j<n-1){
            int leftValue = i>0 ? nums[i-1] : 0;
            int rightValue = j<n-1 ? nums[j+1] : 0;
            if(leftValue < rightValue){
                j++;
                currMin = Math.min(currMin,nums[j]);
            }else{
                i--;
                currMin = Math.min(currMin,nums[i]);
            }
            result = Math.max(result, currMin*(j-i+1));
        }
        System.out.println("Result : " + result);
    return result;
    }
}
