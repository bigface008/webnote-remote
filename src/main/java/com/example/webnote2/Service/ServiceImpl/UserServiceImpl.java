package com.example.webnote2.Service.ServiceImpl;

import com.example.webnote2.Dao.UserReposity;
import com.example.webnote2.Service.UserService;
import com.example.webnote2.model.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserReposity userReposity;

    @Override
    public List<UserEntity> queryAllUser() {
        List<UserEntity> users = userReposity.findAll();
        return users;
    }
}
