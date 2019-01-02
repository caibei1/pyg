package com.pyg.dao;

import com.pyg.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private UserMapper mapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:conf/applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(UserMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void insert() {
        User u = new User();
//        u.setId();
        u.setName("q");
        int i = mapper.insert(u);
        System.out.println(i);
    }
}