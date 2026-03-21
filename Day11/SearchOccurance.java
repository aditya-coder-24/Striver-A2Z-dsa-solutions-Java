package com.mycompany.day11;

import java.util.Scanner;

public class SearchOccurance {

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

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        if (count == 0) {
            System.out.print("No such target found!");
        } else {
            System.out.print("Count: " + count);
        }
    }

    public static void main(String[] args) {
        SearchOccurance a = new SearchOccurance();
        a.Search();
    }
}
