package lesson7;

public class Patient {
    private String name;
    private String surname;
    private int treatmentPlan;
    private String doctor;

    public Patient() {
        name = "";
        surname = "";
        treatmentPlan = 0;
        doctor = "Therapist";
    }

    public Patient(String name, String surname, int treatmentPlan, String doctor) {
        this.surname = surname;
        this.doctor = doctor;
        this.treatmentPlan = treatmentPlan;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
