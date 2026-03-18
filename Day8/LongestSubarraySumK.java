package com.mycompany.day8;

import java.util.Scanner;

public class LongestSubarraySumK {

    void Find() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array (positive numbers): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < n; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                }
            }
        }

        System.out.println("Longest subarray length: " + maxLen);
    }

    public static void main(String[] args) {
        LongestSubarraySumK obj = new LongestSubarraySumK();
        obj.Find();
    }
}
