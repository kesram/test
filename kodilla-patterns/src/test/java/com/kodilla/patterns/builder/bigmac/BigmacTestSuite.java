package com.kodilla.patterns.builder.bigmac;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testNewBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Z sezamem")
                .burgers(2)
                .sauce("Tysiąca wysp")
                .ingredient("Ser")
                .ingredient("Sałata")
                .ingredient("camembert")
                .ingredient("powidła")
                .ingredient("cebula")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(5, howManyIngredients);
    }
}
