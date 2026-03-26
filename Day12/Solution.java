package com.mycompany.day12;

import java.util.*;

public class Solution {

    public static int countStudents(int[] arr, int pages) {
        int students = 1;
        long pagesStudent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }

    public static int findPages(int[] arr, int n, int m) {
  
        if (m > n) {
            return -1;
        }

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (countStudents(arr, mid) <= m) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        System.out.println("The minimum of maximum pages is: " + findPages(arr, arr.length, m));
    }
}
