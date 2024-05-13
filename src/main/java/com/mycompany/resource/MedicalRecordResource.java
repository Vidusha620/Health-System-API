/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resource;

import com.mycompany.dao.MedicalRecordDAO;
import com.mycompany.model.MedicalRecord;
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
import javax.ws.rs.core.Response;

/**
 *
 * @author Acer
 */
@Path("/medicalrecords")
public class MedicalRecordResource {

    private MedicalRecordDAO medicalRecordDAO = new MedicalRecordDAO();


    // Get all medical records
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MedicalRecord> getAllMedicalRecords() {
        return medicalRecordDAO.getAllMedicalRecords();
    }


    // Get medical record by ID
    @GET
    @Path("/{medicalRecordId}")
    @Produces(MediaType.APPLICATION_JSON)
    public MedicalRecord getMedicalRecordById(@PathParam("medicalRecordId") int medicalRecordId) {
        return medicalRecordDAO.getMedicalRecordById(medicalRecordId);
    }


    // Add a new medical record
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordDAO.addMedicalRecord(medicalRecord);
    }

    // Update an existing medical record
    @PUT
    @Path("/{medicalRecordId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateMedicalRecord(@PathParam("medicalRecordId") int medicalRecordId, MedicalRecord updatedMedicalRecord) {
        MedicalRecord existingMedicalRecord = medicalRecordDAO.getMedicalRecordById(medicalRecordId);

        if (existingMedicalRecord != null) {
            updatedMedicalRecord.setId(medicalRecordId);
            medicalRecordDAO.updateMedicalRecord(updatedMedicalRecord);
        }
    }

    // Delete a medical record by ID
    @DELETE
    @Path("/{medicalRecordId}")
    public void deleteMedicalRecord(@PathParam("medicalRecordId") int medicalRecordId) {
        medicalRecordDAO.deleteMedicalRecord(medicalRecordId);
    }
}

