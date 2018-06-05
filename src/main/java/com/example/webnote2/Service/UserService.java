package com.example.webnote2.Service;

import com.example.webnote2.model.UserEntity;

import java.util.List;

public interface UserService {
//    UserEntity queryUser(String name, String password);
    List<UserEntity> queryAllUser();
}
