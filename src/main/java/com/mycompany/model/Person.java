/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Acer
 */
public class Person {
    private int personId;
    private String name;
    private String contactInfo;
    private String address;
    
    // Constructor
    public Person(int personId, String name, String contactInfo, String address) {
        this.personId = personId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.address = address;
    }
    
    // Getter and setter for id
    public int getId() {
        return personId;
    }
    
    public void setId(int personId) {
        this.personId = personId;
    }
    
    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for contact information
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Getter and setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
