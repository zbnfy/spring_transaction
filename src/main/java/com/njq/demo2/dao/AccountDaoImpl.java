package com.njq.demo2.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by NIJIAQI on 2017/10/7.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    /**
     * @param out 转出账号
     * @param money  转出金额
     */
    public void outMonry(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql,money,out);
    }

    /**
     * @param in  转入账号
     * @param money  转入金额
     */
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql,money,in);
    }

}
