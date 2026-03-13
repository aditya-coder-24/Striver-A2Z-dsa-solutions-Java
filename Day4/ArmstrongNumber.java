package com.mycompany.day4;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }

        if (sum == original) {
            System.out.println("It is a Armstrong Number");
        } else {
            System.out.println("It is not a Armstrong Number");
        }
    }
}
