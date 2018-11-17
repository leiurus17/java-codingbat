package com.codingbat.warmup2.stringsplosion;

public class StringSplosion {

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    private static String stringSplosion(String str) {
        String explodedString = "";

        for (int x = 0; x < str.length(); x++) {
            explodedString = explodedString + str.substring(0, x+1);
        }

        return explodedString;
    }
}
