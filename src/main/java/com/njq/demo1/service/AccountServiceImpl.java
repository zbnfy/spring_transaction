package com.njq.demo1.service;

import com.njq.demo1.dao.AccountDao;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by NIJIAQI on 2017/10/7.
 * 转账案例的实现类
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    //注入事务管理的模板
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    /**
     * @param out 转出账号
     * @param in  转入账号
     * @param money  转账金额
     */
    public void transfer(final String out,final String in,final Double money) {
        accountDao.outMonry(out,money);
        accountDao.inMoney(in,money);
    }
}
