package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
        OddNumbersExterminator test = new OddNumbersExterminator();

        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        System.out.println(numbers);
        for (int number : numbers) {
            int b = number % 2;
            if (b == 0) {
                result.add(number);
            }
        }
        System.out.println(result);
    }

    @DisplayName("Check if arrayList return only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator test = new OddNumbersExterminator();

        List<Integer> result = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0, 1);
        numbers.add(1, 3);
        numbers.add(2, 2);
        System.out.println(numbers);

        for (int number : numbers) {
            int b = number % 2;
            if (b == 0) {
                result.add(number);
            }
        }
        System.out.println(result);
    }
}