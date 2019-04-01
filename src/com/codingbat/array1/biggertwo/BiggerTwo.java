package com.codingbat.array1.biggertwo;

public class BiggerTwo {

    public static void main(String[] args) {
        System.out.println(biggerTwo(new int[] {1, 2}, new int[] {3, 4}));
        System.out.println(biggerTwo(new int[] {3, 4}, new int[] {1, 2}));
        System.out.println(biggerTwo(new int[] {1, 1}, new int[] {1, 2}));
    }

    private static int[] biggerTwo(int[] a, int[] b) {

        if (a[0] + a[1] >= b[0] + b[1]) {
            return a;
        } else {
            return b;
        }
    }
}
