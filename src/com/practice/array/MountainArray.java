package com.practice.array;

import java.util.*;

public class MountainArray {
    public static void main(String[] args) {
        MountainArray array = new MountainArray();
        //int[] mountainArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2};
        //array.findInMountainArray(1, mountainArray);
        //int[] mountainArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82};
        int[] mountainArray = {1,5,2};
        array.getInMountainArray(2, mountainArray);
    }

    // Bruteforce Approach....
    public int findInMountainArray(int target, int[] mountainArr) {

        int mountainLength = mountainArr.length;
        int max = 0;
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        if (mountainLength > 3) {
            for (int i = 0; i < mountainLength; i++) {
                if (mountainArr[i] > max) {
                    max = mountainArr[i];
                }
                if (!map.containsKey(mountainArr[i])) {
                    map.put(mountainArr[i], new ArrayList<>());
                }
                map.get(mountainArr[i]).add(i);
            }
            List<Integer> indexList = null;
            if (map.get(target) != null) {
                indexList = map.get(target);
                System.out.println("IndexList Size : " + indexList);
                for (int j = 0; j < indexList.size(); j++) {
                    System.out.println("IndexList index j : " + j + " value : " + indexList.get(j));
                    if (min > indexList.get(j)) {
                        min = indexList.get(j);
                    }
                }
            } else {
                return -1;
            }

        } else {
            return -1;
        }
        System.out.println("Min : " + min);
        return min;
    }

    // Optimal Approach.

    int getInMountainArray(int target, int[] mountainArr){
        int left=0;
        int n = mountainArr.length;
        int peakIndex = peakIndexInMountainArray(mountainArr);
        int index = binarySearch(mountainArr, left, peakIndex, target);
        if(index == -1){
            return reverseBinarySearch(mountainArr, peakIndex, n-1, target);
        }
        System.out.println("Min Index : " + index);
        return index;
    }

    int peakIndexInMountainArray(int[] mountainArr){
        int left=0;
        int right = mountainArr.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mountainArr[mid] < mountainArr[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    int binarySearch(int[] mountainArr, int left, int right, int target){
        int mid = 0;
        while(left <= right){
            mid = left + (right-left)/2;
            if(mountainArr[mid] == target){
                return mid;
            }else if (mountainArr[mid] > target){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    int reverseBinarySearch(int[] mountainArr, int left, int right, int target){
        int mid = 0;
        while(left <= right){
            mid = left + (right-left)/2;
            if(mountainArr[mid] == target){
                return mid;
            }else if(mountainArr[mid] > target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
