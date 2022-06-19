package com.kodilla.patterns.factory;

public class ShapeFactory {

    public static final String Circle = "CIRCLE";
    public static final String Square = "SQUARE";
    public static final String Rectangle = "RECTANGLE";

    public final Shape makeShape(final String shapeClass){
        switch (shapeClass){
            case Circle:
                return new Circle("The rounded circle",4.50);
            case Square:
                return new Square("The angular square",7.0);
            case Rectangle:
                return new Rectangle("The long rectangle", 15.0,2.5);
            default:
                return null;
        }
    }
}
