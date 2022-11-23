package com.example.project.Repositories;

import com.example.project.Entities.Analysis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalysisRepository extends JpaRepository<Analysis, Integer> {
}