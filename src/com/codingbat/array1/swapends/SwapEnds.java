package com.codingbat.array1.swapends;

public class SwapEnds {

    public static void main(String[] args) {
        System.out.println(swapEnds(new int[] {1, 2, 3 ,4}));
        System.out.println(swapEnds(new int[] {1, 2, 3}));
        System.out.println(swapEnds(new int[] {8, 6, 7, 9, 5}));

        for (int i: swapEnds(new int[] {1, 2, 3 ,4})){
            System.out.println(i);
        }
    }

    private static int[] swapEnds(int[] nums) {
        int[] newArray = nums.clone();

        newArray[0] = nums[nums.length-1];
        newArray[nums.length-1] = nums[0];

        return newArray;
    }
}
