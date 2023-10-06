package com.practice.arrays;

import java.util.Arrays;

public class SumOfMatrixElements {
    public int[][] findMatrix(int[][] arr){
        //int[][] sumMatrix = new int[arr.length][arr[0].length];
        int sum;
        for(int i=0;i<arr.length;i++){
            sum = 0;
            for(int j=0;j<arr[0].length;j++){
                sum = sum + arr[i][j];
                arr[i][j]=sum;
            }
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = arr[i-1][j] + arr[i][j];

            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        SumOfMatrixElements matrix = new SumOfMatrixElements();
        matrix.findMatrix(array);
    }
}
