package com.example.project.DTOs;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.example.project.Entities.Token} entity
 */
public class TokenDto implements Serializable {
    private String token;
    private UserDto user;

    public TokenDto(String token, UserDto user) {
        this.token = token;
        this.user = user;
    }

    public TokenDto(){}

    public void setToken(String token){this.token = token;}

    public void setUser(UserDto user){this.user = user;}

    public String getToken() {
        return token;
    }

    public UserDto getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TokenDto entity = (TokenDto) o;
        return Objects.equals(this.token, entity.token) &&
                Objects.equals(this.user, entity.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, user);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "token = " + token + ", " +
                "user = " + user + ")";
    }
}