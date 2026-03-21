package com.mycompany.day11;

import java.util.Scanner;

public class SingleElement {

    void FindSingle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i = i + 2) {

            if (arr[i] != arr[i + 1]) {
                System.out.println("Single element: " + arr[i]);
                return;
            }
        }

        System.out.println("Single element: " + arr[n - 1]);
    }

    public static void main(String[] args) {
        SingleElement a = new SingleElement();
        a.FindSingle();
    }
}
