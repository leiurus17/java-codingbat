package com.codingbat.warmup2.array123;

public class Array123 {

    public static void main(String[] args) {
        System.out.println(array123(new int[] {1,1,2,3,1}));
        System.out.println(array123(new int[] {1,1,2,4,1}));
        System.out.println(array123(new int[] {1,1,2,1,2,3}));
    }

    private static boolean array123(int[] nums) {

        for (int x = 0; x < nums.length-2; x++) {

            if (nums[x] == 1 && nums[x+1] == 2 && nums[x+2] == 3) {
                return true;
            }
        }

        return false;
    }

}
