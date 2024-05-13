/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Acer
 */
public class Doctor extends Person{
     private String specialization;

    // Constructor
    public Doctor(int doctorId, String name, String contactInfo, String address) {
        super(doctorId, name, contactInfo, address);
    }

    // Getter and setter for specialization
    public String getSpecialization() {
        return specialization;
    }
    
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
