package com.company;

/**
 * a class which takes first and last name and also ID of a student.
 * which we set the grade later by taking it from the user.
 *
 * @author Sara Lahourpour
 * @version 1
 * @since 2020
 */
public class Student {
    // student's first name
    private String fName;

    //student's last name
    private String lName;

    //student's ID
    private String Id;

    //student's grade
    private float grade;

    /**
     *
     * @param fName student's first name
     * @param lName student's last name
     * @param Id student's ID
     */
    public Student(String fName,String lName,String Id){
        this.fName =fName;
        this.lName =lName;
        this.Id =Id;
        this.grade =0;
    }
    public Student(){
        this.grade =0;
    }

    /**
     *
     * @return grade
     */
    public float getGrade() {
        return grade;
    }

    /**
     *
     * @param grade student's grade
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }

    /**
     *
     * @return first name
     */
    public String getfName() {
        return fName;
    }

    /**
     *
     * @return last name
     */
    public String getlName() {
        return lName;
    }

    /**
     *
     * @return ID of the student
     */
    public String getId() {
        return Id;
    }

}
