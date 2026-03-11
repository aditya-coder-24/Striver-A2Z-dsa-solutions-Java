package com.mycompany.day2;

import java.util.Scanner;

public class StarRectangle {

    void rows() {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        StarRectangle x = new StarRectangle();
        x.rows();
    }
}
