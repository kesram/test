package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private double height;
    private double sideLength;
    private String name;

    public Triangle(double height, double sideLength, String name) {
        this.height = height;
        this.sideLength = sideLength;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return getName();
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

    public String getName() {
        return name;
    }

}
