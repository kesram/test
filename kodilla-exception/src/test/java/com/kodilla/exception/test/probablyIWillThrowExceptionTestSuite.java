package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class probablyIWillThrowExceptionTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(3,1));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(-1,1));
        Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0,1.5));
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1));
    }
}
