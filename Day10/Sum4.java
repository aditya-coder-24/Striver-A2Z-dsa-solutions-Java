package com.mycompany.day10;

import java.util.Scanner;

public class Sum4 {

    void Sort() {
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
                for (int k = j + 1; k < arr.length; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l]);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Sum4 a = new Sum4();
        a.Sort();
    }
}
