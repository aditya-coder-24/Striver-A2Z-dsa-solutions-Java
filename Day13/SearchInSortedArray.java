package com.mycompany.day13;

import java.util.Scanner;

public class SearchInSortedArray {

    boolean Search(int[][] arr) {

        System.out.print("Enter target element: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        SearchInSortedArray a = new SearchInSortedArray();
        a.Search(arr);
    }
}
