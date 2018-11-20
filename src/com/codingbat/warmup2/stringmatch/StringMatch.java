package com.codingbat.warmup2.stringmatch;

public class StringMatch {

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz","xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

    private static int stringMatch(String a, String b) {
        int matchCount = 0;
        int loopCount = 0;

        while (loopCount < a.length()-1 && loopCount < b.length()-1) {
            if (a.substring(loopCount,loopCount+2).equalsIgnoreCase(b.substring(loopCount,loopCount+2))) {
                matchCount++;
            }

            loopCount++;
        }

        return matchCount;
    }
}
