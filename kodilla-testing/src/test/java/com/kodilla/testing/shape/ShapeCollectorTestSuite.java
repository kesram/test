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
        void testAddFigure() {
            //Given
            Circle circle = new Circle();
            ShapeCollector test = new ShapeCollector();
            //When
            test.addFigure(circle);
            //Then
            Assertions.assertEquals(1, test.getShapes().size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            Square square = new Square();
            ShapeCollector test = new ShapeCollector();
            test.addFigure(square);
            //When
            test.removeFigure(square);
            //Then
            Assertions.assertEquals(0, test.getShapes().size());
        }

        @Test
        void testGetFigure() {
            //Given
            Triangle triangle = new Triangle();
            ShapeCollector test = new ShapeCollector();
            test.addFigure(triangle);
            //When
            test.getFigure(0);
            //Then
            Assertions.assertEquals(triangle, test.getFigure(0));
        }

        @Test
        void testShowFigures() {
            //Given
            Triangle triangle = new Triangle();
            Square square = new Square();
            Circle circle = new Circle();
            ShapeCollector test = new ShapeCollector();
            //When
            String result = circle.getShapeName() + square.getShapeName() + triangle.getShapeName();
            //Then
            Assertions.assertEquals("CircleSquareTriangle", result);
        }
}
