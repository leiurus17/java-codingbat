package com.codingbat.warmup1.lastdigit;

public class LastDigitBest {

    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
        System.out.println(lastDigit(233323, 45532343));
    }

    private static boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }
}
