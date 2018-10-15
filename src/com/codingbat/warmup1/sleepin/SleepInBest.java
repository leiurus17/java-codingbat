package com.codingbat.warmup1.sleepin;

public class SleepInBest {

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // Best solution. I must practice to achieve the level of thinking like this!
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}
