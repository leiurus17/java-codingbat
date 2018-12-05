package com.codingbat.string1.combostring;

public class ComboString {

    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
    }

    private static String comboString(String a, String b) {
        String maxString = a.length() > b.length() ? a : b;
        String minString = a.length() < b.length() ? a : b;

        return minString.concat(maxString).concat(minString);
    }
}
