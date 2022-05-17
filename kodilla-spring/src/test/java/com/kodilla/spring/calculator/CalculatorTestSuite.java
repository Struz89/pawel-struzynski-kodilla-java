package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        Double resultAdd = calculator.add(4,4);
        Double resultSub = calculator.sub(8,5);
        Double resultMul = calculator.mul(2,3);
        Double resultDiv = calculator.div(4,2);

        //Then
        Assertions.assertEquals(8,resultAdd);
        Assertions.assertEquals(3,resultSub);
        Assertions.assertEquals(6,resultMul);
        Assertions.assertEquals(2,resultDiv);
    }
}
