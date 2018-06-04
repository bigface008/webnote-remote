package com.example.webnote2.Controller;

import com.example.webnote2.Service.ProblemService;
import com.example.webnote2.model.ProblemEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    @GetMapping(value = "/problem/all")
    @ResponseBody
    public List<ProblemEntity> queryAllProblem(){
        return problemService.queryAllProblem();
    }
}
