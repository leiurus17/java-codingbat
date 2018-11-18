package com.codingbat.warmup2.last2;

public class Last2 {

    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    // This problem is a bit hard to understand

    private static int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        String last2SubString = str.substring(str.length()-2);
        int counter = 0;

        for (int x = 0; x < str.length()-2; x++) {
            if (str.substring(x,x+2).equalsIgnoreCase(last2SubString)) {
                counter++;
            }
        }

        return counter;
    }
}
