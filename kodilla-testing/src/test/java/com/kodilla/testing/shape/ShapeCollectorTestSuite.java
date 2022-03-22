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
        void testAddFigure(Shape shape) {
            //Given
            Circle circle = new Circle(2.5, "Circle1");
            ShapeCollector test = new ShapeCollector();
            //When
            test.addFigure(circle);
            //Then
            Assertions.assertEquals(1, test.getShapes().size());

        }

        @Test
        void testRemoveFigure(Shape shape) {
            //Given
            Triangle triangle = new Triangle(2,4,"Triangle1");
            Square square = new Square(4, "Square1");
            Circle circle = new Circle(2.3, "Circle");
            ShapeCollector test = new ShapeCollector();
            test.addFigure(square);
            //When
            test.removeFigure(square);
            //Then
            Assertions.assertEquals(0, test.getShapes().size());
        }

        @Test
        void testGetFigure(int n) {
            //Given
            Triangle triangle = new Triangle(3,5, "Triangle");
            Square square = new Square(3, "Square");
            Circle circle = new Circle(1.3, "Circle");
            ShapeCollector test = new ShapeCollector();
            test.addFigure(triangle);
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
