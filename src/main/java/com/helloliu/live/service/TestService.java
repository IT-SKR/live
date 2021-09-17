package com.helloliu.live.service;

import com.helloliu.live.domain.Test;
import com.helloliu.live.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return  testMapper.list();
    }
}
