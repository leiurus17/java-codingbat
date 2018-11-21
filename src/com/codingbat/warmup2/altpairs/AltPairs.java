package com.codingbat.warmup2.altpairs;

public class AltPairs {

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    private static String altPairs(String str) {
        String altString = "";

        for (int x = 0; x < str.length(); x+=4) {

            if ((str.length()-x) == 1) {
                altString += str.substring(x,x+1);
            } else {
                altString += str.substring(x,x+2);
            }
        }

        return altString;
    }
}
