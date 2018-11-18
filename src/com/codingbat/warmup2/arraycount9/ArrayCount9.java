package com.codingbat.warmup2.arraycount9;

public class ArrayCount9 {

    public static void main(String[] args) {
        System.out.println(arrayCount9(new int[]{1, 2, 9}));
        System.out.println(arrayCount9(new int[]{1, 9, 9}));
        System.out.println(arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }

    private static int arrayCount9(int[] nums) {
        int count9 = 0;

        for (int x : nums) {
            if (x == 9) {
                count9++;
            }
        }

        return count9;
    }
}
