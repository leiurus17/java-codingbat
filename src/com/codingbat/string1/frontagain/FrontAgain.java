package com.codingbat.string1.frontagain;

public class FrontAgain {

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }

    private static boolean frontAgain(String str) {
        return str.length() < 2 ? false : str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2));
    }

}
