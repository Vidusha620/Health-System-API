/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.Patient;
import com.mycompany.model.Prescription;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class PrescriptionDAO {
    // List to store prescriptions
    private static List<Prescription> prescriptions = new ArrayList<>();

    // Static initialization block to add initial prescriptions
    static {
        // Example prescriptions
        Patient patient1 = new Patient(11, "John Doe", "1234567890", "123 Main St");
        prescriptions.add(new Prescription(12, patient1, "Medication A", "Take twice daily", "2 weeks"));
        
        Patient patient2 = new Patient(2, "Jane Smith", "0987654321", "456 Oak St");
        prescriptions.add(new Prescription(2, patient2, "Medication B", "Take with food", "1 month"));
    }

    // Method to retrieve all prescriptions
    public List<Prescription> getAllPrescriptions() {
        return prescriptions;
    }

    // Method to retrieve a prescription by ID
    public Prescription getPrescriptionById(int prescriptionId) {
        for (Prescription prescription : prescriptions) {
            if (prescription.getId() == prescriptionId) {
                return prescription;
            }
        }
        return null;
    }

    // Method to add a new prescription
    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }

   // Method to update an existing prescription
    public void updatePrescription(Prescription updatedPrescription) {
        for (int i = 0; i < prescriptions.size(); i++) {
            Prescription prescription = prescriptions.get(i);
            if (prescription.getId() == updatedPrescription.getId()) {
                prescriptions.set(i, updatedPrescription);
                return;
            }
        }
        throw new IllegalArgumentException("Prescription not found");
    }
// Method to delete a prescription by ID
public void deletePrescription(int prescriptionId) {
        prescriptions.removeIf(prescription -> prescription.getId() == prescriptionId);
    }
}
