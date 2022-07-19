package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal pizzaGetCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15),pizzaGetCost);
    }

    @Test
    public void testBasicOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String pizzaGetDescription = pizzaOrder.getDescription();

        //Then
        assertEquals("Basic pizza", pizzaGetDescription);
    }

    @Test
    public void testCapriciosaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapriciosaDecorator(pizzaOrder);

        //When
        BigDecimal pizzaGetCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(20), pizzaGetCost);
    }

    @Test
    public void testCapriciosaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapriciosaDecorator(pizzaOrder);

        //When
        String pizzaGetDescription = pizzaOrder.getDescription();

        //Then
        assertEquals("Basic pizza + ham and mushrooms", pizzaGetDescription);
    }

    @Test
    public void testCapriciosaWithSauceGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapriciosaDecorator(pizzaOrder);
        pizzaOrder = new SauceDecorator(pizzaOrder);

        //When
        BigDecimal pizzaGetCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(21),pizzaGetCost);
    }

    @Test
    public void testCapriciosaWithSauceGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapriciosaDecorator(pizzaOrder);
        pizzaOrder = new SauceDecorator(pizzaOrder);

        //When
        String pizzaGetDescription = pizzaOrder.getDescription();

        //Then
        assertEquals("Basic pizza + ham and mushrooms + ketchup", pizzaGetDescription);
    }

    @Test
    public void testCapriciosaWithSauceAndDeliveryGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapriciosaDecorator(pizzaOrder);
        pizzaOrder = new SauceDecorator(pizzaOrder);
        pizzaOrder = new DeliveryDecorator(pizzaOrder);

        //When
        BigDecimal pizzaGetCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(26),pizzaGetCost);
    }

    @Test
    public void testCapriciosaWithSauceAndDeliveryGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new CapriciosaDecorator(pizzaOrder);
        pizzaOrder = new SauceDecorator(pizzaOrder);
        pizzaOrder = new DeliveryDecorator(pizzaOrder);

        //When
        String pizzaGetDescription = pizzaOrder.getDescription();

        //When
        assertEquals("Basic pizza + ham and mushrooms + ketchup + delivery", pizzaGetDescription);
    }
}
