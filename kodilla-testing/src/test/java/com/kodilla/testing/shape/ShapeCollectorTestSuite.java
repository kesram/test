package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;



public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

        @Test
        void testAddFigure(List<Shape> shape) {
            //Given
            Circle circle = new Circle(2.5, "koło1");
            ShapeCollector test = new ShapeCollector();
            //When
            test.addFigure((List<Shape>) circle);
            //Then
            Assertions.assertEquals(1, test.getFigureQuantity());

        }

        @Test
        void testRemoveFigure(Shape shape) {
            //Given
            Triangle triangle = new Triangle(2,4,"tr3");
            Square square = new Square(4, "kwadrat3");
            Circle circle = new Circle(2.3, "kolo2");
            ShapeCollector test = new ShapeCollector();
            test.addFigure((List<Shape>) square);
            //When
            test.removeFigure(square);
            //Then
            Assertions.assertEquals(0, test.getFigureQuantity());
        }

        @Test
        void testGetFigure(int n) {
            //Given
            Triangle triangle = new Triangle(3,5, "tr4");
            Square square = new Square(3, "kwadrat4");
            Circle circle = new Circle(1.3, "kolo3");
            ShapeCollector test = new ShapeCollector();
            test.addFigure((List<Shape>) triangle);
            //When
            List<Shape> result = test.getFigure(0);
            //Then
            Assertions.assertEquals(triangle, result);
        }

        @Test
        void testShowFigures() {
            //Given
            Triangle triangle = new Triangle(5,3,"Triangle");
            Square square = new Square(5.5, "Square");
            Circle circle = new Circle(4, "Circle");
            ShapeCollector test = new ShapeCollector();
            //When
            String result = circle.getName() + square.getName() + triangle.getName();
            //Then
            Assertions.assertEquals("CircleSquareTriangle", result);
        }
}
