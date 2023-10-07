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
        int[] pf = new int[]{a[0]};
        for(int i=1; i<a.length;i++){
            pf[i] = pf[i-1] + a[i];
        }
        return 0;
    }

    public static void main(String[] q){
        int[] arr = {1,2,-2,4,-4,3,-3,5,2};
        LargestSubArray lsa = new LargestSubArray();
        //System.out.println(lsa.findLargestSubArray(arr));

    }
}
