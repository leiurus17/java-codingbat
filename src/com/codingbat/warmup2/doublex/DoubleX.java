package com.codingbat.warmup2.doublex;

public class DoubleX {

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxxx"));
    }

    private static boolean doubleX(String str) {
        boolean hasFirstDoubleX = false;

        for (int x = 0; x < str.length()-1; x++) {
            if (str.substring(x,x+1).equalsIgnoreCase("x")) {
                if (str.substring(x, x+2).equalsIgnoreCase("xx")) {
                    hasFirstDoubleX = true;
                }
                break;
            }

        }

        return hasFirstDoubleX;
    }
}
