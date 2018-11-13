package com.codingbat.warmup1.intmax;

public class IntMax {

    public static void main(String[] args) {
        System.out.println(intMax(1,2,3));
        System.out.println(intMax(1,3, 2));
        System.out.println(intMax(3, 2, 1));
    }

    private static int intMax(int a, int b, int c) {
        return Math.max(Math.max(a,b),c);
    }
}
