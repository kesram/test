package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
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
        List<Integer> result = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0, 2);
        numbers.add(1, 4);
        numbers.add(2, 6);
        System.out.println(numbers);
        //When
        for (int number : numbers) {
            int b = number % 2;
            if (b == 0) {
                result.add(number);
            } else
                result.add(0);
        }
        System.out.println(result);
        //Then
        Assertions.assertEquals(result, numbers);
    }
}