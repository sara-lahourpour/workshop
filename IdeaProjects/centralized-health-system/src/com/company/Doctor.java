package com.company;


import java.util.HashMap;
import java.util.Set;

public class Doctor {

    private HashMap<String,DoctorSpecialty> validDoctorSpecialty;

    public Doctor() {

    }

    public void addDoctor(String name,String speciality){
//        do some code
    }


    public Set<String> showDoctorBySpeciality(){
//        do some code
        return validDoctorSpecialty.keySet();
    }

    public DoctorSpecialty[] showAllSpeciality(){
//        do some code
        return DoctorSpecialty.values();
    }

    public void makeMedicalRecord(){

    }

    public boolean canDoFirstDoctor(){
//        do some code
        return false;
    }

    public void accessSpecificRecords(){
//        do some code
    }

    public void accessAllRecords(){
//        do some code
    }

}
