package com.albi.helpful.npe;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        String notANullReference = "hi there";
        String aNullReference = null;

        printLength.accept(notANullReference);
        printLength.accept(aNullReference); // boom

        String anotherNotNullReference = "hello nulls";

        Stream.of(notANullReference, aNullReference, anotherNotNullReference)
                .forEach(printLength); // kaboom
    }

    private static Consumer<String> printLength = input ->
            System.out.printf("Length of string %s is %d%n", input, input.length());

}
