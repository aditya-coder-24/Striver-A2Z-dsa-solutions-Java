package com.mycompany.day11;

import java.util.Scanner;

public class SearchElement {

    void Search() {
        System.out.print("Enter length of array: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int mid = arr.length / 2;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[mid] < target) {
                mid++;
            } else if (arr[mid] > target) {
                mid--;
            }
        }

        if (arr[mid] == target) {
            System.out.println("The element is at " + mid + " index");
        } else {
            System.out.println("No such elements found!");
        }
    }

    public static void main(String[] args) {
        SearchElement a = new SearchElement();
        a.Search();
    }
}
