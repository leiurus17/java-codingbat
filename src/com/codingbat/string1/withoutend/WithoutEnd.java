package com.codingbat.string1.withoutend;

public class WithoutEnd {

    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println("coding");
    }

    private static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }
}
