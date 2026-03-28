package com.mycompany.day14;

public class ReverseString {

    void Reverse(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println(result.trim());
    }

    public static void main(String[] args) {
        String str = "I am a Java Developer";

        ReverseString obj = new ReverseString();
        obj.Reverse(str);
    }
}
