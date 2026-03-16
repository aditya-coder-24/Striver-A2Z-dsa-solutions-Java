package com.mycompany.day6;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayFrequencyCount {

    void Print() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
    public static void main(String[] args) {
        ArrayFrequencyCount a = new ArrayFrequencyCount();
        a.Print();
    }
}
