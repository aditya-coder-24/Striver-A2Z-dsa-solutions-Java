package com.mycompany.day14;

import java.util.Scanner;

public class PalindromeString {

    void palindrome() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
    public static void main(String[] args) {
        PalindromeString a = new PalindromeString();
        a.palindrome();
    }
}
