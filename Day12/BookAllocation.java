package com.mycompany.day12;

import java.util.Scanner;

public class BookAllocation {

    int findMax(int arr[], int n) {

        int max = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    int findSum(int arr[], int n) {

        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];
        }

        return sum;
    }

    boolean canSplit(int arr[], int n, int k, int maxSum) {

        int subarray = 1;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {

            if (currentSum + arr[i] <= maxSum) {

                currentSum += arr[i];
            } else {

                subarray++;
                currentSum = arr[i];
            }
        }

        return subarray <= k;
    }

    void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int start = findMax(arr, n);
        int end = findSum(arr, n);
        int ans = end;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (canSplit(arr, n, k, mid)) {

                ans = mid;
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }

        System.out.println("Minimum largest sum: " + ans);
    }

    public static void main(String[] args) {

        BookAllocation obj = new BookAllocation();
        obj.solve();
    }
}