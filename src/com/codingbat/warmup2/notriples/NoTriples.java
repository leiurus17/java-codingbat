package com.codingbat.warmup2.notriples;

public class NoTriples {

    public static void main(String[] args) {
        System.out.println(noTriples(new int[]{1,1,2,2,1}));
        System.out.println(noTriples(new int[]{1,1,2,2,2,1}));
        System.out.println(noTriples(new int[]{1,1,1,2,2,2,1}));
        System.out.println(noTriples(new int[]{1,1,1}));
    }

    private static boolean noTriples(int[] nums){

        if (nums.length == 3){
            return !(nums[0] == nums[0+1]) && (nums[0] ==  nums[0+2]);
        }

        for (int x = 0; x < nums.length-3; x++) {
            if((nums[x] == nums[x+1]) && (nums[x] ==  nums[x+2])) {
                return false;
            }
        }

        return true;
    }
}
