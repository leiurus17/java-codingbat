package com.codingbat.string1.atfirst;

public class AtFirst {

    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }

    private static String atFirst(String str) {
        return str.length() < 2 ? str.concat("@") : str.substring(0,2);
    }
}
