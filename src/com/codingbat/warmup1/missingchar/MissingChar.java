package com.codingbat.warmup1.missingchar;

public class MissingChar {

    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
        System.out.println(missingChar("kitten", 0));
        System.out.println(missingChar("kitten", 4));
    }

    private static String missingChar(String str, int n) {
        char[] stringArray = str.toCharArray();
        String finalString = "";
        for (int x = 0; x < stringArray.length; x++) {
            if (x == n) {
                continue;
            }

            finalString = finalString + stringArray[x];
        }

        return finalString;
    }

}
