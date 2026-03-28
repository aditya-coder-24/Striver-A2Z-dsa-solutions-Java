package com.mycompany.day14;

public class LargestOddNumber {

    String Search(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            if ((ch - '0') % 2 != 0) {
                System.out.println(str.substring(0, i + 1));
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "52";

        LargestOddNumber a = new LargestOddNumber();
        a.Search(str);
    }
}
