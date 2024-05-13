/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Acer
 */
public class Patient extends Person{
    private String medicalHistory;
    private String currentHealthStatus;

    // Constructor inheriting from Person
    public Patient(int patientId, String name, String contactInfo, String address) {
        super(patientId, name, contactInfo, address);
    }

    // Getter and setter for medical history
    public String getMedicalHistory() {
        return medicalHistory;
    }
    
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    
    // Getter and setter for current health status
    public String getHealthStatus() {
        return currentHealthStatus;
    }
    
    public void setHealthStatus(String healthStatus) {
        this.currentHealthStatus = healthStatus;
    }
}
