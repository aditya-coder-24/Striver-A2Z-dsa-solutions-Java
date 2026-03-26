package com.mycompany.day12;

import java.util.Scanner;

public class NthRoot {

    void findRoot() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.print("Enter M: ");
        int m = sc.nextInt();

        int answer = -1;

        for (int i = 1; i <= m; i++) {

            int power = 1;

            for (int j = 1; j <= n; j++) {
                power = power * i;
            }

            if (power == m) {
                answer = i;
                break;
            }

            if (power > m)
                break;
        }

        System.out.println("Nth Root: " + answer);
    }

    public static void main(String[] args) {

        NthRoot obj = new NthRoot();
        obj.findRoot();
    }
}