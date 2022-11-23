package com.example.project.DTOs;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.Session} entity
 */
public class SessionDto implements Serializable {
    private final Integer id;
    private final Integer sessionNumber;
    private final LocalDate date;
    private final ProjectDto project;

    public SessionDto(Integer id, Integer sessionNumber, LocalDate date, ProjectDto project) {
        this.id = id;
        this.sessionNumber = sessionNumber;
        this.date = date;
        this.project = project;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSessionNumber() {
        return sessionNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public ProjectDto getProject() {
        return project;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SessionDto entity = (SessionDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.sessionNumber, entity.sessionNumber) &&
                Objects.equals(this.date, entity.date) &&
                Objects.equals(this.project, entity.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sessionNumber, date, project);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "sessionNumber = " + sessionNumber + ", " +
                "date = " + date + ", " +
                "project = " + project + ")";
    }
}