package com.codingbat.string1.lastchars;

public class LastChars {

    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }

    private static String lastChars(String a, String b) {
        String last1 = a.length() == 0 ? "@" : a.substring(0,1);
        String last2 = b.length() == 0 ? "@" : b.substring(b.length()-1);

        return last1.concat(last2);
    }
}
