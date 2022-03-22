package com.kodilla.testing.shape;

import com.sun.security.jgss.GSSUtil;

public class Circle implements Shape{
    private double radius;

    public Circle() {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI*getRadius()*getRadius();
    }

    public double getRadius() {
        return radius;
    }

}
