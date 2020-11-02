package com.company;

import java.util.ArrayList;

public class Paint {

    private ArrayList<Shape> shapes;

    public Paint() {
        shapes = new ArrayList<>();
    }

    /**
     * add shapes
     *
     * @param shape shape to be added
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * draw shapes
     */
    public void drawAll() {

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    /**
     * print the details of shapes such as
     * perimeter , area and sides
     */
    public void printAll() {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
