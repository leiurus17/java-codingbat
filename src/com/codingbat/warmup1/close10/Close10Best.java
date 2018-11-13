package com.codingbat.warmup1.close10;

public class Close10Best {

    public static void main(String[] args) {
        System.out.println(close10(8,13));
        System.out.println(close10(13,8));
        System.out.println(close10(13,7));
    }

    private static int close10(int a, int b) {
        int aDistance = Math.abs(a - 10);
        int bDistance = Math.abs(b - 10);

        if (aDistance < bDistance) {
            return a;
        }
        if (aDistance > bDistance) {
            return b;
        }

        return 0;
    }
}
