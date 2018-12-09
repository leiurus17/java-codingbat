package com.codingbat.string1.atfirst;

public class AtFirst {

    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }

    private static String atFirst(String str) {
        if (str.length() == 0) {
            return "@@";
        } else if (str.length() == 1) {
            return str.concat("@");
        } else {
            return str.substring(0,2);
        }
    }
}
