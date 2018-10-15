package com.codingbat.warmup1;

public class SleepIn {

    // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    //
    // sleepIn(false, false) → true
    // sleepIn(true, false) → false
    // sleepIn(false, true) → true

    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // This is my stupid solution...
        if (!weekday && !vacation) {
            return true;
        } else if (weekday && !vacation) {
            return false;
        } else if (!weekday && vacation) {
            return true;
        }

        return true;
    }
}
