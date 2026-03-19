package com.mycompany.day9;

import java.util.Scanner;

public class SpiralMatrix {

    void PrintSpiral() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        System.out.print("Enter columns: ");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        System.out.print("Spiral Order: ");

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        SpiralMatrix a = new SpiralMatrix();
        a.PrintSpiral();
    }
}
