package com.kodilla.testing.collection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

public class OddNumbersExterminator {

    public List<Integer> exterminate(@NotNull List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            int b = number % 2;
            if (b == 0) {
                result.add(number);
            }
        }return result;
    }
}

