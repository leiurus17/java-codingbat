package com.codingbat.warmup2.array667;

public class Array667 {

    public static void main(String[] args) {
        System.out.println(array667(new int[]{6,6,2}));
        System.out.println(array667(new int[]{6,6,2,6}));
        System.out.println(array667(new int[]{6,7,2,6}));
    }

    private static int array667(int[] nums) {
        int sixSixSeven = 0;

        for (int x = 0; x < nums.length-1; x++) {
            if((nums[x] == 6) && (nums[x+1] == 6 || nums[x+1] == 7)) {
                sixSixSeven++;
            }
        }

        return sixSixSeven;
    }
}
