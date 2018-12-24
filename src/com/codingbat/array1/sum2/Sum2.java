package com.codingbat.array1.sum2;

public class Sum2 {

    public static void main(String[] args) {
        System.out.println(sum2(new int[] {1, 2, 3}));
        System.out.println(sum2(new int[] {1, 1}));
        System.out.println(sum2(new int[] {1, 1, 1, 1}));
    }

    private static int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length < 2) {
            return nums[nums.length-1];
        } else {
            return nums[0] + nums[1];
        }
    }
}
