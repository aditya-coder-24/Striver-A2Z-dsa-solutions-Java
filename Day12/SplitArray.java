package com.mycompany.day12;

import java.util.Scanner;

public class SplitArray {

    static boolean possible(int arr[], int n, int k, int maxSum) {

        int count = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (sum + arr[i] <= maxSum) {
                sum += arr[i];
            } else {
                count++;
                sum = arr[i];
            }
        }

        return count <= k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        int max = 0;
        int total = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int start = max;
        int end = total;
        int ans = total;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (possible(arr, n, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Minimum Largest Sum: " + ans);
    }
}
