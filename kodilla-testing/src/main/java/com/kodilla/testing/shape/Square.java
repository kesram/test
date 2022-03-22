package com.kodilla.testing.shape;

public class Square implements Shape{
    private double sideLength;

    public Square() {
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return getSideLength() * getSideLength();
    }

    public double getSideLength() {
        return sideLength;
    }

}
