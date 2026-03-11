package com.mycompany.day2;

import java.util.Scanner;

public class AlphabetReverseLeftTriangle {

    void rows() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            char start = (char) ('A' + n - i - 1);

            for (char ch = start; ch <= 'A' + n - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AlphabetReverseLeftTriangle a = new AlphabetReverseLeftTriangle();
        a.rows();
    }

}
