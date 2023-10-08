package com.practice.array.carryforward;

/**
 * Given an  array of size N, Find all the Leaders.
 *
 * Leader is strictly greater than all elements to its right.
 * Last element of the array will be always counted as leader.
 *
 */
public class LeaderInArray {
    public static void main(String[] args) {
        LeaderInArray leader = new LeaderInArray();
        int[] arr = {16,17,17,4,3,5,2};
        leader.solve(arr);
    }

    int solve(int[] array){
        int count = 1;
        int max = array[array.length-1];
        for(int i=array.length-2; i>0; i--){
            if(array[i] > max){
                count++;
                max = array[i];
            }
        }
        System.out.println("Count of leader : " + count);
        return count;
    }
}
