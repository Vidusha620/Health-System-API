/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.MedicalRecord;
import com.mycompany.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */

public class MedicalRecordDAO {
    // List to store medical records
    private static final List<MedicalRecord> medicalRecords = new ArrayList<>();

    // Static initialization block to add initial medical records
    static {
        // Example medical records
        Patient patient1 = new Patient(9, "John Doe", "1234567890", "123 Main St");
        Patient patient2 = new Patient(10, "Jane Smith", "0987654321", "456 Oak St");

        medicalRecords.add(new MedicalRecord(1, patient1, "Headache", "Rest and pain relievers"));
        medicalRecords.add(new MedicalRecord(2, patient2, "Sore throat", "Antibiotics and throat lozenges"));
    }

    // Method to retrieve all medical records
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecords;
    }

    // Method to retrieve a medical record by ID
    public MedicalRecord getMedicalRecordById(int id) {
        for (MedicalRecord medicalRecord : medicalRecords) {
            if (medicalRecord.getId() == id) {
                return medicalRecord;
            }
        }
        return null;
    }

    // Method to add a new medical record
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }
    // Method to update an existing medical record
    public void updateMedicalRecord(MedicalRecord updatedMedicalRecord) {
        for (int i = 0; i < medicalRecords.size(); i++) {
            MedicalRecord medicalRecord = medicalRecords.get(i);
            if (medicalRecord.getId() == updatedMedicalRecord.getId()) {
                medicalRecords.set(i, updatedMedicalRecord);
                return;
            }
        }
        throw new IllegalArgumentException("Medical record not found");
    }

    // Method to delete a medical record by ID
    public void deleteMedicalRecord(int id) {
        medicalRecords.removeIf(medicalRecord -> medicalRecord.getId() == id);
    }

    
}
