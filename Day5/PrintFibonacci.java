package com.mycompany.day5;

import java.util.Scanner;

public class PrintFibonacci {

    void Print() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
        PrintFibonacci a = new PrintFibonacci();
        a.Print();
    }
}
