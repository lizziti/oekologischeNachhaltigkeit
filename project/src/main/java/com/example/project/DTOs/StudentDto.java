package com.example.project.DTOs;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.Student} entity
 */
public class StudentDto implements Serializable {
    private final String matriculationNumber;
    private final List<ProjectDto> projects;
    private final UserDto user;

    public StudentDto(String matriculationNumber, List<ProjectDto> projects, UserDto user) {
        this.matriculationNumber = matriculationNumber;
        this.projects = projects;
        this.user = user;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public List<ProjectDto> getProjects() {
        return projects;
    }

    public UserDto getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto entity = (StudentDto) o;
        return Objects.equals(this.matriculationNumber, entity.matriculationNumber) &&
                Objects.equals(this.projects, entity.projects) &&
                Objects.equals(this.user, entity.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matriculationNumber, projects, user);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "matriculationNumber = " + matriculationNumber + ", " +
                "projects = " + projects + ", " +
                "user = " + user + ")";
    }
}