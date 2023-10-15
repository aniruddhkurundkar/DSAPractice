package com.practice.string;

public class ReverseWordsOfString {

    public String reverseWords(String s) {
        String[] strArray = s.split(" ");
        String reverse = "";
        String newString = "";
        for(int i=0; i< strArray.length; i++){
            newString=strArray[i];
            for(int j=newString.length();j>0;--j){
                reverse = reverse + " " + new StringBuilder(newString).reverse();
                break;
            }
        }

        return reverse.trim();
    }
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        ReverseWordsOfString reverse = new ReverseWordsOfString();
        reverse.reverseWords(str);
    }
}
