package com.company;

public class Patient {

    private int nationalCode;
    private String birth;
    private String gender;
    private String basicInfertility;
    private String partialInfertility;
    private String education;
    private String occupation;
    private String location;
    private String geoPosition;
    private String firstDoctor;
    private String secondDoctor;


    public Patient(){

    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBasicInfertility() {
        return basicInfertility;
    }

    public void setBasicInfertility(String basicInfertility) {
        this.basicInfertility = basicInfertility;
    }

    public String getPartialInfertility() {
        return partialInfertility;
    }

    public void setPartialInfertility(String partialInfertility) {
        this.partialInfertility = partialInfertility;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGeoPosition() {
        return geoPosition;
    }

    public void setGeoPosition(String geoPosition) {
        this.geoPosition = geoPosition;
    }

    public String getFirstDoctor() {
        return firstDoctor;
    }

    public void setFirstDoctor(String firstDoctor) {
        this.firstDoctor = firstDoctor;
    }

    public String getSecondDoctor() {
        return secondDoctor;
    }

    public void setSecondDoctor(String secondDoctor) {
        this.secondDoctor = secondDoctor;
    }

    public boolean hasReliableDoctor(){
//      do some code
        return false;
    }

    public void chooseReliableDoctor(){
//      do some code
    }

    public void accessMedicalRecord(){
//      do some code
    }

}
