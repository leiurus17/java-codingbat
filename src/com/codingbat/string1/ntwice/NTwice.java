package com.codingbat.string1.ntwice;

public class NTwice {

    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }

    private static String nTwice(String str, int n) {
        return str.substring(0,n).concat(str.substring(str.length()-n));
    }
}
