package com.company;


public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * @return radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * calculate perimeter of circle
     *
     * @return perimeter
     */
    public double calculatePerimeter() {
        return 2 * radius * 3.14;
    }

    /**
     * calculate area of circle
     *
     * @return area
     */
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    /**
     * draw circle
     */
    public void draw() {
        double dist;

        // for horizontal movement
        for (int i = 0; i <= 2 * radius; i++) {

            // for vertical movement
            for (int j = 0; j <= 2 * radius; j++) {
                dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));

                // dist should be in the range (radius - 0.5)
                // and (radius + 0.5) to print stars(*)
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println("\n\n");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return getRadius() == circle.getRadius();
    }


    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                " perimeter= "
                + calculatePerimeter()
                + "  area= " +
                calculateArea() + " }";
    }
}
