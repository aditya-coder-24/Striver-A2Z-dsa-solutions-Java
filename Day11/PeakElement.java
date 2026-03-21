package com.mycompany.day11;

import java.util.Scanner;

public class PeakElement {

    void FindPeak() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 1 || arr[0] > arr[1]) {
            System.out.println("Peak element: " + arr[0]);
            return;
        }

        for (int i = 1; i < n - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Peak element: " + arr[i]);
                return;
            }
        }

        if (arr[n - 1] > arr[n - 2]) {
            System.out.println("Peak element: " + arr[n - 1]);
        }
    }

    public static void main(String[] args) {
        PeakElement a = new PeakElement();
        a.FindPeak();
    }
}
