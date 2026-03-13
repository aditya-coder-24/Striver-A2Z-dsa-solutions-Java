package com.mycompany.day4;

import java.util.Scanner;

public class CountDigitsofNumber {

    int count() {

        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        int i = 0;

        while (num != 0) {
            num = num / 10;
            i++;
        }
        System.out.println(i);

        return 0;
    }

    public static void main(String[] args) {
        CountDigitsofNumber a = new CountDigitsofNumber();
        a.count();
    }
}
