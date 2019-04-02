package com.codingbat.array1.makemiddle;

public class MakeMiddle {

    public static void main(String[] args) {
        System.out.println(makeMiddle(new int[] {1, 2, 3, 4}));
        System.out.println(makeMiddle(new int[] {7, 1, 2, 3, 4, 9}));
        System.out.println(makeMiddle(new int[] {1, 2}));
    }

    private static int[] makeMiddle(int[] nums) {
        int midCount = nums.length / 2;
        return new int[]{nums[midCount-1], nums[midCount]};
    }
}
