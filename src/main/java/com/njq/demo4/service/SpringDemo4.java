package com.njq.demo4.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by NIJIAQI on 2017/10/7.
 * Spring编程式测试类——基于注解的事务管理方式
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context4.xml")
public class SpringDemo4 {
    //测试业务层
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo1() {
        accountService.transfer("aaa","bbb",200d);
    }
}
