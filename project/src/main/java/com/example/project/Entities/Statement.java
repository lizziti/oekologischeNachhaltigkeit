package com.example.project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "statement")
public class Statement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "statement", nullable = false, unique = true, length = 1000)
    private String statement;

    @Column(name = "currently_used", nullable = false)
    private Boolean currentlyUsed = false;

    public Boolean getCurrentlyUsed() {
        return currentlyUsed;
    }

    public void setCurrentlyUsed(Boolean currentlyUsed) {
        this.currentlyUsed = currentlyUsed;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}