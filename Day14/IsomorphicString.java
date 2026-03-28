package com.mycompany.day14;

public class IsomorphicString {

    boolean Check(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length(); j++) {

                if (str1.charAt(i) == str1.charAt(j)
                        && str2.charAt(i) != str2.charAt(j)) {
                    count++;
                    return false;
                }

                if (str1.charAt(i) != str1.charAt(j)
                        && str2.charAt(i) == str2.charAt(j)) {
                    count++;
                    return false;
                }
            }
        }

        if (count == 0) {
            System.out.println("Yes, it's an isomorphic string");
        }

        return true;
    }

    public static void main(String[] args) {

        String str1 = "odd";
        String str2 = "addl";

        IsomorphicString a = new IsomorphicString();
        a.Check(str1, str2);
    }
}
