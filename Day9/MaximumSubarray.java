package com.mycompany.day9;

import java.util.Scanner;

public class MaximumSubarray {

    void FindMaxSum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (currentSum + arr[i] > arr[i]) {
                currentSum = currentSum + arr[i];
            } else {
                currentSum = arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        MaximumSubarray a = new MaximumSubarray();
        a.FindMaxSum();
    }
}