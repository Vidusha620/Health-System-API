/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Acer
 */
public class Billing {
    private int billId;
    private Patient patient;
    private String invoice;
    private double payment;
    private double balance;
    
    // Constructor
    public Billing(int billId, Patient patient, String invoice, double payment, double balance) {
        this.billId = billId;
        this.patient = patient;
        this.invoice = invoice;
        this.payment = payment;
        this.balance = balance;
    }
    
    // Getters and setters
    public int getId() {
        return billId;
    }
    
    public void setId(int billId) {
        this.billId = billId;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
    
    public double getPayment() {
        return payment;
    }
    
    public void setPayment(Double payment) {
        this.payment = payment;
    }
    
    public double balance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
