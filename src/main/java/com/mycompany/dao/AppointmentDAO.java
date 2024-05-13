/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.Appointment;
import com.mycompany.model.Doctor;
import com.mycompany.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class AppointmentDAO {
    // List to store appointments
    private static List<Appointment> appointments = new ArrayList<>();

    // Static initialization block to add initial appointments
    static {
        Doctor doctor1 = new Doctor(7, "Mr. Smith", "+94702437807", "21, Temple road, Ratmalana");
        Patient patient1 = new Patient(8, "Miss Anna", "+94774591230", "34/A, Kandy road, Kadawatha");

        // Example appointment using the initialized doctor and patient
        appointments.add(new Appointment(1, "2024-05-06", "10:00 AM", patient1, doctor1));
    }

    // Method to retrieve all appointments
    public List<Appointment> getAllAppointments() {
        return appointments;
    }

    // Method to retrieve an appointment by ID
    public Appointment getAppointmentById(int appintmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getId() == appintmentId) {
                return appointment;
            }
        }
        return null;
    }

    // Method to add a new appointment
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // Method to update an existing appointment
    public void updateAppointment(Appointment updatedAppointment) {
        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            if (appointment.getId() == updatedAppointment.getId()) {
                appointments.set(i, updatedAppointment);
                return;
            }
        }
    }

    // Method to delete an appointment by ID
    public void deleteAppointment(int appintmentId) {
        appointments.removeIf(appointment -> appointment.getId() == appintmentId);
    }
}
