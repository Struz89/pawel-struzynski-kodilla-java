package com.kodilla.hibernate.manytomany.facade;

public class CompanyException extends Exception{

    public static String ERROR_COMPANY = "Nie ma takiej firmy w bazie!";

    public static String ERROR_EMPLOYEE = "Nie ma takiego pracownika w bazie!";
    public CompanyException(String message) {
        super(message);
    }
}
