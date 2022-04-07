package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> array = new ArrayList<>();

    public List<Shape> getArray() {
        return array;
    }

    public void addFigure(Shape shape) {
        array.add(shape);
    }

    public void removeFigure(Shape shape) {
        array.remove(shape);
    }

    public String getFigure(int n) {
        if (array.size()-1<n) {
            return "There are not so many items in the list!";
        } else if (n<0) {
            return "You cannot enter a value less than zero!";
        } else {
            return array.get(n).toString();
        }
    }

    public String showFigures() {
        return array.toString();
    }

}
