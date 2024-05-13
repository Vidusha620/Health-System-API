/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Acer
 */
public class MedicalRecord {
    private int medicalId;
    private Patient patient;
    private String diagnoses;
    private String treatments;
    
    // Constructor
    public MedicalRecord(int medicalId, Patient patient, String diagnoses, String treatments) {
        this.medicalId = medicalId;
        this.patient = patient;
        this.diagnoses = diagnoses;
        this.treatments = treatments;
    }
    
    // Getters and setters
    public int getId() {
        return medicalId;
    }
    
    public void setId(int medicalId) {
        this.medicalId = medicalId;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getDiagnoses() {
        return diagnoses;
    }
    
    public void setDiagnoses(String diagnoses) {
        this.diagnoses = diagnoses;
    }
    
    public String getTreatments() {
        return treatments;
    }
    
    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }
}
