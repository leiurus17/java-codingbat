package com.codingbat.string1.theend;

public class TheEnd {

    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
    }

    private static String theEnd(String str, boolean front) {
        return front ? str.substring(0,1) : str.substring(str.length()-1);
    }
}
