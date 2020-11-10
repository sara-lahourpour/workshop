package com.company;

public enum DoctorSpecialty {
    GENERAL("general"),COSMETIC("cosmetic"),CARDIAC("cardiac"),
    VASCULAR("vascular"),PEDIATRIC("pediatric"),CHEST("chest"),
    ORTHOPEDIC("orthopedic"), OBSTETRICIAN("obstetrician"),
    UROLOGY("urology"), NEUROLOGIST("neurologist"),ENT("ENT");

    private String speciality;

    DoctorSpecialty(String speciality) {
        this.speciality=speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "DoctorSpecialty{" +
                "speciality='" + speciality + '\'' +
                '}';
    }
}
