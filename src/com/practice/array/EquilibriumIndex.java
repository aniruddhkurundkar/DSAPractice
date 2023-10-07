package com.practice.array;


/**
 *  An Equilibrium Index is the index if
 *  sum of all elements before the ith index  ==
 *  sum of all elements after ith index from the given array.
 *  sum( 0 to ith) == sum (i+1 to n-1)
 *  ==================================
 *  index    0  1  2  3  4  5  6
 *  arr[] = -7  1  5  2 -4  3  0
 *  left  =  0 -7 -6 -1  1 -3  0
 *  right =  7  6  1 -1  3  0  0
 *  ==================================
 *  index 3 and 6 are Equilibrium index.
 *
 */
public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        EquilibriumIndex index = new EquilibriumIndex();
        index.countEquilibriumIndex(arr);
    }

    int countEquilibriumIndex(int[] num){
        int count = 0;
        int leftSum = 0;
        int rightSum = 0;
        int n = num.length;
        int[] pf = new int[n];
        pf[0]  =  num[0];
        for(int i=1; i<n;i++){
            pf[i] = pf[i-1] + num[i];
        }
        for(int i=0;i<n;i++){
            leftSum = i==0 ? 0 : pf[i - 1];
            rightSum = pf[n-1] - pf[i];
            if(leftSum == rightSum){
                count += 1;
            }
        }
        System.out.println("Count of Equilibrium Index : " + count);
        return count;
    }
}
