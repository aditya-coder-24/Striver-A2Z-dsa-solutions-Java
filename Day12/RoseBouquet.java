package com.mycompany.day12;

import java.util.Scanner;

public class RoseBouquet {

    int findMax(int arr[], int n) {

        int max = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    int findMin(int arr[], int n) {

        int min = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] < min)
                min = arr[i];
        }

        return min;
    }

    boolean canMake(int arr[], int n, int day, int m, int k) {

        int count = 0;
        int bouquet = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] <= day) {
                count++;
            } else {
                bouquet += count / k;
                count = 0;
            }
        }

        bouquet += count / k;

        return bouquet >= m;
    }

    void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of roses: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter blooming days:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter bouquets needed: ");
        int m = sc.nextInt();

        System.out.print("Enter roses per bouquet: ");
        int k = sc.nextInt();

        if (m * k > n) {
            System.out.println(-1);
            return;
        }

        int start = findMin(arr, n);
        int end = findMax(arr, n);
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (canMake(arr, n, mid, m, k)) {

                ans = mid;
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }

        System.out.println("Minimum days: " + ans);
    }

    public static void main(String[] args) {

        RoseBouquet obj = new RoseBouquet();
        obj.solve();
    }
}