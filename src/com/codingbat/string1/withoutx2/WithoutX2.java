package com.codingbat.string1.withoutx2;

public class WithoutX2 {

    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }

    private static String withoutX2(String str) {
        String stringX2 = str;

        if (str.length() <= 1) {
            return "";
        }

        if (str.substring(0,1).equalsIgnoreCase("x")) {
            stringX2 = str.substring(1);
        }

        if (str.substring(1,2).equalsIgnoreCase("x")) {
            stringX2 = str.substring(0,1).concat(str.substring(2));
        }

        if (str.substring(0,2).equalsIgnoreCase("xx")) {
            stringX2 = str.substring(2);
        }

        return stringX2;
    }
}
