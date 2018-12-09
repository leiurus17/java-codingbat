package com.codingbat.string1.endsly;

public class EndsLy {

    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }

    private static boolean endsLy(String str) {
        return str.length() < 2 ? false : str.substring(str.length()-2).equalsIgnoreCase("ly");
    }
}
