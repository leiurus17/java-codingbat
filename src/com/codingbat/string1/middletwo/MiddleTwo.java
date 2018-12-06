package com.codingbat.string1.middletwo;

public class MiddleTwo {

    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

    private static String middleTwo(String str) {
        int half = (str.length() / 2)-1;

        return str.substring(half, (str.length() - half));
    }
}
