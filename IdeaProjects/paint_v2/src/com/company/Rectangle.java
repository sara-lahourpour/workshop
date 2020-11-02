package com.company;

public class Rectangle extends Polygon {

    public Rectangle(int... sides) {
        super(sides);
    }

    /**
     *
     * a method whether check the rectangle is square or not
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
     *
     * calculate perimeter of rectangle
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        double sum = 0;
        for (Integer side : sides) {
            sum += side;
        }
        return sum;
    }

    /**
     *
     * calculate area of rectangle
     * @return area
     */
    @Override
    public double calculateArea() {
        double mutt = 1;
        for (Integer side : sides) {
            mutt *= side;
        }
        return mutt;
    }

    /**
     *
     * draw rectangle
     */
    @Override
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

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        String check;
        if (isSquare()){
            check = "Square";
        }else
            check = "Rectangle";
        return check + " {" +
                super.toString() + " perimeter= "
                + calculatePerimeter()
                + "  area= " +
                calculateArea() +
                " }";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
