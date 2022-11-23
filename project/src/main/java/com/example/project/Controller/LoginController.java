package com.example.project.Controller;

import com.example.project.DTOs.LoginDto;
import com.example.project.DTOs.TokenDto;
import com.example.project.Entities.Token;
import com.example.project.Entities.User;
import com.example.project.Repositories.TokenRepository;
import com.example.project.Repositories.UserRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LoginController {

    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;

    LoginController(UserRepository userRepository,
                    TokenRepository tokenRepository) {
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
    }
/*
    @PostMapping("/login")
    TokenDto login(@RequestBody LoginDto loginData){

    }

    @DeleteMapping("/logout")
    String login(@RequestBody TokenDto token){

    }
 */g
}