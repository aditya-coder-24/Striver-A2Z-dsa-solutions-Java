package com.mycompany.day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    void Reverse(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            words.add(word.toString());
        }

        Collections.reverse(words);

        System.out.println(String.join(" ", words));
    }
    public static void main(String[] args) {
        String s = "";
        ReverseWords a = new ReverseWords();
        a.Reverse(s);
    }
}
