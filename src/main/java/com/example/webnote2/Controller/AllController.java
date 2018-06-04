package com.example.webnote2.Controller;

import com.example.webnote2.Service.UserService;
import com.example.webnote2.Service.ProblemService;
import com.example.webnote2.model.UserEntity;
import com.example.webnote2.model.ProblemEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import net.sf.json.JSONArray;

import java.util.List;
import java.util.ArrayList;

@Controller
public class AllController {
    @Autowired
    private UserService userService;
    private ProblemService problemService;

    @GetMapping(value = "/all")
    public List<JSONArray> getAllSource() {
        List<JSONArray> result = new ArrayList<>();
        result.add(JSONArray.fromObject(problemService.queryAllProblem()));
        result.add(JSONArray.fromObject(userService.queryAllUser()));
        return result;
    }
}
