package com.codingbat.string1.seecolor;

public class SeeColor {

    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }

    //TODO I can still improve this
    private static String seeColor(String str) {
        if (str.length() < 3 || (!str.substring(0,3).equalsIgnoreCase("red") && str.length()==3)) {
            return "";
        } else if (str.substring(0,3).equalsIgnoreCase("red")) {
            return "red";
        } else if (str.substring(0,4).equalsIgnoreCase("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
