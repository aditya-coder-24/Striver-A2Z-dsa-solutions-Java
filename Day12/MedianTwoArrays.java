package com.mycompany.day12;

import java.util.Scanner;

public class MedianTwoArrays {

    static double findMedian(int arr1[], int arr2[], int m, int n) {

        if (m > n) {
            return findMedian(arr2, arr1, n, m);
        }

        int start = 0;
        int end = m;

        while (start <= end) {

            int cut1 = (start + end) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];

            int right1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (left1 <= right2 && left2 <= right1) {

                if ((m + n) % 2 == 0) {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                } else {
                    return Math.max(left1, left2);
                }
            } else if (left1 > right2) {
                end = cut1 - 1;
            } else {
                start = cut1 + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int arr1[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(findMedian(arr1, arr2, m, n));
    }
}
