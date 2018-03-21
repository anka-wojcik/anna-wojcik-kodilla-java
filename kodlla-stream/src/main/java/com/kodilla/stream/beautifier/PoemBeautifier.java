package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator beautifier){
        String result = beautifier.decorate(text);
        System.out.println(result);
    }

}
