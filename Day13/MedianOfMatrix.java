package com.mycompany.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfMatrix {

    public int findMedian(int[][] matrix) {

        List<Integer> elements = new ArrayList<>();

        for (int[] row : matrix) {

            for (int val : row) {

                elements.add(val);
            }
        }

        Collections.sort(elements);

        int n = elements.size();
        return elements.get(n / 2);
    }

    public static void main(String[] args) {
        MedianOfMatrix a = new MedianOfMatrix();

        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };

        System.out.println(a.findMedian(matrix));
    }
}