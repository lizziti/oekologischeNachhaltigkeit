package com.example.project.Repositories;

import com.example.project.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByUsername(String username);

    @Transactional
    @Modifying
    @Query("delete from User user where user.username = :username")
    void deleteUserByUsername(@Param("username")String username);
}