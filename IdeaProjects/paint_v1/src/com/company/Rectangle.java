package com.company;

import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Integer> sides;

    public Rectangle(int... sides) {
        this.sides = new ArrayList<>();
        for (Integer side : sides) {
            this.sides.add(side);
        }
    }

    /**
     * @return sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * a method whether check the rectangle is a square or not
     *
     * @return boolean
     */
    public boolean isSquare() {
        for (int i = 1; i < sides.size(); i++) {
            if (!sides.get(0).equals(sides.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * calculate perimeter of rectangle
     *
     * @return perimeter
     */
    public double calculatePerimeter() {
        double sum = 0;
        for (Integer side : sides) {
            sum += side;
        }
        return sum;
    }

    /**
     * calculate area of rectangle
     *
     * @return area
     */
    public double calculateArea() {
        double mutt = 1;
        for (Integer side : sides) {
            mutt *= side;
        }
        return mutt;
    }

    /**
     * draw rectangle
     */
    public void draw() {
        int i, j;
        for (i = 1; i <= sides.get(0); i++) {
            for (j = 1; j <= sides.get(1); j++) {
                if (i == 1 || i == sides.get(0) || j == 1 || j == sides.get(1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n");
    }

    @Override
    public String toString() {
        String check;
        if (isSquare()) {
            check = "Square";
        } else
            check = "Rectangle";
        return
                check + " {" +
                        "sides=" + sides +
                        " perimeter= "
                        + calculatePerimeter()
                        + "  area= " +
                        calculateArea() + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getSides().equals(rectangle.getSides());
    }

}

