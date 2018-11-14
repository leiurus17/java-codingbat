package com.codingbat.warmup1.max1020;

public class Max1020 {

    public static void main(String[] args) {
        System.out.println(max1020(11,19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
    }

    private static int max1020(int a, int b) {
        int maxInt = Math.max(a,b);
        int minInt = Math.min(a,b);

        if (maxInt >= 10 && maxInt <= 20) {
            return maxInt;
        } else if (minInt >= 10 && minInt <= 20) {
            return minInt;
        }

        return 0;
    }
}
