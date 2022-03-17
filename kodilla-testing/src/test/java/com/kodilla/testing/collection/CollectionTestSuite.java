package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Check if arrayList is empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        //When
        test.exterminate(numbers);
        //Then
        Assertions.assertEquals(result, numbers);
    }

    @DisplayName("Check if arrayList return only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1,3,2,4,6);
        List<Integer> expected = Arrays.asList(2,4,6);
        //When
        List<Integer> result = test.exterminate(numbers);
        //Then
        Assertions.assertEquals(expected, result);

    }
}