package com.company;

public class Main {

    public static void main(String[] args) {

        Student student_1 = new Student("Sara","Lahourpour","9831098");
        Student student_2 = new Student("Laleh","Hamidi","9831122");
        Student student_3 = new Student("Shiva","Ahsan","9831703");
        Student student_4 = new Student("Niloofar","Bayani","9831143");

        student_1.setGrade(19.2f);
        student_2.setGrade(20);
        student_3.setGrade(15.7f);
        student_4.setGrade(14);

        Lesson ap = new Lesson("AP",3102237, 2);
        Lesson dsa = new Lesson("DSA",3104213,2);
        ap.addStudents(student_1);
        ap.addStudents(student_2);
        dsa.addStudents(student_3);
        dsa.addStudents(student_4);

        Department ce = new Department(600,30);
        ce.addLessons(ap);
        ce.addLessons(dsa);

        ce.print();


    }
}

