package com.mycompany.day2;

import java.util.Scanner;

public class NumberSquare {

    void rows() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberSquare a = new NumberSquare();
        a.rows();
    }
}
