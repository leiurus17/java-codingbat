package com.codingbat.warmup1.stringe;

public class StringE {

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }

    private static boolean stringE(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'e') {
                count++;
            }
        }
        return count >=1 && count <= 3;
    }
}
