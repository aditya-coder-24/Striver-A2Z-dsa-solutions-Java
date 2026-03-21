package com.mycompany.day11;

import java.util.Scanner;

public class SearchInRotatedArray {

    void Search() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;
            }
        }
        System.out.println("Index is: " + idx);
    }

    public static void main(String[] args) {
        SearchInRotatedArray a = new SearchInRotatedArray();
        a.Search();
    }
}
