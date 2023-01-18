package com.example.test2.DTOs;

import java.util.List;

public class AddProjectDTO {
    private Long project_id;
    private Long[] user_ids;

    AddProjectDTO(Long project_id, Long[] user_ids){
        this.project_id = project_id;
        this.user_ids = user_ids;
    }

    public Long[] getUser_ids() {
        return user_ids;
    }

    public void setUser_ids(Long[] user_ids) {
        this.user_ids = user_ids;
    }

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }
}
