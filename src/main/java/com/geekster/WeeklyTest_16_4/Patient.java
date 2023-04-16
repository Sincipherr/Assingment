package com.geekster.WeeklyTest_16_4;

public class Patient {
    private String patientName;
    private String patientID;

    public Patient(String patientName, String patientID) {
        this.patientName = patientName;
        this.patientID = patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientID() {
        return patientID;
    }
    public void patientDetails(){
        System.out.println(patientName+" "+patientID);
    }
}
