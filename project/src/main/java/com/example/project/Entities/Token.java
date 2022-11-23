package com.example.project.Entities;

import javax.persistence.*;

@Entity
@Table(name = "token")
public class Token {
    @Id
    @Column(name = "token", nullable = false)
    private String token;

    public String getToken() {
        return token;
    }

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setToken(String token) {
        this.token = token;
    }

}