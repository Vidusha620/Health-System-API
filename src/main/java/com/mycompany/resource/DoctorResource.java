/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resource;

import com.mycompany.dao.DoctorDAO;
import com.mycompany.model.Doctor;
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
@Path("/doctors")
public class DoctorResource {

    private DoctorDAO doctorDAO = new DoctorDAO();

    
    // Get all doctors
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doctor> getAllDoctors() {
        return doctorDAO.getAllDoctors();
    }


    // Get doctor by ID
    @GET
    @Path("/{doctorId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Doctor getDoctorById(@PathParam("doctorId") int doctorId) {
        return doctorDAO.getDoctorById(doctorId);
    }

    // Add a new doctor
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addDoctor(Doctor doctor) {
        doctorDAO.addDoctor(doctor);
    }


    // Update an existing doctor
    @PUT
    @Path("/{doctorId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateDoctor(@PathParam("doctorId") int doctorId, Doctor updatedDoctor) {
        Doctor existingDoctor = doctorDAO.getDoctorById(doctorId);

        if (existingDoctor != null) {
            updatedDoctor.setId(doctorId);
            doctorDAO.updateDoctor(updatedDoctor);
        }
    }

    // Delete a doctor by ID
    @DELETE
    @Path("/{doctorId}")
    public void deleteDoctor(@PathParam("doctorId") int doctorId) {
        doctorDAO.deleteDoctor(doctorId);
    }
}

