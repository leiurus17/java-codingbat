package com.codingbat.warmup1.deldel;

public class DelDel {

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    private static String delDel(String str) {
        if (str.length() > 3 && str.substring(1,4).equalsIgnoreCase("del")) {
            return str.replace("del", "");
        }

        return str;
    }
}
