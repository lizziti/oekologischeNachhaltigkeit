package com.example.project.DTOs;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.Lecturer} entity
 */
public class LecturerDto implements Serializable {
    private final Integer id;
    private final List<CourseDto> courses;
    private final String title;
    private final UserDto user;

    public LecturerDto(Integer id, List<CourseDto> courses, String title, UserDto user) {
        this.id = id;
        this.courses = courses;
        this.title = title;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public String getTitle() {
        return title;
    }

    public UserDto getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LecturerDto entity = (LecturerDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.courses, entity.courses) &&
                Objects.equals(this.title, entity.title) &&
                Objects.equals(this.user, entity.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courses, title, user);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "courses = " + courses + ", " +
                "title = " + title + ", " +
                "user = " + user + ")";
    }
}