package com.codingbat.warmup2.stringyak;

public class StringYakCheat {

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }

    private static String stringYak(String str) {
        return str.replaceAll("yak","");
    }
}
