package com.codingbat.warmup2.stringyak;

public class StringYak {

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        //System.out.println(stringYak("pakyak"));
        //System.out.println(stringYak("yak123ya"));
    }

    private static String stringYak(String str) {
        String yak = "yak";
        String newString = "";
        int x = 0;

        while(x < str.length()-2) {
            // TODO Fix this
            System.out.println(str.substring(x, x+3));

            if (str.substring(x, x+3).equalsIgnoreCase(yak)) {
                x += 3;
            } else {
                newString += str.substring(x,x+1);
                x++;
            }
        }

        return newString;
    }
}
