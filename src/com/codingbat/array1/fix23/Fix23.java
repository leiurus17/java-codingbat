package com.codingbat.array1.fix23;

public class Fix23 {

    public static void main(String[] args) {
        System.out.println(fix23(new int[] {1 ,2 ,3}));
        System.out.println(fix23(new int[] {2 ,3 ,5}));
        System.out.println(fix23(new int[] {1 ,2 ,1}));
    }

    private static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            return new int[]{nums[0], 0, nums[2]};
        } else if (nums[1] == 2 && nums[2] == 3) {
            return new int[]{nums[0], nums[1], 0};
        } else {
            return nums;
        }
    }
}
