package com.example.project.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "matriculation_number", nullable = false)
    private String matriculationNumber;

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    @ManyToMany
    @JoinTable(name = "student_projects",
            joinColumns = @JoinColumn(name = "student_matriculation_number"),
            inverseJoinColumns = @JoinColumn(name = "projects_id"))
    private List<Project> projects = new ArrayList<>();

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}