package com.codingbat.warmup1.front22;

public class Front22 {

    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
    }

    private static String front22(String str) {
        String front;

        if (str.equalsIgnoreCase("")) {
            return str;
        }
        else if (str.length() >= 2 ) {
            front = str.substring(0,2);
        } else {
            front = str.substring(0,1);
        }

        return front + str + front;
    }
}
