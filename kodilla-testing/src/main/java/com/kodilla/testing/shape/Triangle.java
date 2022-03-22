package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double height;
    private double sideLength;

    public Triangle() {
        this.height = height;
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return getSideLength()*getHeight()/2;
    }


    public double getHeight() {
        return height;
    }

    public double getSideLength() {
        return sideLength;
    }
}
