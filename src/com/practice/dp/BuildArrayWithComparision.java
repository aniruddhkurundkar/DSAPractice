package com.practice.dp;

import java.util.Arrays;

public class BuildArrayWithComparision {
    public int solve(int n, int m, int k, int i, int currCost, int currMax, Integer[][][] dp) {
        if(i == n){
            if(k == currCost){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[i][currMax][currCost] != null){
            return dp[i][currMax][currCost];
        }
        int ans = 0;
        for(int num=1;num<=m;num++){
            int newMax = currMax;
            int newCost = currCost;
            if(num > newMax){
                newMax = num;
                newCost++;
            }
            if(newCost>k) break;
            ans += solve(n,m,k,i+1,newCost,newMax,dp);
            ans %= 1_000_000_007;
        }
        return dp[i][currMax][currCost] = ans;
    }

    int numOfArrays(int n,int m, int k){
        Integer[][][] dp = new Integer[n+1][m+1][k+1];
        return solve(n,m,k,0,0,0,dp);
    }
    public static void main(String[] args) {
        BuildArrayWithComparision comparision = new BuildArrayWithComparision();
        comparision.numOfArrays(2,3,1);
    }
}
