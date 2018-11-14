package com.codingbat.warmup1.lastdigit;

public class LastDigit {

    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
        System.out.println(lastDigit(233323, 45532343));
    }

    public static boolean lastDigit(int a, int b) {

        while (a > 9) {
            a = a % 10;
        }

        while (b > 9) {
            b = b % 10;
        }

        return a == b;
    }
}
