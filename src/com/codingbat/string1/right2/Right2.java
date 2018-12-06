package com.codingbat.string1.right2;

public class Right2 {

    public static void main(String[] args) {
        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));
    }

    private static String right2(String str) {
        return str.length() <=2 ? str : str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
    }
}
