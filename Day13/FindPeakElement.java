package com.mycompany.day13;

public class FindPeakElement {

    void Search(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int count = 0;

                if (j - 1 >= 0 && arr[i][j] > arr[i][j - 1]) {
                    count++;
                }

                if (j + 1 < m && arr[i][j] > arr[i][j + 1]) {
                    count++;
                }

                if (i - 1 >= 0 && arr[i][j] > arr[i - 1][j]) {
                    count++;
                }

                if (i + 1 < n && arr[i][j] > arr[i + 1][j]) {
                    count++;
                }

                if (count == 4) {
                    System.out.println("Peak Element: " + arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 32}
        };

        FindPeakElement a = new FindPeakElement();
        a.Search(arr);
    }
}
