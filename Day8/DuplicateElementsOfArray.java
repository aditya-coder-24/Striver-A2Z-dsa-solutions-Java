package com.mycompany.day8;

import java.util.*;

public class DuplicateElementsOfArray {

    void Remove() {

        System.out.print("Enter length of array: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter sorted array with duplicates: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Duplicates removed from Array: ");

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
//        System.out.print(arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        DuplicateElementsOfArray a = new DuplicateElementsOfArray();
        a.Remove();
    }
}
