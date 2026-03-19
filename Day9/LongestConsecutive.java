package com.mycompany.day9;

import java.util.Scanner;
import java.util.Arrays;

public class LongestConsecutive {

    void FindLongest() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int longest = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else if (arr[i] != arr[i - 1]) {
                count = 1;
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest Consecutive Length: " + longest);
    }

    public static void main(String[] args) {
        LongestConsecutive a = new LongestConsecutive();
        a.FindLongest();
    }
}
