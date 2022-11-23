package com.example.project.DTOs;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.TRB} entity
 */
public class TRBDto implements Serializable {
    private final Integer id;
    private final Integer evaluation;
    private final StudentDto student;
    private final SessionDto session;
    private final StatementDto statement;

    public TRBDto(Integer id, Integer evaluation, StudentDto student, SessionDto session, StatementDto statement) {
        this.id = id;
        this.evaluation = evaluation;
        this.student = student;
        this.session = session;
        this.statement = statement;
    }

    public Integer getId() {
        return id;
    }

    public Integer getEvaluation() {
        return evaluation;
    }

    public StudentDto getStudent() {
        return student;
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
        TRBDto entity = (TRBDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.evaluation, entity.evaluation) &&
                Objects.equals(this.student, entity.student) &&
                Objects.equals(this.session, entity.session) &&
                Objects.equals(this.statement, entity.statement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, evaluation, student, session, statement);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "evaluation = " + evaluation + ", " +
                "student = " + student + ", " +
                "session = " + session + ", " +
                "statement = " + statement + ")";
    }
}