package com.example.project.Controller;

import com.example.project.DTOs.LoginDto;
import com.example.project.DTOs.TokenDto;
import com.example.project.Entities.Token;
import com.example.project.Entities.User;
import com.example.project.Repositories.TokenRepository;
import com.example.project.Repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    private final UserRepository userRepository;
    private final TokenRepository tokenRepository;

    LoginController(UserRepository userRepository,
                    TokenRepository tokenRepository) {
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
    }

    @PostMapping("/login")
    String login(@RequestBody LoginDto loginData){
        User user = userRepository.findUserByUsername(loginData.getUsername()).orElseThrow();
        if(user.getPassword().equals(loginData.getPassword())) {
            tokenRepository.deleteAllByUser(user);
            tokenRepository.save(new Token(user));
            return tokenRepository.findTokenByUser(user).getToken();
        }
        return "";
    }

    @DeleteMapping("/logout")
    String login(@RequestBody TokenDto token){
        tokenRepository.deleteAllByToken(token.getToken());
        return "";
    }

}