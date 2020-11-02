package com.company;

import java.util.ArrayList;

public class Triangle {
    private ArrayList<Integer> sides;

    public Triangle(int... sides) {
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
     * a method whether check the triangle is equilateral or not
     *
     * @return boolean
     */
    public boolean isEquilateral() {
        for (int i = 1; i < sides.size(); i++) {
            if (!sides.get(0).equals(sides.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * calculate perimeter of triangle
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
     * calculate area of triangle
     *
     * @return area
     */
    public double calculateArea() {
        double sum = 0;
        for (Integer side : sides) {
            sum += side;
        }
        return sum / 3;
    }

    /**
     * draw triangle
     */
    public void draw() {
        if (isEquilateral()) {
            // loop to iterate for the given number of rows
            for (int i = 1; i <= sides.get(0); i++) {

                // loop to print the number of spaces before the star
                for (int j = sides.get(0); i <= j; j--) {
                    System.out.print("  ");
                }

                // loop to print the number of stars in each row
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }

                // for new line after printing each row
                System.out.println();
            }
        } else {
            //I'll take it as isosceles
            int avg = (sides.get(0) + sides.get(1) + sides.get(2)) / 3;
            int num = 0;
            int index = 0;
            int bottom = 0;
            for (int i = 0; i < sides.size(); i++) {
                if (avg >= sides.get(i)) {
                    num++;
                    index = i;
                    if (num == 2) {
                        num = 0;
                        break;
                    }
                } else {
                    num++;
                    index = i;
                    if (num == 2) {
                        num = 0;
                        break;
                    }
                }
            }

            if (num == 1) {
                bottom = index;
            }

            // print the upper triangle
            for (int i = 0; i < sides.get(bottom) / 2 + 1; ++i) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // print the lower triangle
            for (int i = sides.get(bottom) - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
        System.out.println("\n\n");
    }

    @Override
    public String toString() {
        String check;
        if (isEquilateral()) {
            check = "Equilateral";
        } else
            check = "Triangle";
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
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return getSides().equals(triangle.getSides());
    }

}
