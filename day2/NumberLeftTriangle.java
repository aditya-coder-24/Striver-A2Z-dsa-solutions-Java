package com.mycompany.day2;

import java.util.Scanner;

public class NumberLeftTriangle {

    void rows() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberLeftTriangle a = new NumberLeftTriangle();
        a.rows();
    }
}
