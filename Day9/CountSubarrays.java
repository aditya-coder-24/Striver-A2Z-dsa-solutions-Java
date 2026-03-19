package com.mycompany.day9;

import java.util.Scanner;

public class CountSubarrays {

    void CountSubarraySum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum == target) {
                    count++;
                }
            }
        }

        System.out.println("Number of subarrays: " + count);
    }

    public static void main(String[] args) {
        CountSubarrays a = new CountSubarrays();
        a.CountSubarraySum();
    }
}