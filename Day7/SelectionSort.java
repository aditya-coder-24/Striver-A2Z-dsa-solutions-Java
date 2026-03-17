package com.mycompany.day7;

import java.util.Scanner;

public class SelectionSort {
//Select 0th index find smaller than that and swap
    void Sort() {

        System.out.print("Enter length of Array: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elenemts: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int MinIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[MinIndex] >= arr[j]) {
                    MinIndex = j;
                }
            }
            int temp = arr[MinIndex];
            arr[MinIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted Array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        SelectionSort a = new SelectionSort();
        a.Sort();
    }
}
