/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resource;

import com.mycompany.dao.AppointmentDAO;
import com.mycompany.model.Appointment;
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
@Path("/appointments")
public class AppointmentResource {

    private AppointmentDAO appointmentDAO = new AppointmentDAO();


    // Get all appointments
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Appointment> getAllAppointments() {
        return appointmentDAO.getAllAppointments();
    }


    // Get appointment by ID
    @GET
    @Path("/{appointmentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Appointment getAppointmentById(@PathParam("appointmentId") int appointmentId) {
        return appointmentDAO.getAppointmentById(appointmentId);
    }

    // Add a new appointment
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addAppointment(Appointment appointment) {
        appointmentDAO.addAppointment(appointment);
    }


    // Update an existing appointment
    @PUT
    @Path("/{appointmentId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateAppointment(@PathParam("appointmentId") int appointmentId, Appointment updatedAppointment) {
        Appointment existingAppointment = appointmentDAO.getAppointmentById(appointmentId);

        if (existingAppointment == null) {
            updatedAppointment.setId(appointmentId);
            appointmentDAO.updateAppointment(updatedAppointment);
        }
    }

    // Delete an appointment by ID
    @DELETE
    @Path("/{appointmentId}")
    public void deleteAppointment(@PathParam("appointmentId") int appointmentId) {
        appointmentDAO.deleteAppointment(appointmentId);
    }

}

