package com.codingbat.array1.commonend;

public class CommonEnd {

    public static void main(String[] args) {
        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2}));
        System.out.println(commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}));
    }

    private static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length-1] == b[b.length-1];
    }
}
