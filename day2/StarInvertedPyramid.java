package com.mycompany.day2;

import java.util.Scanner;

public class StarInvertedPyramid {

    void rows() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarInvertedPyramid a = new StarInvertedPyramid();
        a.rows();
    }
}
