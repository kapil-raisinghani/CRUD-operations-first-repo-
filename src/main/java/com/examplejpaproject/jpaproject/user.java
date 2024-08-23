package com.examplejpaproject.jpaproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class user {
    @Id // This means that the field is the primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // This means that the field is auto-generated

    // generate getters and setters

    private int id;
    private String name;
    private String city;

    public user(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public user() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override // This is for debugging purposes
    public String toString() {
        return "user [id=" + id + ", name=" + name + ", city=" + city + "]";
    }

}
