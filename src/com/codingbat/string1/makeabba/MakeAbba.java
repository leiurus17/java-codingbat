package com.codingbat.string1.makeabba;

public class MakeAbba {

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
    }

    private static String makeAbba(String a, String b) {
        return a.concat(b).concat(b).concat(a);
    }
}
