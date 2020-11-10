package com.company;

import java.util.ArrayList;

public class MedicalRecord {

    private ArrayList<String> signsOfDisease;
    private String generalDisease;
    private ArrayList<String> drug;
    private String date;
    private DiseaseSecurityLevel diseaseSecurityLevel;
    private String doctorDiagnosis;
    private String doctor;

    public ArrayList<String> getSignsOfDisease() {
        return signsOfDisease;
    }

    public void setSignsOfDisease(ArrayList<String> signsOfDisease) {
        this.signsOfDisease = signsOfDisease;
    }

    public String getGeneralDisease() {
        return generalDisease;
    }

    public void setGeneralDisease(String generalDisease) {
        this.generalDisease = generalDisease;
    }

    public ArrayList<String> getDrug() {
        return drug;
    }

    public void setDrug(ArrayList<String> drug) {
        this.drug = drug;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DiseaseSecurityLevel getDiseaseSecurityLevel() {
        return diseaseSecurityLevel;
    }

    public void setDiseaseSecurityLevel(DiseaseSecurityLevel diseaseSecurityLevel) {
        this.diseaseSecurityLevel = diseaseSecurityLevel;
    }

    public String getDoctorDiagnosis() {
        return doctorDiagnosis;
    }

    public void setDoctorDiagnosis(String doctorDiagnosis) {
        this.doctorDiagnosis = doctorDiagnosis;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }


}
