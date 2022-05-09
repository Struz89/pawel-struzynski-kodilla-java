package com.kodilla.exception.test;

import java.util.Date;

public class ExceptionHandling {

    public static void main (String[] args) {
        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            String result = secondChallenge.probablyIWillThrowException(1.5,1);

            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(new Date());
        }
    }

}
