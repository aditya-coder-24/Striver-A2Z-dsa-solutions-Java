package com.mycompany.day4;

import java.util.Scanner;

public class ReverseNumber {

    int Reverse() {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
        }
        System.out.println(rev);
        return 0;
    }

    public static void main(String[] args) {
        ReverseNumber a = new ReverseNumber();
        a.Reverse();
    }
}
