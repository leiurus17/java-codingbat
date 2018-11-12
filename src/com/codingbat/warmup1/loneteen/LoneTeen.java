package com.codingbat.warmup1.loneteen;

public class LoneTeen {

    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }

    private static boolean loneTeen(int a, int b) {
        // ^ is exclusive OR
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
    }
}
