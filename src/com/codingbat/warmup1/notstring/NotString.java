package com.codingbat.warmup1.notstring;

public class NotString {

    public static void main(String[] args) {

    }

    private static String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }

        return "not " + str;
    }
}
