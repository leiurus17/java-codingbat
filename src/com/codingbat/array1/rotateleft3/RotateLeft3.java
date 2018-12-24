package com.codingbat.array1.rotateleft3;

public class RotateLeft3 {

    public static void main(String[] args) {
        System.out.println(rotateLeft3(new int[] {1, 2, 3}));
        System.out.println(rotateLeft3(new int[] {5, 11, 9}));
        System.out.println(rotateLeft3(new int[] {0, 0, 7}));
    }

    private static int[] rotateLeft3(int[] nums) {
        return new int[] {nums[0+1], nums[nums.length-1], nums[0]};
    }
}
