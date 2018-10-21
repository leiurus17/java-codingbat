package com.codingbat.warmup1.diff21;

public class Diff21 {

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }

    public static int diff21(int n) {
        int difference = Math.abs(n - 21);

        if (n > 21) {
            return difference * 2;
        }

        else return difference;
    }
}
