package com.company;

import java.util.Objects;

import ir.huri.jcal.JalaliCalendar;


public class Vote {
    private Person person;
    private String date;

    public Vote(Person p, String date) {
        this.person = p;
        this.date = date;
//        JalaliCalendar jalaliCalendar = new JalaliCalendar();
//        String[] arr = date.split("/");

    }

    public Person getPerson() {
        return person;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return getPerson().equals(vote.getPerson());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPerson());
    }
}
