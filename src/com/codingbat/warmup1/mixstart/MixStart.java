package com.codingbat.warmup1.mixstart;

public class MixStart {

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }

    private static boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1,3).equalsIgnoreCase("ix");
    }
}
