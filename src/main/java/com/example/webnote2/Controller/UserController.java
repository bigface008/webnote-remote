package com.example.webnote2.Controller;

import com.example.webnote2.Service.UserService;
import com.example.webnote2.model.ProblemEntity;
import com.example.webnote2.model.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/all")
    @ResponseBody
    public List<UserEntity> queryAllUser() {
        return userService.queryAllUser();
    }
}
