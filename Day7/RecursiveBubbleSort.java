package com.mycompany.day7;

import java.util.Scanner;

public class RecursiveBubbleSort {

    void Sort() {

        System.out.print("Enter length of array: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.print("Sorted array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        RecursiveBubbleSort a = new RecursiveBubbleSort();
        a.Sort();
    }
}
