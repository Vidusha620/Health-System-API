/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class PersonDAO {
    // List to store persons
    private static final List<Person> persons = new ArrayList<>();

    // Static initialization block to add initial persons
    static {
        // Example persons
        persons.add(new Person(1, "John Doe", "1234567890", "123 Main St"));
        persons.add(new Person(2, "Jane Smith", "0987654321", "456 Oak St"));
    }

    // Method to retrieve all persons
    public List<Person> getAllPersons() {
        return persons;
    }

    // Method to retrieve a person by ID
    public Person getPersonById(int personId) {
        for (Person person : persons) {
            if (person.getId() == personId) {
                return person;
            }
        }
        return null;
    }

    // Method to add a new person
    public void addPerson(Person person) {
        int newUserId = getNextUserId();
        person.setId(newUserId);
        persons.add(person);
    }

    // Method to update an existing person
    public void updatePerson(Person updatedPerson) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getId() == updatedPerson.getId()) {
                persons.set(i, updatedPerson);
                System.out.println("Person updated: " + updatedPerson);
                return;
            }
        }
    }

    // Method to delete a person by ID
   public void deletePerson(int personId) {
        persons.removeIf(person -> person.getId() == personId);
    }
    
    public int getNextUserId() {
        // Initialize maxUserId with a value lower than any possible userId
        int maxUserId = Integer.MIN_VALUE;

        // Iterate through the list to find the maximum userId
        for (Person person : persons) {
            int userId = person.getId();
            if (userId > maxUserId) {
                maxUserId = userId;
            }
        }

        // Increment the maximum userId to get the next available userId
        return maxUserId + 1;
    }
}
