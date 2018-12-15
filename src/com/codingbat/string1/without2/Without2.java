package com.codingbat.string1.without2;

public class Without2 {

    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }


    // This is an ugly solution
    private static String without2(String str) {
            if (str.length() <2) {
              return str;
            } else if (str.length() == 2) {
                return "";
            } else if (str.substring(0,2).equalsIgnoreCase(str.substring(str.length()-2))) {
                return str.substring(2);
            }

            return str;
    }
}
