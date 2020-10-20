package com.company;

/**
 *
 * @author Sara Lahourpour
 * @version 1
 * @since 2020
 */
public class Lesson {
    private int id;

    //name of the course which will be represented by th department
    private String name;
    private Student[] students;

    // avg is the average of the lesson's mark by the student's
    // of the class
    private float avg;
    private int size;
    private int capacity;

    public Lesson(String name, int id,int capacity){
        this.capacity = capacity;
        this.students = new Student[capacity];
        this.size = 0;
        this.id = id;
        this.name = name;
    }

    /**
     *
     * @param student an object from Student class which will be added to our students array
     */
    public void addStudents(Student student){
        if (size < capacity){
            students [size]=student;
            size++;
        }else {
            System.out.println("Class is full");
        }
    }

    /**
     *
     * @return array of students of Student type
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * calculate the average
     */
    public void calculateAvg(){

        float sum=0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        avg = sum / students.length;
    }

    /**
     *
     * @return average of students grade in course
     */
    public float getAvg() {
        calculateAvg();
        return avg;
    }

    /**
     *
     * @return ID of the course
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the course
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return  number of students which are in the course ,
     * not the capacity
     */
    public int getSize() {
        return size;
    }

}
