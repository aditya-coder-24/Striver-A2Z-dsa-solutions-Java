package com.mycompany.day12;

import java.util.Scanner;

public class SmallestDivisor {

    int findMax(int arr[], int n) {

        int max = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    int calculateSum(int arr[], int n, int divisor) {

        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % divisor == 0)
                sum += arr[i] / divisor;
            else
                sum += (arr[i] / divisor) + 1;
        }

        return sum;
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

        System.out.print("Enter threshold: ");
        int limit = sc.nextInt();

        int start = 1;
        int end = findMax(arr, n);
        int ans = end;

        while (start <= end) {

            int mid = (start + end) / 2;

            int sum = calculateSum(arr, n, mid);

            if (sum <= limit) {

                ans = mid;
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }

        System.out.println("Smallest divisor: " + ans);
    }

    public static void main(String[] args) {

        SmallestDivisor obj = new SmallestDivisor();
        obj.solve();
    }
}