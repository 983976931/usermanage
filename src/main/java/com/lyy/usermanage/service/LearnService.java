package com.lyy.usermanage.service;

import com.lyy.usermanage.bojo.LearnResouce;

import java.util.List;
import java.util.Map;

/**
 * Created by Lee on 2018/4/10.
 */
public interface LearnService {
    int add(LearnResouce learnResouce);
    int update(LearnResouce learnResouce);
    int deleteByIds(String[] ids);
    LearnResouce queryLearnResouceById(Long learnResouce);
//    List<LearnResouce> queryLearnResouceList(Map<String, Object> params);
}
