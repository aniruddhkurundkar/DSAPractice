package com.practice.arrays;
/**
 *  Given an array of size N. Count number of elements
 *  having at least one element grater than itself.
 *  int[] arr = {3,-2,6,8,4,8,5};
 */

import java.util.*;

/**
 * OBSERVATION :
 * 1. Which element won't have any element greater than itself ==> maxElement
 * 2. Rest element will have at least one element greater than itself.
 * 3. There can be more than 1 maxElement. Hence, #totalNumber - #tocalCountOfMaxElement
 *    are the numbers available in the given array which has at least one element
 *    greater than itself.
 *
 *    TC = BigO(n) and SC = BigO(1).
 */


public class AtLeastOneElementGreaterThanItself {

    //BruteForce Approach with two for loop.
    public int findElementUsingBruteForceApproach(int[] array){
        int max_element = Integer.MIN_VALUE;
        int count_max = 0;
        for(int i=0; i<array.length;i++){
            if(array[i]>max_element){
                max_element = array[i];
            }
        }
        for(int j=0; j<array.length;j++) {
            if (array[j] == max_element) {
                count_max++;
            }
        }
    return array.length-count_max;
    }

    // Optimised solution with one for loop and HashMap.
    public int findElementOptimisedSolution(int[] arr){
       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       int count = 0;
       int max_element = 0;
       int max_count = 0;
       for(int i=0; i<arr.length;i++){
           if(arr[i]>max_element){
               max_element = arr[i];
           }
           if(map.containsKey(arr[i])) {
               count++;
               map.put(arr[i], count);
           }else{
               count = 1;
               map.put(arr[i], count);
           }
       }
       max_count = map.get(max_element);

       return arr.length - max_count;
    }

    public static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        int size = 0;
        System.out.println("Enter the size of an array : ");
        size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements.");
        for(int i=0;i<size;i++){
            arr[i]= scan.nextInt();
        }

        int count = 0;
        AtLeastOneElementGreaterThanItself oneElement = new AtLeastOneElementGreaterThanItself();
        count = oneElement.findElementUsingBruteForceApproach(arr);
        System.out.println("Available element in an array : "+ count);
        count = oneElement.findElementOptimisedSolution(arr);
        System.out.println("Available element in an array : "+ count);
    }
}
