package com.kodilla.testing.shape;

public class Square implements Shape{
    private double sideLength;
    private String name;

    public Square(double sideLength, String name) {
        this.sideLength = sideLength;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return getName();
    }

    @Override
    public double getField() {
        return getSideLength() * getSideLength();
    }

    public double getSideLength() {
        return sideLength;
    }

    public String getName() {
        return name;
    }
}
