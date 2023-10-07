package com.practice.array;

import java.util.Scanner;

public class FindMaxAndMinOfArray {

    public static void main(String[] str){
        Scanner scan = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the size of array : ");
        n=scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element : ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        FindMaxAndMinOfArray mm = new FindMaxAndMinOfArray();
        mm.findMaxAndMin(arr);
    }

    public void findMaxAndMin(int[] array){
        int max = 0;
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.print("Max : "+ max + " Min : " + min);
    }
}
