package com.mycompany.day12;

import java.util.Scanner;

public class KthElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array A: ");
        int m = sc.nextInt();

        int a[] = new int[m];

        System.out.println("Enter elements of A:");

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of array B: ");
        int n = sc.nextInt();

        int b[] = new int[n];

        System.out.println("Enter elements of B:");

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int i = 0, j = 0, count = 0;
        int answer = 0;

        while (i < m && j < n) {

            if (a[i] < b[j]) {
                answer = a[i];
                i++;
            } else {
                answer = b[j];
                j++;
            }

            count++;

            if (count == k) {
                break;
            }
        }

        while (count < k && i < m) {
            answer = a[i++];
            count++;
        }

        while (count < k && j < n) {
            answer = b[j++];
            count++;
        }

        System.out.println("Kth element: " + answer);
    }
}
