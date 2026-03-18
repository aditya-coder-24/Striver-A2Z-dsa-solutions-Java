package com.mycompany.day8;

import java.util.Scanner;

public class LargestElement {

    void Find() {

        System.out.print("Enter length of array: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            while (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.print("Largest Element: " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        LargestElement a = new LargestElement();
        a.Find();
    }
}
