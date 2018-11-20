package com.codingbat.warmup2.stringx;

public class StringX {

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    private static String stringX(String str) {
        String stringX = "";

        for (int x = 0; x <= str.length()-1; x++) {
            if (x == 0) {
                stringX += str.charAt(x);
            } else if (x == str.length()-1) {
                stringX += str.charAt(x);
            } else if (!String.valueOf(str.charAt(x)).equalsIgnoreCase("x")) {
                stringX += str.charAt(x);
            }


        }

        return stringX;
    }
}
