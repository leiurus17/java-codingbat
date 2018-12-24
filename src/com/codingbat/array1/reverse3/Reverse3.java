package com.codingbat.array1.reverse3;

public class Reverse3 {

    public static void main(String[] args) {
        System.out.println(reverse3(new int[] {1, 2, 3}));
        System.out.println(reverse3(new int[] {5, 11, 9}));
        System.out.println(reverse3(new int[] {7, 0, 0}));
    }

    private static int[] reverse3(int[] nums) {
        return new int[] {nums[nums.length-1], nums[0+1], nums[0]};
    }
}
