package com.practice.string;

import java.util.TreeSet;

public class ReverseVowelsOfString {

    public static void main(String[] args) {
        ReverseVowelsOfString vowelsOfString = new ReverseVowelsOfString();
        String str = "u'o;B,vKO\"?,.;?fGI 9;`9T`Z,;iqsn4A.:;'H3s8E9. B4TxfOiB'wvM?q'k:Q`J\"E1T7lo e7c!?glI66?JZh\"6 !C,aK! 1J?f9'`SX4Q!Q4XS`'9f?J1 !Ka,C! 6\"hZJ?66Ilg?!c7e ol7T1E\"J`Q:k'q?Mvw'BiOfxT4B .9E8s3H';:.A4nsqi;,Z`To`;o IGf?;.,?\"OKv,B;o'u";
        vowelsOfString.reverseVowels(str);
    }

    public String reverseVowels(String s){
        TreeSet<Character> set = new TreeSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        int start = 0;
        int end = s.length() - 1;

        char[] sChar = s.toCharArray();


        while (start < end) {

            while (start < s.length () && !set.contains(sChar[start])) {
                start++;
            }

            while (end >= 0 && !set.contains(sChar[end])) {
                end--;
            }
            // Swap them if start is left of end
            if (start < end) {
                char temp = sChar[start];
                sChar[start++] = sChar[end];
                sChar[end--] = temp;
            }
        }
        System.out.println("String after Reverse Vowels : " + new String(sChar));
        return new String(sChar);
    }
}
