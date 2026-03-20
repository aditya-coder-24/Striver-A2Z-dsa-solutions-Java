package com.mycompany.day10;

import java.util.Scanner;

public class ReversePairs {

    void CountPairs() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > 2 * arr[j]) {
                    count++;
                }
            }
        }

        System.out.println("Number of reverse pairs: " + count);
    }

    public static void main(String[] args) {
        ReversePairs a = new ReversePairs();
        a.CountPairs();
    }
}
