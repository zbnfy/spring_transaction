package com.njq.demo1.dao;

/**
 * Created by NIJIAQI on 2017/10/7.
 */
public interface AccountDao {
    /**
     * @param out 转出账号
     * @param money  转出金额
     */
    public void outMonry(String out,Double money);

    /**
     * @param in  转入账号
     * @param money  转入金额
     */
    public void inMoney(String in,Double money);
}
