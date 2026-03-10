package com.mycompany.Day1;

import java.util.Scanner;

class PrintNo {

    public void printNumber() {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();

        System.out.println("value of x is: " + x);
    }

    public static void main(String[] args) {
        PrintNo obj = new PrintNo();
        obj.printNumber();
    }
}
