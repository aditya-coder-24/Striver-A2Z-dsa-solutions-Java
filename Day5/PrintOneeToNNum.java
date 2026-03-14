package com.mycompany.day5;

import java.util.Scanner;

public class PrintOneeToNNum {

    void Print() {

        System.out.println("Enter the value of N: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintOneeToNNum a = new PrintOneeToNNum();
        a.Print();
    }
}
