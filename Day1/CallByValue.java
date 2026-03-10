package com.mycompany.Day1;

import java.util.Scanner;

public class CallByValue {

    void ByValue(int n) {
        
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        
        CallByValue val = new CallByValue();
        val.ByValue(n);
    }
}
