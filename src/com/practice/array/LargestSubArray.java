package com.practice.array;

import java.util.*;

public class LargestSubArray {

    int findLargestSubArray(int[] a){
        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<a.length; i++){
                int sum=0;
                for(int j=i;j<a.length;j++){
                    sum+=a[j];
                    if(sum==0){
                        max = j;
                        map.put(sum,max);
                    }
                }
            }
            System.out.println("LargestSubArray Length with sum 0 :" + max);
        return max;
    }

    /**
     * Find Largest sub-array using prefix array method.
     * @param a
     * @return
     */
    int getLargestSubArray(int[] a){
        int[] pf = new int[a.length];
        pf[0] = a[0];
        for(int i=1; i<a.length;i++){
            pf[i] = pf[i-1] + a[i];
        }
        //pf = {-2,-5,-1,-2,-4,-3,2,-1}
        int min_ppf_sum = 0;
        int result = Integer.MIN_VALUE;
        for(int k=0; k<pf.length; k++){
            result = Math.max(result, pf[k] - min_ppf_sum);
            min_ppf_sum = Math.min(min_ppf_sum,pf[k]);
        }
        System.out.println(" Size of largest SubArray : " + result);
        return result;
    }

    public static void main(String[] q){
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        LargestSubArray lsa = new LargestSubArray();
        lsa.getLargestSubArray(arr);
        //lsa.findLargestSubArray(arr);
        //System.out.println(lsa.findLargestSubArray(arr));

    }
}
