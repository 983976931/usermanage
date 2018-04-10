package com.lyy.usermanage.controller;

import com.lyy.usermanage.bojo.LearnResouce;
import com.lyy.usermanage.service.LearnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Lee on 2018/4/10.
 */
@Controller
public class LearnResourceController {

//    局部变量
    @Autowired
    LearnService learnService;

    @RequestMapping("/add")
    @ResponseBody
    public String addLearnResource(){
        for(int i=0;i<10;i++){
            LearnResouce learnResouce = new LearnResouce();
            learnResouce.setAuthor("lyy--"+i);
            learnResouce.setTitle("this is testing");
            learnResouce.setUrl("http://www.baidu.com");
            learnService.add(learnResouce);
        }
        return "add over";
    }

    @ResponseBody
    @RequestMapping("/get")
    public String getLearnResource(){
        List<LearnResouce> learnList = learnService.getAllLearnResource();
        System.out.println(learnList.size());
        return String.valueOf(learnList.size());
    }
}
