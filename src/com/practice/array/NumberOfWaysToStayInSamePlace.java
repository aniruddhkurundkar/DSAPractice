package com.practice.array;

public class NumberOfWaysToStayInSamePlace {
    public static void main(String[] args) {
        NumberOfWaysToStayInSamePlace samePlace = new NumberOfWaysToStayInSamePlace();
        int steps = 3;
        int arrLength = 2;
        samePlace.numWays(steps, arrLength);
    }

    int numWays(int steps, int arrLen) {
        int MOD = (int) 1e9 + 7;
        arrLen = Math.min(steps, arrLen);
        int[][] dp = new int[arrLen][steps + 1];
        dp[0][0] = 1;

        for(int remain = 1; remain<=steps; remain++){
            for(int currIndex = arrLen-1; currIndex >=0; currIndex--){
                int result = dp[currIndex][remain-1];

                if(currIndex > 0){
                    result = (result + dp[currIndex - 1][remain - 1]) % MOD;
                }

                if(currIndex < arrLen-1){
                    result = (result + dp[currIndex + 1][remain - 1]) % MOD;
                }
                dp[currIndex][remain] = result;
            }
        }
        return dp[0][steps] ;
    }

}
