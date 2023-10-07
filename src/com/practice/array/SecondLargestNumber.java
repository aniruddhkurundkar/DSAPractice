package com.practice.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SecondLargestNumber {
    public static void main(String[] str){
        int[] array = {3,6,4,5,9,8,7,43,23,65,45};

        /**
         *  Using stream.
         */
        IntStream stream = Arrays.stream(array);
        int secondLargest = stream.sorted().skip(array.length-2).findFirst().getAsInt();
        System.out.println("SecondLargest : " + secondLargest);


    }
}
