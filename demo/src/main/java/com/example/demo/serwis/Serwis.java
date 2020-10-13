package com.example.demo.serwis;

@org.springframework.stereotype.Service
public class Serwis {
    public String reverse(String stringToReverse) {

        int i=0;
        String reversed_word = "";

        for (i = stringToReverse.length() - 1; i >= 0; i--)
        {
            reversed_word = reversed_word + stringToReverse.charAt(i);
        }
        return reversed_word;
    }
}
