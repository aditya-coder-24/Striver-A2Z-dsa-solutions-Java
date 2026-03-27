package com.mycompany.day13;

public class RowWithMax1 {
    
    int count(int[][] arr) {
        
        int ans = -1;
        int MaxCount = 0;
        int n = arr.length;
        int m = arr[0].length;
        
        for (int i = 0; i < n; i++) {
            int OneCount = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    OneCount++;
                }
            }
            
            if (OneCount > MaxCount) {
                MaxCount = OneCount;
                ans = i;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {0, 0, 1}, {0, 0, 0}};
        RowWithMax1 a = new RowWithMax1();
        System.out.println(a.count(arr) + " ");
        
    }
}
