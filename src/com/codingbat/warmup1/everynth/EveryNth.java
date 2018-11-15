package com.codingbat.warmup1.everynth;

public class EveryNth {

    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        System.out.println(everyNth("abcdefg", 2));
        System.out.println(everyNth("abcdefg",3));
    }

    private static String everyNth(String str, int n) {
        String newString = "";

            for (int x = 0; x < str.length(); x = x+n) {
                newString = newString + String.valueOf(str.charAt(x));
            }

        return newString;
    }
}
