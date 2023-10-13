package com.practice.dp;

import java.util.HashMap;

public class MinCostClimbingStair {

    HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        MinCostClimbingStair stair = new MinCostClimbingStair();
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        stair.solvedByBottomUpApproachTabulation(arr);
        stair.solvedByTopDownApproachRecurtionAndMemoization(arr);
    }

    int solvedByBottomUpApproachTabulation(int[] cost){
        int[] minCost = new int[cost.length+1];
        for(int i=2; i<minCost.length;i++){
            //int oneStep = minCost[i-1]+cost[i-1];
            //int twoStep = minCost[i-2]+cost[i-2];
            minCost[i] = Math.min(minCost[i-1]+cost[i-1],minCost[i-2]+cost[i-2]);
        }
        //System.out.println("MinCost : " + minCost[minCost.length - 1]);
        return minCost[minCost.length - 1];
    }

    int solvedByTopDownApproachRecurtionAndMemoization(int[] cost){

        return minimumCost(cost.length,cost);
    }
    int minimumCost(int costLength, int[] cost){
        if(costLength == 0 || costLength == 1)
            return 0;

        if(map.containsKey(costLength))
            return map.get(costLength);

        int downOne = cost[costLength-1] + minimumCost(costLength - 1, cost);
        int downTwo = cost[costLength-2] + minimumCost(costLength - 2, cost);
        map.put(costLength, Math.min(downOne, downTwo));
        System.out.println("Min Cost using Top-Down : " + map.get(costLength));
        return map.get(costLength);
    }
}
