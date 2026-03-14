package com.mycompany.day5;

import java.util.Scanner;

public class PrintFactorialOfN {

    void Print() {

        System.out.println("Enter the value of N: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int var = 1;
        for (int i = 1; i <= n; i++) {
            var = var * i;
        }
        System.out.println("Factorial of " + n + " is: " + var);
    }

    public static void main(String[] args) {
        PrintFactorialOfN a = new PrintFactorialOfN();
        a.Print();
    }
}
