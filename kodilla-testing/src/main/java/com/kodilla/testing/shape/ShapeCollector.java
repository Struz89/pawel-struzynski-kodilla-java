package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;

    public List<String> array = new ArrayList<>();

    public List<String> addFigure(Shape shape) {
        String figure =  shape.getShapeName();
        array.add(figure);
        return array;
    }

    public List<String> removeFigure(Shape shape) {
        String figure =  shape.getShapeName();
        array.remove(figure);
        return array;
    }

    public String getFigure(int n) {
        String figure = array.get(n);
        return figure;
    }

    public String showFigures() {
        return array.toString();
    }

}
