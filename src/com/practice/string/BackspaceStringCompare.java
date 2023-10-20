package com.practice.string;

import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        BackspaceStringCompare backspace = new BackspaceStringCompare();
        String s = "ab#c";
        String t = "ad#c";
        backspace.backspaceCompare(s,t);
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String strng) {
        Stack<Character> str = new Stack();
        for (char ch: strng.toCharArray()) {
            if (ch != '#')
                str.push(ch);
            else if (!str.empty())
                str.pop();
        }
        return String.valueOf(str);
    }
}
