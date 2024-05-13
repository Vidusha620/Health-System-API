/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resource;

import com.mycompany.dao.PatientDAO;
import com.mycompany.model.Patient;
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
@Path("/patients")
public class PatientResource {

    private PatientDAO patientDAO = new PatientDAO();
    

    // Get all patients
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Patient> getAllPatients(){
        return patientDAO.getAllPatients();
    
    }

    // Get patient by ID
    @Path("/{patientId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getPatientById(@PathParam("patientId") int patientId) {
        return patientDAO.getPatientById(patientId);
    }

    // Add a new patient
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPatient(Patient patient) {
        patientDAO.addPatient(patient);
    }


    // Update an existing patient
    @PUT
    @Path("/{patientId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePatient(@PathParam("patientId") int patientId, Patient updatedPatient) {
        Patient existingPatient = patientDAO.getPatientById(patientId);

        if (existingPatient != null) {
            updatedPatient.setId(patientId);
            patientDAO.updatePatient(updatedPatient);
        }
    }

    // Delete a patient by ID
    @DELETE
    @Path("/{patientId}")
    public void deletePatient(@PathParam("patientId") int patientId) {
        patientDAO.deletePatient(patientId);
    }
    
}