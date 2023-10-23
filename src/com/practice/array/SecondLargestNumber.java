package com.practice.array;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class SecondLargestNumber {
    public static void main(String[] str){
        SecondLargestNumber largest = new SecondLargestNumber();
        int[] array = {3,2,3,1,2,4,5,5,6};
        int k=4;;
        /**
         *  Using stream.
         */
        IntStream stream = Arrays.stream(array);
        int secondLargest = stream.sorted().skip(array.length-2).findFirst().getAsInt();
        System.out.println("SecondLargest : " + secondLargest);

        largest.getSecondLargest(array,k);

    }
    int getSecondLargest(int[] array,int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num:array){
            if(heap.size()>k)
                heap.remove();
        }
        return heap.peek();
    }
}
