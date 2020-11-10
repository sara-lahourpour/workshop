package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Pharmacy {
    private HashMap<Patient,ArrayList<String>> prescription;

    public Pharmacy(ArrayList<String> drugs){
    }

    public ArrayList<String> getPrescription(Patient patient) {
//        do some code
        return prescription.get(patient);
    }
}
