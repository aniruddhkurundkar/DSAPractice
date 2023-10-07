package com.practice.array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 *
 * Approach :
 * 1. Can be solved by using for loop and Arrays.sort();
 * 2. Can be solved by using Stream API.
 *
 * TC = BigO(n) and SC = BigO(1)
 */
public class SquareOfSortedArray {


    public int[] getSquareOfSortedArray(int[] array){

        for(int i=0; i<array.length;i++){
            array[i] = array[i] * array[i];
        }
        Arrays.sort(array);
        return array;
    }


    public int[] getSquareOfSortedArrayUsingStream(int[] array){
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> sortedList = list.stream().map(num->num*num).sorted().collect(Collectors.toList());
        //sortedList.stream().forEach(System.out::print);
        array = sortedList.stream().mapToInt(n->n).toArray();
        return array;
    }
    public static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter the size of an array : ");
        size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements of an array : ");
        for(int i=0; i<size;i++){
            array[i] = scan.nextInt();
        }
        SquareOfSortedArray sortedArray = new SquareOfSortedArray();
        sortedArray.getSquareOfSortedArray(array);
        sortedArray.getSquareOfSortedArrayUsingStream(array);
    }
}
