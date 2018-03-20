package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {

    private String name;
    private double radius;

    public Circle(String name, double radius){
        this.name = name;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return pow(radius, 2) * Math.PI * 0.5;
    }
}
