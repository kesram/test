package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;

import java.time.LocalDate;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2,1.5);
        } catch (Exception e) {

            System.out.println("Houston, We Have a Problem: " + e);
        }
        finally{
            System.out.println(LocalDate.now());
        }
    }
}
