package com.njq.demo3.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by NIJIAQI on 2017/10/7.
 * Spring声明式测试类——基于AspectJ的XML方式
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context3.xml")
public class SpringDemo3 {
    /**
     * 注入代理类：因为代理类增强了
     */
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo1() {
        accountService.transfer("aaa","bbb",200d);
    }
}
