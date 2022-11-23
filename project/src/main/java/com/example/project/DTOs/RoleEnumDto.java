package com.example.project.DTOs;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.RoleEnum} entity
 */
public class RoleEnumDto implements Serializable {
    private final Integer id;
    private final String role;

    public RoleEnumDto(Integer id, String role) {
        this.id = id;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEnumDto entity = (RoleEnumDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.role, entity.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, role);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "role = " + role + ")";
    }
}