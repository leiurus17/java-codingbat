package com.codingbat.string1.twochar;

public class TwoChar {

    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
        System.out.println(twoChar("Hello", 1));
        System.out.println(twoChar("Hello", 3));
    }

    private static String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0) {
            return str.substring(0,2);
        } else {
            return str.substring(index, index + 2);
        }
    }
}
