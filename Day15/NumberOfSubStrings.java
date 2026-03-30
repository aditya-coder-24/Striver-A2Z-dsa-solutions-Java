package com.mycompany.day15;

import java.util.HashMap;

public class NumberOfSubStrings {
    int Count(String s,int k){
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            count += (right - left + 1);
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        NumberOfSubStrings a =  new NumberOfSubStrings();
        a.Count(s, k);
    }
    
}
