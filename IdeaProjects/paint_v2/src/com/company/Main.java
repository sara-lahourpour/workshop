package com.company;

/**
 * a simple painter project
 * using inheritance
 *
 * @author Sara Lahourpour
 * @since 2020
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(2,2,2);
        Triangle triangle2 = new Triangle(4,4,6);

        Rectangle rectangle1 = new Rectangle(1,4,1,4);
        Rectangle rectangle2 = new Rectangle(8,5,8,5);
        Rectangle rectangle3 = new Rectangle(6,6,6,6);

        Shape circle1 = new Circle(19);
        Shape circle2 = new Circle(3);

        Paint paint = new Paint();
        paint.addShape(triangle1);
        paint.addShape(triangle2);
        paint.addShape(rectangle1);
        paint.addShape(rectangle2);
        paint.addShape(rectangle3);
        paint.addShape(circle1);
        paint.addShape(circle2);

        paint.drawAll();
        paint.printAll();
    }
}
