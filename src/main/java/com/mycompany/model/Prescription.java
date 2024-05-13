/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Acer
 */
public class Prescription {
    private int prescriptionId;
    private Patient patient;
    private String medications;
    private String instructions;
    private String duration;
    
    // Constructor
    public Prescription(int prescriptionId, Patient patient, String medications, String instructions, String duration) {
        this.prescriptionId = prescriptionId;
        this.patient = patient;
        this.medications = medications;
        this.instructions = instructions;
        this.duration = duration;
    }
    
    // Getters and setters
    public int getId() {
        return prescriptionId;
    }
    
    public void setId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getMedications() {
        return medications;
    }

    public void setMedications(String medications) {
        this.medications = medications;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
    
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
