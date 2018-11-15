package com.codingbat.warmup1.endup;

public class EndUp {

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }

    private static String endUp(String str) {
        int strLength = str.length();

        if (str.length() >= 3) {
            return str.replace(str.substring(strLength - 3, strLength),(str.substring(strLength - 3, strLength).toUpperCase()));
        } else {
            return str.substring(0, strLength).toUpperCase();
        }
    }
}
