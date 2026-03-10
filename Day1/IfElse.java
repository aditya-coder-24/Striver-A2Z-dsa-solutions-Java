package com.mycompany.Day1;

import java.util.Scanner;

public class IfElse {

    public void printAge() {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();

        if (x < 18) {
            System.out.println("Under Age");
        } else {
            System.out.println("Valid Age");
        }
    }

    public static void main(String[] args) {
        IfElse obj = new IfElse();
        obj.printAge();
    }
}
