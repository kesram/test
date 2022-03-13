package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {
        OddNumbersExterminator test = new OddNumbersExterminator();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(0,2);
        numbers.add(1,4);
        numbers.add(2,6);
        numbers.add(3,8);
        numbers.add(4,10);

        //test.exterminate();
        //test.filterEven()
    }

}
