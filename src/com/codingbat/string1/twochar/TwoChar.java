package com.codingbat.string1.twochar;

public class TwoChar {

    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }

    // FIXME there is a failing test
    private static String twoChar(String str, int index) {
        return index != 2 ? str.substring(0,2) : str.substring(index);
    }
}
