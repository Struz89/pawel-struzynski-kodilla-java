package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    @Nested
    class Test1 {
        @DisplayName("Test add figure to collection")
        @Test
        void testAddFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> array = shapeCollector.getArray();

            //When
            shapeCollector.addFigure(new Circle());

            //Then
            Assertions.assertEquals(1, array.size());

        }

        @DisplayName("Test remove figure to collection")
        @Test
        void testRemoveFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> array = shapeCollector.getArray();

            //When
            shapeCollector.addFigure(new Triangle());
            shapeCollector.removeFigure(array.get(0));

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
            List<Shape> array = shapeCollector.getArray();

            //When
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Square());
            shapeCollector.addFigure(new Triangle());
            String shape = shapeCollector.getFigure(2);

            //Then
            Assertions.assertEquals(3, array.size());
            Assertions.assertNotNull(shape);

        }

        @DisplayName("Test get n figure in collection when n is less then zero")
        @Test
        void testGetFigureInCollectionWhenNIsLessThenZero() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> array = shapeCollector.getArray();

            //When
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Square());
            shapeCollector.addFigure(new Triangle());
            String shape = shapeCollector.getFigure(-1);

            //Then
            Assertions.assertEquals(3, array.size());
            Assertions.assertEquals("You cannot enter a value less than zero!", shape);

        }

        @DisplayName("Test get n figure in collection when n is more then list size")
        @Test
        void testGetFigureInCollectionWhenNIsMoreThenListSize() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> array = shapeCollector.getArray();

            //When
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Square());
            shapeCollector.addFigure(new Triangle());
            String shape = shapeCollector.getFigure(3);

            //Then
            Assertions.assertEquals(3, array.size());
            Assertions.assertEquals("There are not so many items in the list!", shape);

        }

        @DisplayName("Test show all figures in collection")
        @Test
        void testShowAllFiguresInCollection() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> array = shapeCollector.getArray();

            //When
            shapeCollector.addFigure(new Circle());
            shapeCollector.addFigure(new Square());
            shapeCollector.addFigure(new Triangle());
            String allFigures = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(3, array.size());
            Assertions.assertNotNull(allFigures);

        }
    }
}
