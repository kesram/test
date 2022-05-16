package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    void testCalculations(){
        //Given
        //When
        double sumResult = calculator.add(1,2);
        double subResult = calculator.sub(1,2);
        double mulResult = calculator.mul(1,2);
        double divResult = calculator.div(1,2);
        //Then
        Assertions.assertEquals(3, sumResult);
        Assertions.assertEquals(-1, subResult);
        Assertions.assertEquals(2, mulResult);
        Assertions.assertEquals(0.5, divResult);
    }
}
