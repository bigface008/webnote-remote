package com.example.webnote2.Dao;

import com.example.webnote2.model.ProblemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemReposity extends JpaRepository<ProblemEntity, Integer>{
}
