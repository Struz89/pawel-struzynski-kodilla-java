package com.kodilla.exception.test;

import java.util.Date;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            return a / b;
        } catch (Exception e) {
            throw new ArithmeticException();
        } finally {
            System.out.println(new Date());
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}