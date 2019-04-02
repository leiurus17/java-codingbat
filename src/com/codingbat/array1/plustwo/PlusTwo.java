package com.codingbat.array1.plustwo;

public class PlusTwo {

    public static void main(String[] args) {
        System.out.println(plusTwo(new int[] {1, 2}, new int[] {3, 4}));
        System.out.println(plusTwo(new int[] {4, 4}, new int[] {2, 2}));
        System.out.println(plusTwo(new int[] {9 ,2}, new int[] {3, 4}));
    }

    private static int[] plusTwo(int[] a, int[] b) {
        return new int[] {a[0], a[1], b[0], b[1]};
    }
}
