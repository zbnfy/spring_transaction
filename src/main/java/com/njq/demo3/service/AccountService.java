package com.njq.demo3.service;

/**
 * Created by NIJIAQI on 2017/10/7.
 * 转账案例的业务接口
 */
public interface AccountService {
    /**
     * @param out 转出账号
     * @param in  转入账号
     * @param money  转账金额
     */
    public void transfer(String out, String in, Double money);
}
