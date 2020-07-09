package com.albi.helpful.npe;

public class App {
    public static void main(String[] args) {
        String test = "test string";

        printCharFromStringAt(test, 3);
        printCharFromStringAt(test, 1);

        test = null;

        printCharFromStringAt(test, 0);
    }

    public static void printCharFromStringAt(String text, int index) {
        System.out.println(text.charAt(index));
    }
}
