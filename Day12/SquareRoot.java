package com.mycompany.day12;

import java.util.Scanner;

public class SquareRoot {

    void findSqrt() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (i * i <= n) {
                ans = i;
            } else {
                break;
            }
        }

        System.out.println("Square root (floor): " + ans);
    }

    public static void main(String[] args) {

        SquareRoot obj = new SquareRoot();
        obj.findSqrt();
    }
}