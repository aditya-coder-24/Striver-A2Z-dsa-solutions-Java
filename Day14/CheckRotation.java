package com.mycompany.day14;

import java.util.Scanner;

public class CheckRotation {

    void Check() {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String goal = sc.nextLine();

        if (s.length() != goal.length()) {
            System.out.println(false);
            return;
        }

        String temp = s + s;

        if (temp.contains(goal)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        CheckRotation a = new CheckRotation();
        a.Check();
    }
}
