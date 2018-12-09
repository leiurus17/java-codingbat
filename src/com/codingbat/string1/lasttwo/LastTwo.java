package com.codingbat.string1.lasttwo;

public class LastTwo {

    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }

    private static String lastTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, str.length()-2).concat(str.substring(str.length()-1).concat(str.substring(str.length()-2,str.length()-1)));
    }
}
