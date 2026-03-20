package com.mycompany.day10;

import java.util.*;

public class MergeIntervals {

    void Merge() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        System.out.println("Enter intervals:");
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int start = arr[0][0];
        int end = arr[0][1];

        System.out.println("Merged intervals:");

        for (int i = 1; i < n; i++) {

            if (arr[i][0] <= end) {
                if (arr[i][1] > end) {
                    end = arr[i][1];
                }
            } else {
                System.out.println(start + " " + end);
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        System.out.println(start + " " + end);
    }

    public static void main(String[] args) {
        MergeIntervals a = new MergeIntervals();
        a.Merge();
    }
}
