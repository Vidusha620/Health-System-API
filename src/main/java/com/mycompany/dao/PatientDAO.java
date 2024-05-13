/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class PatientDAO {
    // List to store patients
    private static final List<Patient> patients = new ArrayList<>();

    // Static initialization block to add initial patients
    static {
        // Example patients
        patients.add(new Patient(3, "John Doe", "1234567890", "123 Main St"));
        patients.add(new Patient(4, "Jane Smith", "0987654321", "456 Oak St"));
    }

    // Method to retrieve all patients
    public List<Patient> getAllPatients() {
        return patients;
    }

    // Method to retrieve a patient by ID
    public Patient getPatientById(int patientId) {
        for (Patient patient : patients) {
            if (patient.getId() == patientId) {
                return patient;
            }
        }
        return null;
    }

    // Method to add a new patient
    public void addPatient(Patient patient) {
        int newUserId = getNextUserId();
        patient.setId(newUserId);
        patients.add(patient);
    }

    // Method to update an existing patient
    public void updatePatient(Patient updatedPatient) {
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            if (patient.getId() == updatedPatient.getId()) {
                patients.set(i, updatedPatient);
                 System.out.println("Patient updated: " + updatedPatient);
                return;
            }
        }
    }

    // Method to delete a patient by ID
    public void deletePatient(int patientId) {
        patients.removeIf(patient -> patient.getId() == patientId);
    }
    
    public int getNextUserId() {
        // Initialize maxUserId with a value lower than any possible userId
        int maxUserId = Integer.MIN_VALUE;

        // Iterate through the list to find the maximum userId
        for (Patient patient : patients) {
            int userId = patient.getId();
            if (userId > maxUserId) {
                maxUserId = userId;
            }
        }

        // Increment the maximum userId to get the next available userId
        return maxUserId + 1;
    }
}
