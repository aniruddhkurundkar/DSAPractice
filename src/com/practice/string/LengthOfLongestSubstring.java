package com.practice.string;

import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        LengthOfLongestSubstring substring = new LengthOfLongestSubstring();
        String s = "abcabcbb";
        substring.longestSubstring(s);
    }

    int longestSubstring(String s){
        int size = s.length();
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j=0,i=0; j<size; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            res = Math.max(res,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return res;
    }
}
