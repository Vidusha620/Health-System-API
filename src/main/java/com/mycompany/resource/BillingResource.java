/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resource;

import com.mycompany.dao.BillingDAO;
import com.mycompany.model.Billing;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Acer
 */
@Path("/billing")
public class BillingResource {

    private BillingDAO billingDAO = new BillingDAO();

    // Get all bills
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Billing> getAllBills() {
        return billingDAO.getAllBills();
    }

    // Get bill by ID
    @GET
    @Path("/{billId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Billing getBillById(@PathParam("billId") int billId) {
        return billingDAO.getBillById(billId);
    }


    // Add a new bill
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addBill(Billing bill) {
        billingDAO.addBill(bill);
    }

    // Update an existing bill
    @PUT
    @Path("/{billId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateBill(@PathParam("billId") int billId, Billing updatedBill) {
        Billing existingBill = billingDAO.getBillById(billId);

        if (existingBill != null) {
            updatedBill.setId(billId);
            billingDAO.updateBill(updatedBill);
        }
    }
    // Delete a bill by ID
    @DELETE
    @Path("/{billId}")
    public void deleteBill(@PathParam("billId") int billId) {
        billingDAO.deleteBill(billId);
    }
}

