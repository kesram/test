package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public List<Shape> getFigure(int n){
        shapes.get(n);
        return null;
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
