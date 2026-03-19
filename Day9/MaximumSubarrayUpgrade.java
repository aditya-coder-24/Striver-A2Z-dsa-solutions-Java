package com.mycompany.day9;

import java.util.Scanner;

public class MaximumSubarrayUpgrade {

    void FindMaxSubarray() {
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

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;
            } else {
                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);

        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        MaximumSubarrayUpgrade a = new MaximumSubarrayUpgrade();
        a.FindMaxSubarray();
    }
}
