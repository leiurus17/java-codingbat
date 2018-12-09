package com.codingbat.string1.hasbad;

public class HasBad {

    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }

    private static boolean hasBad(String str) {
        if (str.length() <= 3 && !str.equalsIgnoreCase("bad")) {
            return false;
        } else if (str.substring(0,3).equalsIgnoreCase("bad") ||
            str.substring(1,4).equalsIgnoreCase("bad")) {
            return true;
        } else {
            return false;
        }
    }
}
