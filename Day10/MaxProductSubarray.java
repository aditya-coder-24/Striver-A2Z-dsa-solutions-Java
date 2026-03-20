package com.mycompany.day10;

import java.util.Scanner;

public class MaxProductSubarray {

    void FindMaxProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProduct = arr[0];
        int currentMax = arr[0];
        int currentMin = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            currentMax = Math.max(arr[i], currentMax * arr[i]);
            currentMin = Math.min(arr[i], currentMin * arr[i]);

            if (currentMax > maxProduct) {
                maxProduct = currentMax;
            }
        }

        System.out.println("Maximum Product: " + maxProduct);
    }

    public static void main(String[] args) {
        MaxProductSubarray a = new MaxProductSubarray();
        a.FindMaxProduct();
    }
}