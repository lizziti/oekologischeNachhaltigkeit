package com.example.test2.Controller;

import com.example.test2.DTOs.AddProjectDTO;
import com.example.test2.DTOs.LoginDTO;
import com.example.test2.DTOs.UserDTO;
import com.example.test2.Entities.ProjectEntity;
import com.example.test2.Entities.UserEntity;
import com.example.test2.Repositories.ProjectRepository;
import com.example.test2.Repositories.UserRepository;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;

    UserController(UserRepository userRepository, ProjectRepository projectRepository){
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
    }

    @PostMapping ("/login")
    public String Login(@RequestBody LoginDTO loginDTO){
        Optional<UserEntity> user = userRepository.findByEmail(loginDTO.getEmail());
        if(user.isEmpty())
            return "email does not exist!";
        if(user.get().getPassword() == loginDTO.getPassword())
            return "" + user.get().getId();
        return "password is wrong!";
    }

    @PostMapping("/register")
    public String Register(@RequestBody UserDTO userDTO){
        if (userRepository.findByEmail(userDTO.getEmail()).isPresent())
            return "email is already registered!";
        UserEntity user = new UserEntity();
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setFaculty(userDTO.getFaculty());
        user.setFirst_name(userDTO.getFirst_name());
        user.setLast_name(userDTO.getLast_name());
        user.setRole(userDTO.getRole());
        userRepository.save(user);
        return "" + userRepository.findByEmail(user.getEmail()).get().getId();
    }

    @PostMapping("/addProjectToUser")
    public String AddProjectToUser(@RequestBody AddProjectDTO addProjectDTO){
        Optional<ProjectEntity> project = projectRepository.findById(addProjectDTO.getProject_id());
        if(project.isEmpty())
            return "project does not exist!";
        for (UserEntity user: userRepository.findAllById(List.of(addProjectDTO.getUser_ids()))){
            user.setProject(project.get());
            userRepository.save(user);
        }
        return " ";
    }

    @GetMapping("/getProject/{user_id}")
    private String GetProject(@PathVariable Long user_id){
        Optional<UserEntity> userOpt = userRepository.findById(user_id);
        if(userOpt.isEmpty()) return "User not found!";
        return new Gson().toJson(userOpt.get().getProject());
    }
}
