package com.mycompany.day12;

import java.util.Scanner;

public class KokoBanana {

    int findMax(int arr[], int n) {

        int max = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    int totalHours(int arr[], int n, int k) {

        int hours = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % k == 0)
                hours += arr[i] / k;
            else
                hours += (arr[i] / k) + 1;
        }

        return hours;
    }

    void solve() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter piles:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        int start = 1;
        int end = findMax(arr, n);
        int ans = end;

        while (start <= end) {

            int mid = (start + end) / 2;

            int hours = totalHours(arr, n, mid);

            if (hours <= h) {

                ans = mid;
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }

        System.out.println("Minimum bananas per hour: " + ans);
    }

    public static void main(String[] args) {

        KokoBanana obj = new KokoBanana();
        obj.solve();
    }
}