package com.codingbat.warmup2.arrayfront9;

public class ArrayFront9 {

    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    private static boolean arrayFront9(int[] nums) {
        int counter = 1;
        boolean has9InFirst4 = false;

        for (int x : nums) {

            if (x == 9) {
                has9InFirst4 = true;
            }

            if (counter == 4) {
                break;
            }

            counter++;
        }

        return has9InFirst4;
    }
}
