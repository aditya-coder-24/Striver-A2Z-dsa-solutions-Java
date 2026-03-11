package com.mycompany.day2;

import java.util.Scanner;

public class StarPyramid {
    void rows(){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StarPyramid  a = new StarPyramid ();
        a.rows();
    }
}
