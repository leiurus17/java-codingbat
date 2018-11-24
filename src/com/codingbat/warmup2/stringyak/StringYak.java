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

        // FIXME

        for (int x = 0; x < str.length(); ) {
            if (str.substring(x, x+3).equalsIgnoreCase(yak) || (str.length() - x) > 3) {
                x+=3;
            } else {
                newString += str.substring(x,x+1);
                x++;
            }
            System.out.println(newString);
        }
        return newString;
    }
}
