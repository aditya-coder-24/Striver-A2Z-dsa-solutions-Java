package com.mycompany.day7;

import java.util.Scanner;

public class InsertionSort {

    void Sort() {

        System.out.print("Enter length of array:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.print("Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        InsertionSort a = new InsertionSort();
        a.Sort();
    }
}
