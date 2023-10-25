package com.practice.bitmanipulation;

public class KthGrammar {
    public static void main(String[] args) {
        KthGrammar grammar = new KthGrammar();
        int n = 2;
        int k = 1;
        grammar.kthGrammar(n,k);
    }

    public int kthGrammar(int n, int k) {
        int kthElement = solve(n,k);
        System.out.println("Kth Element : " + kthElement);
        return kthElement;
    }

    int solve(int n, int k){
        int length = (int)Math.pow(2,n-1);
        int mid = length/2;
        if(n==1 && k==1)
            return 0;
        if(k <= mid){
            return solve(n-1,k);
        }else{
            return 1-(solve(n-1,k-mid));
        }

    }
}
