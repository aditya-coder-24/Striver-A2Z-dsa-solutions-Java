package com.mycompany.day10;

import java.util.Scanner;

public class MajorityElement2 {

    void Sort() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > (arr.length / 3)) {
                System.out.print("Major element: " + arr[i]);
                return;
            }
        }

        System.out.print("No Majority Element");
    }

    public static void main(String[] args) {
        MajorityElement2 a = new MajorityElement2();
        a.Sort();
    }
}