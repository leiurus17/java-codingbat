package com.codingbat.string1.defront;

public class DeFront {

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }

    private static String deFront(String str) {
        String finalString = "";

        if (str.length() < 1 || str.equalsIgnoreCase("")) {
            return str;
        }

        if (!str.substring(0,2).equalsIgnoreCase("ab")) {
            finalString =  str.substring(2);
        }

        if (str.substring(0,1).equalsIgnoreCase("a")) {
            finalString = str.substring(0,1).concat(str.substring(2));
        }

        if (str.substring(1,2).equalsIgnoreCase("b")) {
            finalString = str.substring(1,2).concat(str.substring(2));
        }

        if (str.substring(0,2).equalsIgnoreCase("ab")) {
            finalString = str;
        }

        return finalString;
    }
}
