package com.company;

import java.util.ArrayList;

public class Polygon extends Shape{

    public ArrayList<Integer> sides;

    public Polygon(int ... sides){
        this.sides=new ArrayList<>();
        for (Integer side:  sides) {
            this.sides.add(side);
        }
    }

    /**
     *
     * @return sides
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * draw shape, rectangle or triangle
     */
    @Override
    public void draw() {

    }

    /**
     *
     * @return String
     */
    @Override
    public String toString() {
        return "sides=" + sides ;
    }
}
