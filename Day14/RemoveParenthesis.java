package com.mycompany.day14;

public class RemoveParenthesis {

    void Remove(String str) {
        String result = "";
        String temp = "";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            temp += ch;

            if (ch == '(') {
                count++;
            } 
            else if (ch == ')') {
                count--;
            }

            if (count == 0) {
                result += temp.substring(1, temp.length() - 1);
                temp = "";
            }
        }

        System.out.print(result);
    }

    public static void main(String[] args) {
        String str = "(()())(())";
        RemoveParenthesis a = new RemoveParenthesis();
        a.Remove(str);
    }
}