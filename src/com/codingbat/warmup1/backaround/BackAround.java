package com.codingbat.warmup1.backaround;

public class BackAround {

    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }

    private static String backAround(String str) {
        // Yehey! I also got the best solution
        String last = str.substring(str.length()-1);
        return last + str + last;
    }
}
