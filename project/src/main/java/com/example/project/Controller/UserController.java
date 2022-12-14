package com.example.project.Controller;

import com.example.project.DTOs.TokenDto;
import com.example.project.DTOs.UserDto;
import com.example.project.Entities.User;
import com.example.project.Repositories.TokenRepository;
import com.example.project.Repositories.UserRepository;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;

    UserController (UserRepository userRepository,
                    TokenRepository tokenRepository){
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
    }

    @GetMapping("/getUser")
    String getUser(@RequestBody TokenDto token){
        User user = tokenRepository.findUserByToken(token.getToken());
        return new Gson().toJson(user);
    }

    @PostMapping("/createUser")
    String createUser(@RequestBody UserDto userDto){
        Optional<User> user1 = userRepository.findUserByUsername(userDto.getUsername());
        if(user1.isPresent()){return "Username already exists!";}
        User user2 = new User(userDto.getUsername(), userDto.getPassword(), userDto.getFirstName(), userDto.getLastName(),
                userDto.getFaculty(), userDto.getEmail(), userDto.getRole());
        userRepository.save(user2);
        return "";
    }

    @DeleteMapping("/deleteUser")
    String updateUser(@RequestBody UserDto userDto){
        userRepository.deleteUserByUsername(userDto.getUsername());
        return "";
    }
}
