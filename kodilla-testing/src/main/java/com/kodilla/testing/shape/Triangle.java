package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private double base;
    private double height;

    public Triangle(String name, double base, double height){
        this.name = name;
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return 0.5 * base * height;
    }
}
