package com.mycompany.day14;

public class LongestPrefix {

    String Search(String[] str) {
        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {

            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        System.out.println(prefix);
        return prefix;
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flight", "flow"};

        LongestPrefix a = new LongestPrefix();
        a.Search(str);
    }
}
