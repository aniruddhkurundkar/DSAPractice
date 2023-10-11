package com.practice.string;

public class ContinuousRepeatedLetterFromString {
    public static void main(String[] args) {
        String str = "aaabbccddddabcc";
        ContinuousRepeatedLetterFromString string = new ContinuousRepeatedLetterFromString();
        string.solve(str);
    }

    public String solve(String str){
        StringBuilder compressed = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                compressed.append(currentChar);
                compressed.append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        compressed.append(currentChar);
        compressed.append(count);
        System.out.print("Final String : " + compressed);
        return compressed.toString();
    }
}
