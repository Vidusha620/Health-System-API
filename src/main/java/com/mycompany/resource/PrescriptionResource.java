/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resource;

import com.mycompany.dao.PrescriptionDAO;
import com.mycompany.model.Prescription;
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
@Path("/prescriptions")
public class PrescriptionResource {

    private PrescriptionDAO prescriptionDAO = new PrescriptionDAO();


    // Get all prescriptions
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Prescription> getAllPrescriptions() {
        return prescriptionDAO.getAllPrescriptions();
    }

    
    // Get prescription by ID
    @GET
    @Path("/{prescriptionId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Prescription getPrescriptionById(@PathParam("prescriptionId") int prescriptionId) {
        return prescriptionDAO.getPrescriptionById(prescriptionId);
    }


    // Add a new prescription
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPrescription(Prescription prescription) {
        prescriptionDAO.addPrescription(prescription);
    }


    // Update an existing prescription
    @PUT
    @Path("/{prescriptionId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePrescription(@PathParam("prescriptionId") int prescriptionId, Prescription updatedPrescription) {
        Prescription existingPrescription = prescriptionDAO.getPrescriptionById(prescriptionId);

        if (existingPrescription != null) {
            updatedPrescription.setId(prescriptionId);
            prescriptionDAO.updatePrescription(updatedPrescription);
        }
    }

    // Delete a prescription by ID
    @DELETE
    @Path("/{prescriptionId}")
    public void deletePrescription(@PathParam("prescriptionId") int prescriptionId) {
        prescriptionDAO.deletePrescription(prescriptionId);
    }
    }

