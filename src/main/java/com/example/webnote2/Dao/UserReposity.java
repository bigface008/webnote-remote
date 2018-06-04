package com.example.webnote2.Dao;

import com.example.webnote2.model.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<UserEntity, Integer>{
}
