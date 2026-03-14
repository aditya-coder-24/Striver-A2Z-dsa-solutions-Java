package com.mycompany.day5;

import java.util.Scanner;

public class PrintNameNTimes {

    void Print() {
        System.out.println("Enter the value of N: ");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        System.out.println("Enter the Name: ");
        Scanner ac = new Scanner(System.in);
        String name;
        name = ac.nextLine();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        PrintNameNTimes a = new PrintNameNTimes();
        a.Print();
    }
}
