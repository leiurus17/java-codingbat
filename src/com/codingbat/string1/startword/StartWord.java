package com.codingbat.string1.startword;

public class StartWord {

    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
    }

    private static String startWord(String str, String word) {
        if (str.length() < 1 || str.length() < word.length()) {
            return "";
        }

        if (str.substring(1,word.length()).equalsIgnoreCase(word.substring(1))) {
            return str.substring(0,word.length());
        }

        return "";
    }
}
