package com.codingbat.warmup1.parrottrouble;

public class ParrotTrouble {

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
    }

    private static boolean parrotTrouble(boolean talking, int hour) {
        return ((hour < 7 || hour > 20) && talking);
    }
}
