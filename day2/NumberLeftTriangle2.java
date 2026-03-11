package com.mycompany.day2;

import java.util.Scanner;

public class NumberLeftTriangle2 {

    void rows() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberLeftTriangle2 a = new NumberLeftTriangle2();
        a.rows();
    }
}
