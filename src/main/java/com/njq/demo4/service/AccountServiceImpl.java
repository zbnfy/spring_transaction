package com.njq.demo4.service;

import com.njq.demo4.dao.AccountDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by NIJIAQI on 2017/10/7.
 * 转账案例的实现类
 */

/**
 * Transactional属性
 * propagation :事务传播行为
 *isolation   :事务隔离级别
 *read-only   :只读
 *rollback-for:案发时哪些异常回滚
 *no-rollback-for:发生哪些异常不回滚
 *timeout     :过期信息
 */
@Transactional
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
        //int i = 1 / 0;
        accountDao.inMoney(in,money);
    }
}
