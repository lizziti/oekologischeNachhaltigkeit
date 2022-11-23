package com.example.project.DTOs;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.Analysis} entity
 */
public class AnalysisDto implements Serializable {
    private final Integer id;
    private final Float average;
    private final Float spread;
    private final SessionDto session;
    private final StatementDto statement;

    public AnalysisDto(Integer id, Float average, Float spread, SessionDto session, StatementDto statement) {
        this.id = id;
        this.average = average;
        this.spread = spread;
        this.session = session;
        this.statement = statement;
    }

    public Integer getId() {
        return id;
    }

    public Float getAverage() {
        return average;
    }

    public Float getSpread() {
        return spread;
    }

    public SessionDto getSession() {
        return session;
    }

    public StatementDto getStatement() {
        return statement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnalysisDto entity = (AnalysisDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.average, entity.average) &&
                Objects.equals(this.spread, entity.spread) &&
                Objects.equals(this.session, entity.session) &&
                Objects.equals(this.statement, entity.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, average, spread, session, statement);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "average = " + average + ", " +
                "spread = " + spread + ", " +
                "session = " + session + ", " +
                "statement = " + statement + ")";
    }
}