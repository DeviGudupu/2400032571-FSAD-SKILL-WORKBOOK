package com.example;

import org.springframework.stereotype.Component;

@Component
public class Certification {
    private int id = 101;
    private String name = "Spring Core Certification";
    private String dateOfCompletion = "2026-03-01";

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDateOfCompletion() { return dateOfCompletion; }

    @Override
    public String toString() {
        return "Certification{id=" + id + ", name='" + name + "', dateOfCompletion='" + dateOfCompletion + "'}";
    }
}
