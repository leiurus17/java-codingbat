package com.codingbat.string1.mincat;

public class MinCat {

    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }

    private static String minCat(String a, String b) {
        int min = Math.min(a.length(), b.length());

        return a.substring(a.length()-min).concat(b.substring(b.length()-min));
    }
}
