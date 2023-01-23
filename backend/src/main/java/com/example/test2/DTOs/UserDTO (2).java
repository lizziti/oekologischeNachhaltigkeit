package com.example.test2.DTOs;
public class UserDTO {
    private String email;
    private String password;
    private Integer faculty;
    private Boolean role;
    private String first_name;
    private String last_name;

    public UserDTO(String email, String password, Integer faculty, Boolean role, String firstName, String lastName){
        this.email = email;
        this.password = password;
        this.faculty = faculty;
        this.role = role;
        first_name = firstName;
        last_name = lastName;
    }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password;}

    public void setPassword(String password) { this.password = password;}

    public Integer getFaculty() {
        return faculty;
    }

    public void setFaculty(Integer faculty) {
        this.faculty = faculty;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}