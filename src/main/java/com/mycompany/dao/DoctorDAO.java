/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class DoctorDAO {
    // List to store doctors
    private static List<Doctor> doctors = new ArrayList<>();

    // Static initialization block to add initial doctors
    static {
        // Example doctors
        doctors.add(new Doctor(5, "Dr. John Smith", "1234567890", "123 Main St"));
        doctors.add(new Doctor(6, "Dr. Sarah Johnson", "0987654321", "456 Oak St"));
    }

    // Method to retrieve all doctors
    public List<Doctor> getAllDoctors() {
        return doctors;
    }

    // Method to retrieve a doctor by ID
    public Doctor getDoctorById(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }

    // Method to add a new doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to update an existing doctor
    public void updateDoctor(Doctor updatedDoctor) {
        for (int i = 0; i < doctors.size(); i++) {
            Doctor doctor = doctors.get(i);
            if (doctor.getId() == updatedDoctor.getId()) {
                doctors.set(i, updatedDoctor);
                return;
            }
        }
    }

    // Method to delete a doctor by ID
    public void deleteDoctor(int doctorId) {
        doctors.removeIf(doctor -> doctor.getId() == doctorId);
    }
}
