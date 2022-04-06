package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ShapeCollectorTestSuite {

    @Nested
    class Test1 {
        @DisplayName("Test add figure to collection")
        @Test
        void testAddFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            List<String> array = shapeCollector.addFigure(new Circle());

            //Then
            Assertions.assertEquals(1, array.size());
            Assertions.assertEquals("Circle", array.get(0));

        }

        @DisplayName("Test remove figure to collection")
        @Test
        void testRemoveFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            List<String> array = shapeCollector.addFigure(new Triangle());
            shapeCollector.removeFigure(new Triangle());

            //Then
            Assertions.assertEquals(0, array.size());

        }

    }

    @Nested
    class Test2 {
        @DisplayName("Test get n figure in collection")
        @Test
        void testGetFigureInCollection() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            List<String> array = shapeCollector.addFigure(new Triangle());
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Square());
            String figure = shapeCollector.getFigure(2);

            //Then
            Assertions.assertEquals(3, array.size());
            Assertions.assertEquals("Square", figure);

        }

        @DisplayName("Test show all figures in collection")
        @Test
        void testShowAllFiguresInCollection() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            List<String> array = shapeCollector.addFigure(new Triangle());
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Square());
            String allFigures = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(3, array.size());
            Assertions.assertEquals("[Triangle, Circle, Square]", allFigures);

        }

    }

}
