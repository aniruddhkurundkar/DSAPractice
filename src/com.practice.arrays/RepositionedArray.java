package com.practice.arrays;

public class RepositionedArray {

    public int[][] newArrayByChangingPosition(int[] A){
        int temp=0;
        int[][] B = new int[A.length][];
        int[] C = new int[A.length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++) {
                if (i != j) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                    C[i] = A[j];
                    break;
                }
                B[i] = C;
            }
        }
        return B;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        RepositionedArray array = new RepositionedArray();
        array.newArrayByChangingPosition(arr);

    }
}
