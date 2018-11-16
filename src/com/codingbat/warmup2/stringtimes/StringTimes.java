package com.codingbat.warmup2.stringtimes;

public class StringTimes {

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }

    private static String stringTimes(String str, int n) {

        String longString = "";

        for (int x = 0; x < n; x++) {
            longString = longString + str;
        }

        return longString;
    }
}
