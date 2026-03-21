package com.mycompany.day11;

import java.util.Scanner;

public class UpperBound {

    void Bound() {

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

        int a = 0;

        System.out.print("Lower bound is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        UpperBound a = new UpperBound();
        a.Bound();
    }
}
