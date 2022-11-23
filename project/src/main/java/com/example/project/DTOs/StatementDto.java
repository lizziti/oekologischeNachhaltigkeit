package com.example.project.DTOs;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.Statement} entity
 */
public class StatementDto implements Serializable {
    private final Integer id;
    private final String statement;
    private final Boolean currentlyUsed;

    public StatementDto(Integer id, String statement, Boolean currentlyUsed) {
        this.id = id;
        this.statement = statement;
        this.currentlyUsed = currentlyUsed;
    }

    public Integer getId() {
        return id;
    }

    public String getStatement() {
        return statement;
    }

    public Boolean getCurrentlyUsed() {
        return currentlyUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatementDto entity = (StatementDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.statement, entity.statement) &&
                Objects.equals(this.currentlyUsed, entity.currentlyUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statement, currentlyUsed);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "statement = " + statement + ", " +
                "currentlyUsed = " + currentlyUsed + ")";
    }
}