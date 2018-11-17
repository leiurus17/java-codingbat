package com.codingbat.warmup2.countxx;

public class CountXX {

    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    private static int countXX(String str) {
        int count = 0;

        for (int x = 0; x < str.length()-1; x++) {

            if (str.substring(x, x+2).equalsIgnoreCase("xx")) {
                count++;
            }
        }

        return count;
    }
}
