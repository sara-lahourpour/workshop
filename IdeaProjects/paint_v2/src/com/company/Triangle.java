package com.company;

public class Triangle extends Polygon {

    public Triangle(int ... sides){
        super(sides);
    }

    /**
     *
     * a method to check whether the triangle is equilateral
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
     *
     * calculate the perimeter of triangle
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
     * calculate the area of triangle
     * @return area
     */
    @Override
    public double calculateArea() {
        double sum = 0;
        for (Integer side : sides) {
            sum += side;
        }
        return sum / 3;
    }

    /**
     *
     * draw triangle
     */
    @Override
    public void draw() {
        if (isEquilateral()){
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
            int avg = (sides.get(0) + sides.get(1) + sides.get(2))/3;
            int num=0;
            int index=0;
            int bottom=0;
            for (int i = 0; i < sides.size() ; i++) {
                if ( avg >= sides.get(i)){
                    num++;
                    index=i;
                    if (num==2){
                        num=0;
                        break;
                    }
                }else {
                    num++;
                    index=i;
                    if (num==2){
                        num=0;
                        break;
                    }
                }
            }

            if (num==1){
                bottom=index;
            }

            // print the upper triangle
            for (int i = 0; i < sides.get(bottom)/2 +1; ++i) {
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

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        String check;
        if (isEquilateral()) {
            check = "Equilateral";
        } else
            check = "Triangle";
        return
                check + " {" +
                        super.toString() +
                        " perimeter= "
                        + calculatePerimeter()
                        + "  area= " +
                        calculateArea() + " }";

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
