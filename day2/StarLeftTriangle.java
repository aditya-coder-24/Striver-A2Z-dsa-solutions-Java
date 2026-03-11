package com.mycompany.day2;

import java.util.Scanner;

public class StarLeftTriangle {

    void rows() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarLeftTriangle a = new StarLeftTriangle();
        a.rows();

    }
}
