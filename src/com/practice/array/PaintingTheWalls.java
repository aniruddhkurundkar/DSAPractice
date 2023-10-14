package com.practice.array;

public class PaintingTheWalls {
    public static void main(String[] args) {
        PaintingTheWalls walls = new PaintingTheWalls();
        int[] cost = {2,3,4,2};
        int[] time = {1,1,1,1};
        walls.solve(cost,time);
    }

    int solve(int[] cost, int[] time){
        int n = cost.length;
        int[][] dp = new int[n+1][n+1];

        for(int i=1; i<n; i++){
            dp[n][i] = (int) 1e9;
        }

        for(int j = n-1; j>=0;j--){
            for(int remain=1; remain<=n;remain++){
                int paint = cost[j] + dp[j+1][Math.max(0, remain-1-time[j])];
                int dontPaint = dp[j+1][remain];
                dp[j][remain] = Math.min(paint,dontPaint);
            }
        }
        return dp[0][n];
    }
}
