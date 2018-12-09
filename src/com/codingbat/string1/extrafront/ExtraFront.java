package com.codingbat.string1.extrafront;

public class ExtraFront {

    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }

    private static String extraFront(String str) {
        String extra = str.length() < 2 ? str : str.substring(0,2);

        return extra.concat(extra).concat(extra);
    }
}
