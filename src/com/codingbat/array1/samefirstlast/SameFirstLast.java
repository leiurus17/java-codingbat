package com.codingbat.array1.samefirstlast;

public class SameFirstLast {

    public static void main(String[] args) {
        System.out.println(sameFirstLast(new int[] {1, 2, 3}));
        System.out.println(sameFirstLast(new int[] {1, 2, 3, 1}));
        System.out.println(sameFirstLast(new int[] {1, 2, 1}));
    }

    public static boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length-1];
    }
}
