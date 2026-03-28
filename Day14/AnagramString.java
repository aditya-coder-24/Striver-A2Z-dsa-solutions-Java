package com.mycompany.day14;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    void Anagram() {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        AnagramString a = new AnagramString();
        a.Anagram();
    }
}
