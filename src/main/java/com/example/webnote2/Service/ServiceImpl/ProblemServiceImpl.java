package com.example.webnote2.Service.ServiceImpl;

import com.example.webnote2.Dao.ProblemReposity;
import com.example.webnote2.Service.ProblemService;
import com.example.webnote2.model.ProblemEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService{
    @Autowired
    private ProblemReposity problemReposity;

    @Override
    public List<ProblemEntity> queryAllProblem() {
        List<ProblemEntity> problems = problemReposity.findAll();
        return problems;
    }
}
