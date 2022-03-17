package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Circle> circle = new ArrayList<>();
    private List<Square> square = new ArrayList<>();
    private List<Triangle> triangle = new ArrayList<>();

    public ShapeCollector(List<Circle> circle, List<Square> square, List<Triangle> triangle) {
        this.circle = circle;
        this.square = square;
        this.triangle = triangle;
    }

    public void addFigure(Shape shape){

    }
    public void removeFigure(Shape shape) {

    }
    public int getFigure(int n){
        return 10;
    }
    public void showFigures(){

    }
    public int getFigureQuantity(int i){
        return 10;
    }
}
