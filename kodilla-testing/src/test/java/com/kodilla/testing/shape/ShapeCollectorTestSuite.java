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
    void testAddFigure(Shape shape){
        //Given
        List<Triangle> triangle = new ArrayList<>();
        List<Square> square = new ArrayList<>();
        List<Circle> circle = new ArrayList<>();
        ShapeCollector test = new ShapeCollector(circle, square, triangle);
        //When
        test.addFigure((Shape) circle);
        //Then
        Assertions.assertEquals(1, test.getFigureQuantity(1));
    }
    @Test
    void testRemoveFigure(Shape shape){
        //Given
        List<Triangle> triangle = new ArrayList<>();
        List<Square> square = new ArrayList<>();
        List<Circle> circle = new ArrayList<>();
        ShapeCollector test = new ShapeCollector(circle, square, triangle);
        //When
        test.removeFigure((Shape) circle);
        //Then
        Assertions.assertEquals(0,test.getFigureQuantity(0));
    }
    @Test
    void testGetFigure(int n){
        //Given

        //When

        //Then
    }
}
