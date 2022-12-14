package com.example.project.Repositories;

import com.example.project.Entities.Token;
import com.example.project.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface TokenRepository extends JpaRepository<Token, String> {

    Token findTokenByUser(User user);

    @Transactional
    @Modifying
    @Query("delete from Token where user = :user_object")
    void deleteAllByUser(@Param("user_object") User user);

    @Query("select token.user from User user, Token token where token.token = :token")
    User findUserByToken(String token);

    @Transactional
    @Modifying
    @Query("delete from Token where token = :token_object")
    void deleteAllByToken(@Param("token_object")String token);
}