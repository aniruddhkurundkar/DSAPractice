package com.practice.string;

import java.util.TreeSet;

public class RemoveVowelsFromString {
    public static void main(String[] args) {
        String str = "leetcodeisacommunityforcoders";
        String newStr = "";
        TreeSet<Character> set = new TreeSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int size = str.length();
        for (int i=0; i<size; i++){
            if(!set.contains(str.charAt(i))){
                newStr += str.charAt(i);
            }
        }
        System.out.print("New String without Vowels : " + newStr);
    }
}
