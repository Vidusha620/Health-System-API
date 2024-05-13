/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resource;

import com.mycompany.dao.PersonDAO;
import com.mycompany.model.Person;
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

@Path("/persons")
public class PersonResource {

    private PersonDAO personDAO = new PersonDAO();

    /**
     *
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getAllPersons() {
        return personDAO.getAllPersons();
    }

    @GET
    @Path("/{personId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonById(@PathParam("personId") int personId) {
        return personDAO.getPersonById(personId);
    }

 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPerson(Person person) {
        personDAO.addPerson(person);
    }

    @PUT
    @Path("/{personId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePerson(@PathParam("personId") int personId, Person updatedPerson) {
        Person existingPerson = personDAO.getPersonById(personId);

        if (existingPerson != null) {
            updatedPerson.setId(personId);
            personDAO.updatePerson(updatedPerson);
        }
    }

    @DELETE
    @Path("/{personId}")
    public void deletePerson(@PathParam("personId") int personId) {
        personDAO.deletePerson(personId);
    }
}
