package com.mycompany.day10;

import java.util.Scanner;

public class MissingRepeating {

    void Find() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                repeating = i;
            }

            if (count == 0) {
                missing = i;
            }
        }

        System.out.println("Repeating: " + repeating);
        System.out.println("Missing: " + missing);
    }

    public static void main(String[] args) {
        MissingRepeating a = new MissingRepeating();
        a.Find();
    }
}