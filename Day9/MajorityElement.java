package com.mycompany.day9;

import java.util.Scanner;

public class MajorityElement {

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

            if (count > (arr.length / 2)) {
                System.out.print("Major element: " + arr[i]);
                return;
            }
        }

        System.out.print("No Majority Element");
    }

    public static void main(String[] args) {
        MajorityElement a = new MajorityElement();
        a.Sort();
    }
}