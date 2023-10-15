package com.practice.string;

public class ReverseGivenString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int n = s.length;
        ReverseGivenString reverse = new ReverseGivenString();
        reverse.withForLoop(s);
        reverse.withoutForLoop(s,0,n-1);
    }

    void withForLoop(char[] s){
        int n = s.length;
        char[] rev = new char[n];
        int j=0;
        for(int i=n-1; i>=0; i--){
            rev[j] = s[i];
            j++;
        }
        System.out.println("Reverse String : " + rev);
    }
    void withoutForLoop(char[] s,int left, int right){

        if(left >= right)
            return;
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        withoutForLoop(s,left,right);
    }
}
