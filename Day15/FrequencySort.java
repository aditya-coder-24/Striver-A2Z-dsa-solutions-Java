package com.mycompany.day15;

import java.util.HashMap;

public class FrequencySort {

    void Put(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        while (!map.isEmpty()) {

            char maxChar = ' ';
            int maxFreq = 0;

            for (char c : map.keySet()) {
                if (map.get(c) > maxFreq) {
                    maxFreq = map.get(c);
                    maxChar = c;
                }
            }

            result.append(maxChar);
            map.remove(maxChar);
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "tree";
        FrequencySort a = new FrequencySort();
        a.Put(str);
    }
}
