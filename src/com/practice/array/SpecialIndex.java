package com.practice.array;

public class SpecialIndex {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,6,-2,5};
        SpecialIndex index = new SpecialIndex();
        index.solve(arr);
    }

    int solve(int[] arr){
        int count = 0;
        int n = arr.length;
        int[] evenPFArr = new int[n];
        evenPFArr[0] = arr[0];
        int[] oddPFArr = new int[n];
        oddPFArr[0] = 0;
        int sumOfEvenIndex = 0;
        int sumOfOddIndex = 0;
        for(int i = 1; i<n; i++){
            if(i % 2 == 0){
                evenPFArr[i] = evenPFArr[i-1]+arr[i];
            } else if (i % 2 == 1) {
                oddPFArr[i] = oddPFArr[i-1] + arr[i];
            } else{
                evenPFArr[i] = evenPFArr[i-1];
                oddPFArr[i] = oddPFArr[i-1];
            }
        }
        int total_even_sum = 0;
        int total_odd_sum = 0;

        for(int i=0; i<n; i++){
            if(i != 0){
                total_even_sum = evenPFArr[i-1] + evenPFArr[n-1] - evenPFArr[i];
                total_odd_sum = oddPFArr[i-1] + oddPFArr[n-1] - oddPFArr[i];
            }else{
                total_even_sum = evenPFArr[n-1];
                total_odd_sum = oddPFArr[n-1];
            }
            if(total_even_sum == total_odd_sum){
                count++;
            }
        }
        System.out.println("Count of Special Index : " + count);
        return count;
    }
}
