package com.company;

public class Main {

    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay(12,43,23);

        while (!clock.getTime().equals("12:44:00")){
            clock.timeTick();
            System.out.println(clock.getTime());
        }
    }
}
