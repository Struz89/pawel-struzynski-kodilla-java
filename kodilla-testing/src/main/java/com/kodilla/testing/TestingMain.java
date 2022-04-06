package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator = new Calculator();

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int resultAdd = calculator.add(5,5);

        if (resultAdd == 10) {
            System.out.println("test add OK");
        } else {
            System.out.println("Error!");
        }

        int resultSubtract = calculator.subtract(10,8);

        if (resultSubtract == 2) {
            System.out.println("test subtract OK");
        } else {
            System.out.println("Error!");
        }

    }
}
