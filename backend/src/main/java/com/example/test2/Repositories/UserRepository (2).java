package com.example.test2.Repositories;

import com.example.test2.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("select user from UserEntity user where user.email = :email")
    Optional<UserEntity> findByEmail(String email);
}