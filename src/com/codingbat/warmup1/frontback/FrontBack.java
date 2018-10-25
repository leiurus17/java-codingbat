package com.codingbat.warmup1.frontback;

public class FrontBack {

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    private static String frontBack(String str) {
        if (str.equalsIgnoreCase(""))
            return str;

        char front = str.charAt(0);
        char back = str.charAt(str.length() - 1);

        String newString = "";

        for (int x = 0; x <= str.length()-1; x++) {
            if (x == 0) {
                newString = newString + back;
            } else if (x == str.length()-1) {
                newString = newString + front;
            } else {
                newString = newString + str.charAt(x);
            }
        }

        return newString;
    }
}
