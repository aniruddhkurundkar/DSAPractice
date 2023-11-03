package com.practice.array.carryforward;


/**
 *  Given an array of size N, find the smallest continuous part of array such that
 *  it contains both min and max value of array.
 *
 *  Observation:
 *  1. Min and Max are always last elements of an array.
 *  2. There will be only one min and max element in the subarray.
 *
 */
public class ClosestMinMax {
    public static void main(String[] args) {
        ClosestMinMax minmax = new ClosestMinMax();
        int[] array = {1,2,3,1,3,4,6,4,6,3};
        minmax.solve(array);
    }

    int solve(int[] arr){
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    int min_Index = -1, max_Index = -1;
    int ans = Integer.MAX_VALUE;

        return 0;
    }
}
