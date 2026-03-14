package com.mycompany.day5;

import java.util.Scanner;

public class PrintNToOneNum {

    void Print() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PrintNToOneNum a = new PrintNToOneNum();
        a.Print();
    }
}
