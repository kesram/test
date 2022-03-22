package com.kodilla.testing.shape;

import com.sun.security.jgss.GSSUtil;

public class Circle implements Shape{
    private double radius;
    private String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String getShapeName() {
        return getName();
    }

    @Override
    public double getField() {
        return Math.PI*getRadius()*getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }
}
