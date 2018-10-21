package com.codingbat.warmup1.makes10;

public class Makes10 {

    public static void main(String[] args) {
        System.out.println(makes10(9,10));
        System.out.println(makes10(9,9));
        System.out.println(makes10(1,9));
    }

    private static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }
}
