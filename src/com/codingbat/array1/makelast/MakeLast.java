package com.codingbat.array1.makelast;

public class MakeLast {

    public static void main(String[] args) {
        System.out.println(makeLast(new int[] {4, 5, 6}));
        System.out.println(makeLast(new int[] {1, 2}));
        System.out.println(makeLast(new int[] {3}));
    }

    // TODO implement
    private static int[] makeLast(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        newNums[newNums.length-1] = nums[nums.length-1];

        return newNums;
    }
}
