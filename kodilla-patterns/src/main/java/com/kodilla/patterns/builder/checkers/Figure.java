package com.kodilla.patterns.builder.checkers;

public class Figure {
    public static final String WHITE = "WHITE";
    public static final String BLACK = "BLACK";
    final private String colour;

    public Figure(String colour) {
        if (colour.equals(WHITE) || colour.equals(BLACK)) {
            this.colour = colour;
        } else {
            throw new IllegalStateException("Figures of checkers should be BLACK or WHITE!");
        }
    }

    public String getColour() {
        return colour;
    }
}
