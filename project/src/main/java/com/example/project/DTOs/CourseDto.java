package com.example.project.DTOs;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.Course} entity
 */
public class CourseDto implements Serializable {
    private final Integer id;
    private final String semester;

    public CourseDto(Integer id, String semester) {
        this.id = id;
        this.semester = semester;
    }

    public Integer getId() {
        return id;
    }

    public String getSemester() {
        return semester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseDto entity = (CourseDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.semester, entity.semester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, semester);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "semester = " + semester + ")";
    }
}