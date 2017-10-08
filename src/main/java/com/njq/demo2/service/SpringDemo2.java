package com.njq.demo2.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by NIJIAQI on 2017/10/7.
 * Spring声明式测试类——基于TransactionProxyFactoryBean的方式
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context2.xml")
public class SpringDemo2 {
    /**
     * 注入代理类：因为代理类增强了
     */
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;

    @Test
    public void demo1() {
        accountService.transfer("aaa","bbb",200d);
    }
}
