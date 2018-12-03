package com.codingbat.warmup2.has271;

public class Has271 {

    public static void main(String... args) {
        System.out.println(has271(new int[]{1,2,7,1}));
        System.out.println(has271(new int[]{1,2,8,1}));
        System.out.println(has271(new int[]{2,7,1}));
        System.out.println(has271(new int[]{2,7,4}));
        System.out.println(has271(new int[]{2,7,-1}));
        System.out.println(has271(new int[]{4,5,3,8,0}));
    }

    // GO UP FIGHTING MAROONS!
    // BATTLE OF KATIPUNAN!!

    private static boolean has271(int... nums) {
        for (int x = 0; x < nums.length -1; x++) {

            if ((nums[x] + 5 == nums[x+1]) && (Math.abs(Math.abs(nums[x] - 1) - nums[x+2]) <= 2)) {
                return true;
            }
        }

        return false;
    }
}
