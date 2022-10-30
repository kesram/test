package com.kodilla.hibernate.manytomany.facade;

public class FacadeException extends Exception {

    public static String ERR_NO_COMPANY = "There is no such company";
    public static String ERR_NO_EMPLOYEE = "There is no such employee";

    public FacadeException(String message) {
        super(message);
    }
}
