package com.codingbat.string1.withoutx;

public class WithoutX {

    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }

    private static String withoutX(String str) {
        String stringX = str;

        if (str.length() <= 1) {
            return "";
        }

        if (str.substring(0,1).equalsIgnoreCase("x")) {
            stringX = str.substring(1);
        }

        if (str.substring(str.length()-1).equalsIgnoreCase("x")) {
            stringX = str.substring(0,str.length()-1);
        }

        if ((str.substring(0,1).equalsIgnoreCase("x") && str.substring(str.length()-1).equalsIgnoreCase("x"))) {
            stringX  = str.substring(1,str.length()-1);
        }

        return stringX;
    }
}
