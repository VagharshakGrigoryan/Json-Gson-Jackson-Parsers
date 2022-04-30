package com.epam.json.entity;

import java.util.List;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private Course course;

    private List<String> personalContacts;

    public Person() {
    }

    public Person(String firstName, String lastName, Course course, List<String> personalContacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.personalContacts = personalContacts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<String> getPersonalContacts() {
        return personalContacts;
    }

    public void setPersonalContacts(List<String> personalContacts) {
        this.personalContacts = personalContacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", personalContacts=" + personalContacts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(course, person.course) && Objects.equals(personalContacts, person.personalContacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, course, personalContacts);
    }
}
