package com.practice.tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreeWithFactors {
    public static void main(String[] args) {
        BinaryTreeWithFactors factors = new BinaryTreeWithFactors();
        int[] array = {2,4,5,10};
        factors.numFactoredBinaryTrees(array);
    }

    public int numFactoredBinaryTrees(int[] arr) {

        int MOD = 1_000_000_007;
        int N = arr.length;
        Arrays.sort(arr);
        long[] dp = new long[N];
        Arrays.fill(dp, 1);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            map.put(arr[i],i);
        }
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < i; ++j) {
                if (arr[i] % arr[j] == 0) { // A[j] is left child
                    int right = arr[i] / arr[j];
                    if (map.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[map.get(right)]) % MOD;
                    }
                }
            }

        long ans = 0;
        for (long x: dp) ans += x;

        System.out.println("Factors : " + (int) (ans % MOD));
        return (int) (ans % MOD);
    }
}
