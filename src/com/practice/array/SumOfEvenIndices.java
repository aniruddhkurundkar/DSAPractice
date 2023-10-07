package com.practice.array;

public class SumOfEvenIndices {
    public static void main(String[] args) {
        int[] arr = {3,4,-2,8,6,2,1,3};
        SumOfEvenIndices evenIndex = new SumOfEvenIndices();
        evenIndex.evenIndexSum(arr);
    }

    int evenIndexSum(int[] arr){
        int pf[] = new int[arr.length];
        pf[0] = arr[0];
        for(int i=1;i<arr.length; i++){
            if(i%2 == 0){
                pf[i] = pf[i-1] + arr[i];
            }else{
                pf[i] = pf[i-1];
            }
        }
        int sum = 0;
        for(int j=0; j< pf.length; j++){
            if(j == 0){
                sum += pf[j];
            }
            if(j > 0 && j%2 == 0){
                sum = sum + pf[j] - pf[j-1];
            }
        }
        System.out.println("Sum of even index : "+sum);
        return sum;
    }
}
