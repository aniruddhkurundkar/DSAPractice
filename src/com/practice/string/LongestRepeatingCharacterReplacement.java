package com.practice.string;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given a string s and an integer k.
 * You can choose any character of the string and
 * change it to any other uppercase English character.
 * You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing
 * the same letter you can get after performing the above operations.
 */
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement character = new LongestRepeatingCharacterReplacement();
        String str = "ABABBAA";
        int k = 2;
        character.solve(str,k);
    }

    int solve(String s, int k){
        int count = 1;
        int max_repeating_count = 0;
        int left = 0;
        int max_length = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right=0; right<s.length(); right++){
            if(map.containsKey(s.charAt(right))){
                count = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), count);
            }else{
                map.put(s.charAt(right),1);
            }
            max_repeating_count = Math.max(max_repeating_count,map.get(s.charAt(right)));
            int non_repeating_count = (right-left+1) - max_repeating_count;
            if(non_repeating_count > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            max_length = Math.max(max_length,right-left+1);
        }
        return max_length;
    }
}
