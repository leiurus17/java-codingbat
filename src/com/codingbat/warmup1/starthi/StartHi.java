package com.codingbat.warmup1.starthi;

public class StartHi {

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }

    private static boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }

        return str.substring(0,2).equalsIgnoreCase("hi");
    }
}
