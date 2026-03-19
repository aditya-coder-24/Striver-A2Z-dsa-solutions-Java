package com.mycompany.day9;

import java.util.Scanner;

public class Sum2 {

    void Sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        System.out.println("The indices of elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sum2 a = new Sum2();
        a.Sum();
    }
}
