package com.kodilla.exception.test;

import java.util.Date;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        try {
            FirstChallenge firstChallenge = new FirstChallenge();
            double result = firstChallenge.divide(3, 0);

            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(new Date());
        }
    }
}