package com.example.project.Repositories;

import com.example.project.Entities.Statement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatementRepository extends JpaRepository<Statement, Integer> {
}