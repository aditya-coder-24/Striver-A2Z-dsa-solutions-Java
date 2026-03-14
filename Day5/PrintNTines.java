package com.mycompany.day5;

import java.util.Scanner;

public class PrintNTines {

    void Print() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Java is for Devlopers!");
        }
    }

    public static void main(String[] args) {
        PrintNTines a = new PrintNTines();
        a.Print();
    }
}
