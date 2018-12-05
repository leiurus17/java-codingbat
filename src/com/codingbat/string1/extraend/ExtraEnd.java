package com.codingbat.string1.extraend;

public class ExtraEnd {

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }

    private static String extraEnd(String str) {
        String last2 = str.substring(str.length()-2);

        return last2.concat(last2).concat(last2);
    }
}
