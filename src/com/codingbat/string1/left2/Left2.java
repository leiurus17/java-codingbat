package com.codingbat.string1.left2;

public class Left2 {

    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }

    private static String left2(String str) {
        return str.substring(2).concat(str.substring(0,2));
    }
}
