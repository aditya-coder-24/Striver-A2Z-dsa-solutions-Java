package com.mycompany.day7;

import java.util.Scanner;

public class BubbleSort {

    void Sort() {
//Bubble up 0th element swap it with the next one if greater than 0th
        System.out.print("Enter length of Array: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elenemts: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort a = new BubbleSort();
        a.Sort();
    }
}
