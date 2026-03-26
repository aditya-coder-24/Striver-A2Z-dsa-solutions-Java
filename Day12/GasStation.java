package com.mycompany.day12;

import java.util.Scanner;

public class GasStation {

    int requiredStations(int arr[], int n, double dist) {

        int count = 0;

        for (int i = 1; i < n; i++) {

            double gap = arr[i] - arr[i - 1];

            count += (int)(gap / dist);
        }

        return count;
    }

    void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stations: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter positions:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter new stations: ");
        int k = sc.nextInt();

        double start = 0;
        double end = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i] - arr[i - 1] > end)
                end = arr[i] - arr[i - 1];
        }

        double ans = end;

        while (end - start > 0.0001) {

            double mid = (start + end) / 2.0;

            int needed = requiredStations(arr, n, mid);

            if (needed > k) {
                start = mid;
            } else {
                ans = mid;
                end = mid;
            }
        }

        System.out.println("Minimum distance: " + ans);
    }

    public static void main(String[] args) {

        GasStation obj = new GasStation();
        obj.solve();
    }
}