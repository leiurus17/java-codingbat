package com.codingbat.string1.concat;

public class ConCat {

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }

    private static String conCat(String a, String b) {
        if (a.equalsIgnoreCase("") || b.equalsIgnoreCase("") || !a.substring(a.length()-1).equalsIgnoreCase(b.substring(0,1))) {
            return a.concat(b);
        } else {
            return a.concat(b.substring(1));
        }
    }
}
