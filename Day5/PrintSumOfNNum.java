package com.mycompany.day5;

import java.util.Scanner;

public class PrintSumOfNNum {

    void Print() {

        System.out.println("Enter the value of N: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int var = 0;
        for (int i = 0; i <= n; i++) {
            var = var + i;
        }
        System.out.println(var);
    }

    public static void main(String[] args) {
        PrintSumOfNNum a = new PrintSumOfNNum();
        a.Print();
    }
}
