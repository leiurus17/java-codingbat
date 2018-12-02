package com.codingbat.string1.helloname;

public class HelloName {

    public static void main(String[] args) {
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
    }

    // TODO finish first all the Warmup-2 problems
    // Just to commit something.

    private static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
