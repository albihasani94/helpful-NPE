package com.albi.helpful.npe;

import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        String notANullReference = "hi there";
        String aNullReference = null;

        printLength.accept(notANullReference);
        printLength.accept(aNullReference); // boom

        var firstPerson = new Person("Albi", 26);
        var secondPerson = new Person(null, 100);

        printNameLength.accept(firstPerson);
        printNameLength.accept(secondPerson);

        Person thirdPerson = null;

        printNameLength.accept(thirdPerson);
    }
    private static Consumer<String> printLength = input ->
            System.out.printf("Length of string %s is %d%n", input, input.length());

    private static Consumer<Person> printNameLength = person ->
            System.out.printf("Length of name for person %s is %s", person.name, person.name.length());

    record Person(String name, int age) {
    }

}
