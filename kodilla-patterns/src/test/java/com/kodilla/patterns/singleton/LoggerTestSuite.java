package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLog(){
        //Given
        Logger logger = Logger.LOG;
        logger.log("myFirstLog");
        //When
        String name = logger.getLastLog();
        //Then
        Assertions.assertEquals("myFirstLog", name);
    }
}
