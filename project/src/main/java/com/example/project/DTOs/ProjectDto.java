package com.example.project.DTOs;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.Project} entity
 */
public class ProjectDto implements Serializable {
    private final Integer id;
    private final String topic;
    private final String endDate;
    private final String startDate;
    private final String information;
    private final Blob document;

    public ProjectDto(Integer id, String topic, String endDate, String startDate, String information, Blob document) {
        this.id = id;
        this.topic = topic;
        this.endDate = endDate;
        this.startDate = startDate;
        this.information = information;
        this.document = document;
    }

    public Integer getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getInformation() {
        return information;
    }

    public Blob getDocument() {
        return document;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectDto entity = (ProjectDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.topic, entity.topic) &&
                Objects.equals(this.endDate, entity.endDate) &&
                Objects.equals(this.startDate, entity.startDate) &&
                Objects.equals(this.information, entity.information) &&
                Objects.equals(this.document, entity.document);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topic, endDate, startDate, information, document);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "topic = " + topic + ", " +
                "endDate = " + endDate + ", " +
                "startDate = " + startDate + ", " +
                "information = " + information + ", " +
                "document = " + document + ")";
    }
}