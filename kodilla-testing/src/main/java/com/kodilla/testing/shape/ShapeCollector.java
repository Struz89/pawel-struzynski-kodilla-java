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

    public Shape getFigure(int n) {
        if (array.size()-1<n) {
            return null;
        } else if (n<0) {
            return null;
        } else {
            return array.get(n);
        }
    }

    public String showFigures() {
        return array.toString();
    }

}
