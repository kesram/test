package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent continent1 = new Continent("Europa");
        Country country1 = new Country("Poland", new BigDecimal("38135435154681651"));
        Country country2 = new Country("France", new BigDecimal("669854398935439865"));
        Country country3 = new Country("Italy", new BigDecimal("629879854386549387530"));
        Country country4 = new Country("Belgium", new BigDecimal("1109805943759348709463"));
        Country country5 = new Country("Finland", new BigDecimal("52749439054850458537"));
        Country country6 = new Country("Hungary", new BigDecimal("9548585756457484836"));
        Country country7 = new Country("Croatia", new BigDecimal("5358346534986534"));

        Continent continent2 = new Continent("Africa");
        Country country8 = new Country("Nigeria", new BigDecimal("10101938387"));
        Country country9 = new Country("Ethiopia", new BigDecimal("202251684651"));
        Country country10 = new Country("Egypt", new BigDecimal("3543213535138"));
        Country country11 = new Country("RPA", new BigDecimal("28428462842684"));
        Country country12 = new Country("Tanzania", new BigDecimal("654684351351846"));

        Continent continent3 = new Continent("Asia");
        Country country13 = new Country("China", new BigDecimal("2354313513251351"));
        Country country14 = new Country("India", new BigDecimal("186351384635136"));
        Country country15 = new Country("Russia", new BigDecimal("354315524851513158"));
        Country country16 = new Country("Japan", new BigDecimal("28428462842635384"));
        Country country17 = new Country("Philippines", new BigDecimal("35431351558258313"));

        //When
        World world = new World();
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent1.addCountry(country4);
        continent1.addCountry(country5);
        continent1.addCountry(country6);
        continent1.addCountry(country7);

        continent2.addCountry(country8);
        continent2.addCountry(country9);
        continent2.addCountry(country10);
        continent2.addCountry(country11);
        continent2.addCountry(country12);

        continent3.addCountry(country13);
        continent3.addCountry(country14);
        continent3.addCountry(country15);
        continent3.addCountry(country16);
        continent3.addCountry(country17);

        BigDecimal total = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("1803118574010362794464");

        //Then
        assertEquals(expected, total);
    }
}
