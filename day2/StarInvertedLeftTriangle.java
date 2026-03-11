package com.mycompany.day2;

import java.util.Scanner;

public class StarInvertedLeftTriangle {

    void rows() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        StarInvertedLeftTriangle a = new StarInvertedLeftTriangle();
        a.rows();
    }
}
