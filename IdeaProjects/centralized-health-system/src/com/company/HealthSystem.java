package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class HealthSystem {
    private HashMap<Patient, ArrayList<MedicalRecord>> patientInfo;

    public HealthSystem() {
        patientInfo = new HashMap<>();
    }

    public void storePatientInfo(Patient patient, MedicalRecord medicalRecord){
//        do some code
    }
    public void sendUniversity(){
//        do some code
    }

    public HashMap<Patient, ArrayList<MedicalRecord>> getPatientInfo() {
//        do some code
        return patientInfo;
    }

}
