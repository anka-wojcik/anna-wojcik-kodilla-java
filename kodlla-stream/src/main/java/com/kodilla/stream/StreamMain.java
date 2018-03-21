package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;



public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream\n");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("This text has been changed to be in capital letters.", (text) -> text.toUpperCase() );
        poemBeautifier.beautify("This text has been changed to have stars before and after.", (text) -> "*** " + text + " ***");
        poemBeautifier.beautify("This text has been changed to remove all whitespaces.", (text) -> text.replaceAll("\\s+",""));
        poemBeautifier.beautify("This text has been changed to be wider.", (text) -> text.replaceAll(".", "$0 "));
    }
}
