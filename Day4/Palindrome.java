package com.mycompany.day4;

import java.util.Scanner;

public class Palindrome {

    void Check() {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            num = num / 10;
        }

        if (reverse == original) {
            System.out.println("The numbre is a Palindrome!");
        } else {
            System.out.println("The numbre is not a Palindrome!");
        }
    }

    public static void main(String[] args) {
        Palindrome a = new Palindrome();
        a.Check();
    }
}
