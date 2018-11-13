package com.codingbat.warmup1.startoz;

public class StartOz {

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }

    private static String startOz(String str) {

        if (str.length() == 1 && str.equalsIgnoreCase("o") || str.equalsIgnoreCase("")) {
            return str;
        } else {
            if (str.substring(0,2).equalsIgnoreCase("oz")) {
                return "oz";
            } else if (str.substring(0, 1).equalsIgnoreCase("o")) {
                return "o";
            } else if (str.substring(1, 2).equalsIgnoreCase("z")) {
                return "z";
            } else {
                return "";
            }
        }
    }
}
