package com.lyy.usermanage.controller;

import com.lyy.usermanage.bojo.LearnResouce;
import com.lyy.usermanage.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lee on 2018/4/10.
 */
@RestController
public class UserController {
    @Autowired
    LearnService learnService;

    @RequestMapping(value = "/addLearnCouse")
    public String getUser(){
        LearnResouce learnResouce = new LearnResouce();
        learnResouce.setAuthor("lyy");
        learnResouce.setTitle("this is testing");
        learnResouce.setUrl("http://www.baidu.com");
        int result = learnService.add(learnResouce);
        return "hello, congroller---"+result;
    }
}
