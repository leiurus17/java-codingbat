package com.codingbat.warmup2.fronttimes;

public class FrontTimes {

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("a", 4));
    }

    private static String frontTimes(String str, int n) {
        int indexValue = str.length() > 3 ? 3 : str.length();
        String subString = str.substring(0, indexValue);
        String longString = "";

        for (int x = 0; x < n; x++) {
            longString += subString;
        }

        return longString;
    }
}
