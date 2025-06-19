package com.skilljournal.model;

import jakarta.persistence.*;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int hoursSpent;

    public Skill() {}

    public Skill(String name, String description, int hoursSpent) {
        this.name = name;
        this.description = description;
        this.hoursSpent = hoursSpent;
    }

    // Getters & Setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getHoursSpent() { return hoursSpent; }
    public void setHoursSpent(int hoursSpent) { this.hoursSpent = hoursSpent; }
}

