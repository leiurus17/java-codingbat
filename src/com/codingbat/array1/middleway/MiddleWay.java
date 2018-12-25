package com.codingbat.array1.middleway;

public class MiddleWay {

    public static void main(String[] args) {
        System.out.println(middleWay(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
        System.out.println(middleWay(new int[] {7, 7, 7}, new int[] {3, 8, 0}));
        System.out.println(middleWay(new int[] {5, 2, 9}, new int[] {1, 4, 5}));
    }

    private static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
}
