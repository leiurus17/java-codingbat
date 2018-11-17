package com.codingbat.warmup2.stringbits;

public class StringBits {

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    private static String stringBits(String str) {
        String newString = "";

        for (int x = 0; x <= str.length()-1; x++) {
            if (x % 2 == 0) {
                newString += str.substring(x,x+1);
            }
        }

        return newString;
    }
}
