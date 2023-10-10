package com.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PositionOfElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        PositionOfElementInArray position = new PositionOfElementInArray();
        position.solve(arr, target);
    }

    int[] solve(int[] nums, int target) {
        List<Integer> posList = new ArrayList<>();
        int[] posArray = new int[2];
        int n = nums.length;
        boolean flag = false;
        if (nums.length == 1 && nums[0] == target) {
            posArray = new int[]{0, 0};
        } else if (n > 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    posList.add(i);
                    flag = true;
                }
            }
            if (posList.size() == 1) {
                posArray = new int[]{posList.get(0), posList.get(0)};
            } else if (flag && posList.size() > 1) {
                posArray[0] = posList.get(0);
                int end = 0;
                Collections.sort(posList);
                end = posList.get(posList.size() - 1);
                posArray[1] = end;
            } else {
                posArray = new int[]{-1, -1};
            }
        } else {
            posArray = new int[]{-1, -1};
        }
        Arrays.stream(posArray).map(i -> i).forEach(System.out::println);
        return posArray;
    }
}
