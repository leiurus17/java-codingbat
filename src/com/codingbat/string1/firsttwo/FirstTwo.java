package com.codingbat.string1.firsttwo;

public class FirstTwo {

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
    }

    private static String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }
}
