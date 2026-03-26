package com.mycompany.day12;

import java.util.Scanner;

public class KthMissing {

    void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int current = 1;
        int missing = 0;
        int i = 0;

        while (missing < k) {

            if (i < n && arr[i] == current) {
                i++;
            } else {
                missing++;
            }

            if (missing == k) {
                System.out.println("Answer: " + current);
                return;
            }

            current++;
        }
    }

    public static void main(String[] args) {

        KthMissing obj = new KthMissing();
        obj.solve();
    }
}