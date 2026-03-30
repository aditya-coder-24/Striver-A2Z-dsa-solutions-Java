package com.mycompany.day15;

import java.util.Stack;

public class MaxDeep {

    int count(String str) {
        Stack<Character> stack = new Stack<>();
        int maxDepth = 0;

        for (char c : str.toCharArray()) {

            if (c == '(') {
                stack.push(c);
                maxDepth = Math.max(maxDepth, stack.size());
            } else if (c == ')') {
                stack.pop();
            }
        }

        return maxDepth;
    }
    public static void main(String[] args) {
        String str = "(()()())";
        MaxDeep a = new MaxDeep();
        a.count(str);
    }
}
