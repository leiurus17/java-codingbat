package com.codingbat.array1.double23;

public class Double23 {

    public static void main(String[] args) {
        System.out.println(double23(new int[] {2, 2}));
        System.out.println(double23(new int[] {3, 3}));
        System.out.println(double23(new int[] {2, 3}));
    }

    private static boolean double23(int[] nums) {
        return nums.length == 2 && nums[0] == nums[1] && (nums[0] == 2 || nums[0] == 3);
    }
}
