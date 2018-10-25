package com.codingbat.warmup1.front3;

public class FrontThree {

    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
    }

    private static String front3(String str) {
        if (!str.equalsIgnoreCase("")) {
            int charIndex = 3;
            String three = "";

            if (str.length() < 2) {
                charIndex = 1;
            } else if (str.length() < 3) {
                charIndex = 2;
            }

            three = str.substring(0,charIndex);

            return three + three + three;
        }

        return str;
    }
}
