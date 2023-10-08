package com.practice.string.carryforward;

/**
 * Count the pairs from the given String where
 * i > j
 * String[i] = "a"
 * String[j] = "j"
 *
 */
public class CountPairsFromString {
    public static void main(String[] args) {
        CountPairsFromString countPair = new CountPairsFromString();
        String str = "alhgag";
        countPair.solve(str);
    }

    int solve(String s){
        int count_a = 0;
        int countPair = 0;
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) == 'a'){
                    count_a++;
                }else if(s.charAt(i) == 'g'){
                    countPair += count_a;
                }
            }
            System.out.print("Count Pairs : " + countPair);
        return countPair;
    }
}
