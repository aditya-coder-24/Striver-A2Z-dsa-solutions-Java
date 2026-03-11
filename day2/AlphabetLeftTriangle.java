package com.mycompany.day2;

import java.util.Scanner;

class AlphabetLeftTriangle {

    void rows() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        AlphabetLeftTriangle a = new AlphabetLeftTriangle();
        a.rows();
    }
}
