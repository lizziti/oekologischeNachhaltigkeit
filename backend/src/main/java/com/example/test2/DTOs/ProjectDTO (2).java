package com.example.test2.DTOs;

import java.time.LocalDate;

public class ProjectDTO {
    private LocalDate start_date;
    private String topic;


    public ProjectDTO(LocalDate startDate, String topic) {
        start_date = startDate;
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }
}
