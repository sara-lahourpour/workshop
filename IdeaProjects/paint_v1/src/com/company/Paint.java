package com.company;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Triangle> triangles;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Circle> circles;

    public Paint() {
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
        circles = new ArrayList<>();
    }

    /**
     * @param triangle to be added
     */
    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    /**
     * @param rectangle to be added
     */
    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    /**
     * @param circle to be added
     */
    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    /**
     * print details of shapes such as perimeter ,
     * area and sides
     */
    public void printAll() {
        for (Triangle triangle : triangles) {
            System.out.println(triangle.toString());
        }

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }

        for (Circle circle : circles) {
            System.out.println(circle.toString());
        }
    }

    /**
     * draw shapes
     */
    public void drawAll() {
        for (Triangle triangle : triangles) {
            triangle.draw();
        }

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }

        for (Circle circle : circles) {
            circle.draw();
        }
    }
}
