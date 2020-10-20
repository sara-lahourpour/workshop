package com.company;

/**
 *
 * @author Sara Lahourpour
 * @version 1
 * @since 2020
 */

public class Department {
    private Student[] students;
    private int capacityOfStudents;
    private Lesson[] lessons;
    private int numOfLessons;

    //size_1 is the iterator for adding the students
    private int size_1;

    // size_2 is the iterator for adding the lessons
    private int size_2;

    // this avg takes the average of the grades of all
    //students no matter which grade they are in
    private float avg;

    /**
     *
     * @param capacityOfStudents the number of students that department can have
     * @param numOfLessons the number of lessons that the department can represent
     */
    public Department(int capacityOfStudents, int numOfLessons) {
        this.capacityOfStudents = capacityOfStudents;
        this.numOfLessons = numOfLessons;
        this.students = new Student[capacityOfStudents];
        this.lessons = new Lesson[numOfLessons];
        this.size_1 = 0;
        this.size_2 = 0;

    }

    /**
     * adding students from lesson's students to department's student
     */
    public void addStudents() {

        if (size_1 < capacityOfStudents) {
            for (int i=0 ; i < size_2 ; i++){
                for ( int j=0 ; j < lessons[i].getSize() ; j++) {
                    students[size_1] = lessons[i].getStudents()[j];
                    size_1++;
                }
            }
        }else {
            System.out.println("Department is full");
        }
    }

    /**
     *
     * @param lesson lesson to be added to the array of lessons
     */
    public void addLessons(Lesson lesson){
        if (size_2 < numOfLessons){
            lessons[size_2] =lesson;
            size_2++;
        }else {
            System.out.println("Course " + lessons[size_2].getId() + " is full");
        }
    }

    /**
     *
     * @return object Student will be return
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     *
     * @return avg of type float
     */
    public float getAvg() {
        return avg;
    }

    /**
     * calculate the average grade of departments's students
     */
    public void calculateAvgDepartment() {
        float sum = 0 ;
        for (int i = 0; i < size_1; i++) {
            sum += students[i].getGrade();
        }
        avg = sum / size_1;
    }

    /**
     * print students , avg
     */
    public void print() {
        int k=1;
        addStudents();
        calculateAvgDepartment();
        System.out.println();
        System.out.println("Department's Avg : " + getAvg());

        System.out.println("Department's students :");
        for (int j=0 ; j < size_1 ; j++){
            System.out.println("[" + k++ + "] " + getStudents()[j].getfName()
                    + " " + getStudents()[j].getlName()
                    + " " + getStudents()[j].getId());
        }
        System.out.println();

        for (int i=0 ; i < size_2 ; i++){
            k=1;
            System.out.println("Course Name : " + lessons[i].getName()
                    + "\nCourse's ID : " + lessons[i].getId());

            System.out.println("Course's Avg : " + lessons[i].getAvg());

            System.out.println("Students At Course " + lessons[i].getName() + " : ");
            for (int j=0 ; j < lessons[i].getSize() ; j++){
                System.out.println("[" + k++ + "] " + lessons[i].getStudents()[j].getfName()
                        + " " + lessons[i].getStudents()[j].getlName()
                        + " " + lessons[i].getStudents()[j].getId());
            }
            System.out.println();
        }
    }
}
