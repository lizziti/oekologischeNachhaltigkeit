package com.example.test2.Controller;

import com.example.test2.DTOs.ProjectDTO;
import com.example.test2.DTOs.TextDTO;
import com.example.test2.Entities.ProjectEntity;
import com.example.test2.Repositories.ProjectRepository;
import com.google.gson.Gson;
import jakarta.persistence.criteria.Order;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {
    private final ProjectRepository projectRepository;

    ProjectController (ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    @PostMapping("/newProject")
    private String NewProject(@RequestBody ProjectDTO projectDTO){
        ProjectEntity project = new ProjectEntity();
        project.setTopic(projectDTO.getTopic());
        project.setStart_date(projectDTO.getStart_date());
        projectRepository.save(project);
        return "Project saved!";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getProjects")
    private String GetProjects(){
        List<ProjectEntity> projects = projectRepository.findAll();
        return new Gson().toJson(projects);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getProject/{id}")
    private String GetProject(@PathVariable Long id){
        Optional<ProjectEntity> project = projectRepository.findById(id);
        return new Gson().toJson(project);
    }

    @PostMapping("/addText")
    private String AddTest(@RequestBody TextDTO textDTO){
        Optional<ProjectEntity> projectOpt = projectRepository.findById(textDTO.getId());
        if(projectOpt.isEmpty()) return "Project not found!";
        ProjectEntity project = projectOpt.get();
        project.setText(textDTO.getText());
        projectRepository.save(project);
        return "";
    }
}
