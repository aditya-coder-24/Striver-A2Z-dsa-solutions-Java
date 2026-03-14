package com.mycompany.day5;

import java.util.Scanner;

public class PrintPalindromeOfString {

    void Print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        PrintPalindromeOfString a = new PrintPalindromeOfString();
        a.Print();
    }

}
