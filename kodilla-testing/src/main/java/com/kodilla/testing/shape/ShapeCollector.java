package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();
    private Triangle triangle = new Triangle(2,4, "tr1");
    private Square square = new Square(2.4, "kwadrat1");
    private Circle circle = new Circle(4, "kolo10");

    public ShapeCollector() {
    }

    public void addFigure(List<Shape> shape){
        //Circle circle = new Circle(5, "kolo6");
        //List<Shape> shape = new ArrayList<>();
        shape.add(circle);

    }
    public void removeFigure(Shape shape) {

    }

    public List<Shape> getFigure(int n){
        List<Shape> shapes = new ArrayList<>();

        return null;
    }

    public String showFigures(){
        Triangle triangle = new Triangle(3,5, "tr2");
        Square square = new Square(3, "kwadrat2");
        Circle circle = new Circle(7,"kolo8");
        String result = circle.getShapeName() + square.getShapeName() + triangle.getShapeName();
        return result;

    }
    public int getFigureQuantity(){
        //return 1;
        return shapes.size();
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public Circle getCircle() {
        return circle;
    }

    public Square getSquare() {
        return square;
    }

    public Triangle getTriangle() {
        return triangle;
    }
}
