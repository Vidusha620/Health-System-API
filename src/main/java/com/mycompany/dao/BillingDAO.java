/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.Billing;
import com.mycompany.model.Patient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */

public class BillingDAO {
    // List to store bills
    private static List<Billing> bills = new ArrayList<>();

    // Static initialization block to add initial bills
    static {
        Patient patient1 = new Patient(1, "John Doe", "+1234567890", "123 Main St");

        // Example bills using the initialized patient
        bills.add(new Billing(13, patient1, "INV-001", 100.0, 50.0));
        bills.add(new Billing(14, patient1, "INV-002", 200.0, 100.0));
    }

    // Method to retrieve all bills
    public List<Billing> getAllBills() {
        return bills;
    }

    // Method to retrieve a bill by ID
    public Billing getBillById(int billId) {
        for (Billing bill : bills) {
            if (bill.getId() == billId) {
                return bill;
            }
        }
        return null;
    }

    // Method to add a new bill
    public void addBill(Billing bill) {
        bills.add(bill);
    }

    // Method to update an existing bill
    public void updateBill(Billing updatedBill) {
        for (int i = 0; i < bills.size(); i++) {
            Billing bill = bills.get(i);
            if (bill.getId() == updatedBill.getId()) {
                bills.set(i, updatedBill);
                return;
            }
        }
    }

    // Method to delete a bill by ID
    public void deleteBill(int billId) {
        bills.removeIf(bill -> bill.getId() == billId);
    }
}
