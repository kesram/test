package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Podstawowa pizza (ciasto i sos pomidorowy z serem)", description);
    }

    @Test
    public void testBasicPizzaOrderWithAllIngredients(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(29.00), calculatedCost);
        assertEquals("Podstawowa pizza (ciasto i sos pomidorowy z serem) + dodatkowy ser + sos czosnkowy + szynka",description);

    }
}
