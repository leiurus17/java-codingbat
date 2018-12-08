package com.codingbat.string1.middlethree;

public class MiddleThree {

    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }

    private static String middleThree(String str) {
        int middle = (str.length() / 2);

        return str.substring(middle-1, middle+2);
    }
}
