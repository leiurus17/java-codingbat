package com.codingbat.string1.nonstart;

public class NonStart {

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }

    private static String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }
}
