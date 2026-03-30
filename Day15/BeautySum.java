package com.mycompany.day15;

public class BeautySum {

    void BeautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            int freq[] = new int[26];

            for (int j = i; j < n; j++) {

                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {

                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                totalBeauty += (max - min);
            }
        }

        System.out.println(totalBeauty);
    }
    public static void main(String[] args) {
        String s = "aabcb";
        BeautySum a = new BeautySum();
        a.BeautySum(s);
    }
}
